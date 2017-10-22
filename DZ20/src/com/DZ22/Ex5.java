package com.company;

public class Ex5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 9};
        int[] arr2 = {1, 2, 5, 2, 4, 9};
        System.out.println(repeat(arr1));
        System.out.println(repeat(arr2));
    }

    static boolean repeat(int[] arr){
        boolean k = false;
        for(int i = 0; i < arr.length & k ==false; i++){
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                    k = true;
                }
            }
        }
        return k;
    }
}
