package ru.itis;

import ru.itis.dao.ProductsDao;
import ru.itis.dao.ProductsDaoImpl;
import ru.itis.models.Product;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductsDao dao = new ProductsDaoImpl();
//        Product p = dao.getProduct(1);
//        System.out.println(p);
        List<Product> products = dao.getProductByFactory("Молокозавод 3'; DROP TABLE products; SELECT where 'abc' = 'abc");
        System.out.println(products);
    }
}
