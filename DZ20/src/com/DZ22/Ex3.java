package com.company;
import java.util.Scanner;

public class Ex3 {
    static int fact(int n){
        int f = 1;
        if(n == 1){
            return 1;
        }
        else{
            f = fact(n - 1) * n;
            return f;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find its nuber!: ");
        int number = sc.nextInt();
        System.out.print(number + "! = " + fact(number));
    }
}
