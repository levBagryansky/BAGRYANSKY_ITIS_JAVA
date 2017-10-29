package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ProductsDao dao = new ProductsDaoTxtImplementation();
//        File file = new File("products.txt");
//        Reader reader = new FileReader(file);
//        BufferedReader br = new BufferedReader(reader);
//        String str = br.readLine();
//        String str1 = br.readLine();
//        String str2 = br.readLine();
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println(str2);
        dao.remove("rom");
    }
}