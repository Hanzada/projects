package com.company;

public class computer {
    private String name;
    private int ram;
    private int hdd;
    private double weight;
    private String username;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    private String program;

    computer(String name, int ram, int hdd, double weight, String username){
        this.name=name;
        this.ram=ram;
        this.hdd=hdd;
        this.weight=weight;
        this.username=username;
    }


    private String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    private String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    private int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram>0){
        this.ram = ram;}
        else {
            System.out.println("RAM должно быть больше нуля");
        }
    }

    private double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void on(){
        System.out.println("Я включился");
    }
    void information(){
        print("Мое имя"+getName());
        print("Мое RAM"+getRam());
        print("Мое Hdd"+getHdd());
        print("Мое weight"+getWeight());
        print("Мое username"+getUsername());
    }
    private  void  print(String str){
        System.out.println(str);
    }
}
