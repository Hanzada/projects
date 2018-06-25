package sample;

public class Product {
    private int id;
    private String name;
    private float price;
    private String addData;
    private byte[] picture;

    public Product(int id, String name, float price, String addData, byte[] picture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.addData = addData;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAddData() {
        return addData;
    }

    public void setAddData(String addData) {
        this.addData = addData;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}
