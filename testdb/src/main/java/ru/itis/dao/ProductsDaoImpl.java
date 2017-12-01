package ru.itis.dao;

import ru.itis.models.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductsDaoImpl implements ProductsDao {
    Connection c;

    public ProductsDaoImpl() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        c = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/testdb",
                        "postgres", "postgres");
    }

    @Override
    public Product getProduct(int id) throws ClassNotFoundException, SQLException {
        Statement stmt = c.createStatement();
        String sql = "SELECT * FROM products WHERE id = " + id;
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        String name = rs.getString("name");
        String factory = rs.getString("factory");
        int price = rs.getInt("price");
        int count = rs.getInt("count");
        Product product = new Product(id, name, factory, price, count);
        stmt.close();
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public List<Product> getProductByFactory(String factory) throws SQLException {
        String sql = "SELECT * FROM products WHERE factory = ?;";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, factory);
        ResultSet rs = stmt.executeQuery(sql);
        List<Product> list = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int price = rs.getInt("price");
            int count = rs.getInt("count");
            Product product = new Product(id, name, factory, price, count);
            list.add(product);
        }
        return list;
    }

    @Override
    public void addProduct(Product product) {
        Statement stmt = c.createStatement();
        String sql = "INSERT" + product;
        ResultSet rs = stmt.executeQuery(sql);

    }

    @Override
    public void delete(int id) {
        String sql = "DELETE * FROM products WHERE id = " + id;
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery(sql);
    }

    @Override
    public void update(Product product) {

    }
}
