package ru.itis;

import ru.itis.dao.ProductsDao;
import ru.itis.dao.ProductsDaoImpl;
import ru.itis.models.Product;

public class Main {
    public static void main(String[] args) {
        ProductsDao dao = new ProductsDaoImpl();
        Product p = dao.getProduct(1);
        System.out.println(p);
    }
}
