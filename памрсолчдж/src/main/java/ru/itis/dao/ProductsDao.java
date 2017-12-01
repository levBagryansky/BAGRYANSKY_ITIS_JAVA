package ru.itis.dao;

import ru.itis.models.Product;

import java.util.List;

public interface ProductsDao {
    /**
     * возвращает продукт по id
     */
    Product getProduct(int id);

    List<Product> getAllProducts();

    void addProduct(Product product);
}
