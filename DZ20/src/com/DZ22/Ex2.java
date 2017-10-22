package com.company;
import java.util.Scanner;

public class Ex2 {
    static void isit(String[] array) {
        int n = array.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (array[i].equals("str"))
                k++;
        }
        boolean h = false;
        if (k > 0)
            System.out.println("true");
        else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        String[] arr = {"g", "f", "t", "str", "o"};
        isit(arr);
    }
}
