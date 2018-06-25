package com.company;

class Notebook extends computer{

    Notebook(String name, int ram, int hdd, double weight, String username) {
        super(name, ram, hdd, weight, username);
    }
    void  off(){
        print("Я выключился");
    }
    private void print(String str){
        System.out.print(str);
    }
}
