package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.lang.model.util.Elements;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;


public class Main {

    public static void main(String[] args) throws IOException {


    Set<article> arcticleList=new HashSet<>();
    Document document= (Document) Jsoup.connect("https://www.4pda.ru").get();
        org.jsoup.select.Elements h2Elements=document.getElementsByAttributeValue("class","list-post-title");
        h2Elements.forEach(h2Element->{
            Element aElement=h2Element.child(0);
            String url=aElement.attr("href");
            String title=aElement.child(0).text();

            arcticleList.add(new article(url,title));



        });

        arcticleList.forEach(System.out::println);





        // write your code here
    }
}
class article{
    private String url;
    private String name;

    @Override
    public String toString() {
        return "article{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public article(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
