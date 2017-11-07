package com.company;

import java.io.IOException;

public interface ProductsDao {
    boolean exists(String product) throws IOException;

    void add(Product product) throws IOException;

    int getprice(String productName) throws IOException;

    void remove(String product) throws IOException;

    void replace(String product1, String product2) throws IOException;

}