package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    double a=1,b=1,c=0,sum=0;

    for (int i=1;i<=100 ;i++){

        b++;
        c=a/b;
        System.out.println("a["+i+"]="+c);
        sum=sum+c;
    }
        System.out.println("SUMMA="+sum);
    }
}
