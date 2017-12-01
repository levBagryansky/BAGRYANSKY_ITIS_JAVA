package ru.itis.dao;

import ru.itis.models.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductsDaoImpl implements ProductsDao {
    @Override
    public Product getProduct(int id) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgres.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgres://localhost:5432/tardis3",
                            "postgres", "postgres");
            stmt = c.createStatement();
            String sql = "SELECT * FROM products WHERE id = " + id;
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            String name = rs.getString("name");
            String factory = rs.getString("factory");
            int price = rs.getInt("price");
            int count = rs.getInt("count");
            Product product = new Product(id, name, factory, price, count);
            stmt.close();
            c.close();
            return product;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgres.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgres://localhost:5432/tardis3",
                            "postgres", "postgres");
            stmt = c.createStatement();
            String sql = "SELECT * FROM products WHERE id > -1";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            List<Product> list = new ArrayList<>();
            while(rs.next()) {
                String name = rs.getString("name");
                String factory = rs.getString("factory");
                int price = rs.getInt("price");
                int count = rs.getInt("count");
                int id = rs.getInt("id");
                Product product = new Product(id, name, factory, price, count);
                stmt.close();
                c.close();
                list.add(product);
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }
}
