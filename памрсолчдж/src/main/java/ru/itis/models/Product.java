package ru.itis.models;

public class Product {
    private int id;
    private String name;
    private String factory;
    private int price;
    private int count;

    public Product(int id, String name, String factory, int price, int count) {
        this.id = id;
        this.name = name;
        this.factory = factory;
        this.price = price;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", factory='" + factory + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
