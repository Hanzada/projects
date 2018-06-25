package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;


public class main {
    public static void main(String[] arg){
        String ques;
        test test=new test();
        Resultat resultat=new Resultat();
      test.answer("Сколько мне лет,","18","19","20",2);

      test.answer("Сколько мне лет,","18","19","20",2);
      test.answer("Сколько мне лет,","18","19","20",2);
      print("Вы ответили на "+resultat.getSum()+" вопросов");
      print("Вы набрали "+resultat.getBall()+"%");
    }







    static void print(String str){
        System.out.println(str+"\n");
    }


}
