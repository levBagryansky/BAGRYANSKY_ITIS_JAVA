package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your example: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        calcDAO dao = new calcDAOImplementation();
        String[] arr = str.split(" ");
        if (arr[1].equals("/") & arr[2].equals("0")){
            System.out.println("You can not /0");
        } else{

            if(arr[1].equals("+")){
                dao.plus(Integer.valueOf(arr[0]), Integer.valueOf(arr[2]));
            }
            if(arr[1].equals("-")){
                dao.minus(Integer.valueOf(arr[0]), Integer.valueOf(arr[2]));
            }
            if(arr[1].equals("*")){
                dao.multiply(Integer.valueOf(arr[0]), Integer.valueOf(arr[2]));
            }
            if(arr[1].equals("/")){
                dao.divide(Integer.valueOf(arr[0]), Integer.valueOf(arr[2]));
            }

        }
    }
}
