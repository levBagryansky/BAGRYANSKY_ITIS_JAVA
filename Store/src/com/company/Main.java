package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ProductNotFoundException {
        File file = new File("products.csv");
        ProductsDao dao = new ProductsDaoCsvImplementation();
        System.out.println(dao.getprice("яблоки"));

        //Product product = new Product("хлеб", 40, "Хлебзавод1");
        //dao.add(product);

        System.out.println(dao.exists("хлеб"));
    }
}