package com.company;

public class ArrayList {
    Object[] elements;
    int count;

    public ArrayList(int capacity) {
        elements = new Object[capacity];
        count = 0;
    }

    Object get(int i){
       return elements[i];
    }

    /*если в массиве elements нет свободного места, следует создать
    * новый массив большей длины (например, больший в 2 раза),
    * поместить в него эл-ты из старого массива, и заменить старый на новый
    * */
    void add(Object o) {
        elements[count] = o;
        count++;
    }

    void remove(){}
}
