package com.company;

import java.io.*;

public class ProductsDaoCsvImplementation implements ProductsDao{


    @Override
    public void remove(String product) throws IOException {

    }

    @Override
    public void replace(String product1, String product2) throws IOException {

    }



    @Override
    public boolean exists(String product) throws IOException {
        boolean exists = false;
        File file = new File("products.csv");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        String[] arr;
        String nameofelement;
        while (str != null){
            arr = str.split(", ");
            nameofelement = arr[0];
            if (nameofelement.equals(product)){
                exists = true;
            }
            str = br.readLine();

        }
        return exists;
    }

    @Override
    public void add(Product product) throws IOException {
        File file = new File("products.csv");
        Writer writer = new FileWriter(file, true);
        BufferedWriter wr = new BufferedWriter(writer);
        wr.write(product.name + ", " + product.supplierName + ", " + product.price);
        wr.flush();
    }

    @Override
    public int getprice(String productName) throws IOException{
        File file = new File("products.csv");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        while (str != null) {
            String[] arr = str.split(", ");
            if (arr[0].equals(productName)) {
                return Integer.valueOf(arr[1]);
            }
            str = br.readLine();
        }
        return 0;
    }
}