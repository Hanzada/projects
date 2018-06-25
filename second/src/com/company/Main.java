package com.company;

public class Main {

    public static void main(String[] args) {
	    computer comp=new computer("Lenovo",120,459,15.3,"biba");
        comp.information();
        Notebook not=new Notebook("Asus",789,596,126.5,"Beibarys");
        comp.on();
        not.off();
        comp.setName("Beiabrys");
        comp.information();

    }
}
