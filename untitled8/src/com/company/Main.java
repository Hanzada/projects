package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class Main {

    public static void main(String[] args) throws IOException {
        final Document document = Jsoup.connect("https://vk.com").get();
        System.out.println(document.title());
        Elements p = document.select("img");
        for (Element element : p) {
            System.out.println(element);
        }
        String query="https://vk.com";
        HttpsURLConnection connection=null;
        try {
        connection=(HttpsURLConnection) new URL(query).openConnection();
        connection.setRequestMethod("GET");
        connection.setUseCaches(false);
        connection.setConnectTimeout(250);
        connection.setReadTimeout(250);
        connection.connect();

        StringBuilder ab=new StringBuilder();
        if (HttpsURLConnection.HTTP_OK==connection.getResponseCode()){
            BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream(),"cp1251"));
            String line;
            while ((line=in.readLine())!=null){
                ab.append(line);
                ab.append("\n");
            }
            System.out.println(ab.toString());
        }else{
            System.out.println("Fail:"+connection.getResponseCode()+","+connection.getResponseMessage());
        }

        }catch (Throwable throwable){
            throwable.printStackTrace();
        }finally {
            if (connection!=null){
                connection.disconnect();
            }
        }

    }
}
