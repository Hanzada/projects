package main;

public class students {
    private int id;
    private String surname;
    private String name;
    private String fathername;
    private String group;
    private int age;

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getFathername() {
        return fathername;
    }

    void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getGroup() {
        return group;
    }

    void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }
    students(){

    }

    public students(String surname, String name, String fathername, String group, int age){
     this.surname=surname;
     this.name=name;
     this.fathername=fathername;
     this.group=group;
     this.age=age;
    }
    public students(int id,String surname, String name, String fathername, String group, int age){
        this.id=id;
        this.surname=surname;
        this.name=name;
        this.fathername=fathername;
        this.group=group;
        this.age=age;
    }

    @Override
    public String toString() {
        return "students{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fathername='" + fathername + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                '}';
    }
}
