package ru.itis.dao;

import ru.itis.models.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductsDao {
    /**
     * возвращает продукт по id
     */
    Product getProduct(int id) throws ClassNotFoundException, SQLException;

    List<Product> getAllProducts();

    List<Product> getProductByFactory(String factory) throws SQLException;

    void addProduct(Product product);

    void delete(int id);

    void update(Product product);
}
