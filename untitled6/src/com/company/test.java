package com.company;

import java.util.Scanner;

public class test {

    static void answer(String ques,String v1,String v2,String v3,int answ){
        main main=new main();
        Resultat resultat=new Resultat();

        main.print(ques);
        main.print("a)"+v1);
        main.print("b)"+v2);
        main.print("c)"+v3);
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        if (a==answ)
        { main.print("Дурыс");
            resultat.setBall(resultat.getBall()+10);
            resultat.setSum(resultat.getSum()+1);
        }else if (0<a || a>3){
            main.print("Ондай вариант жок кайта жауап бериниз!");


        }else
            main.print("Дурыс емес");


    }
}
