package com.company;


public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(15);
        list.add(9);
        list.add(5);
        list.add(0);
        System.out.println(list);
        System.out.print("третий элемент:");
        System.out.println(list.get(3));
        list.remove(2);
        System.out.println(list);

    }
}