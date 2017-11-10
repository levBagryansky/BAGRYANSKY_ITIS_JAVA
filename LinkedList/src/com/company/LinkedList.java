package com.company;

public class LinkedList<T> {
    private Node<T> head;
    private int count;

    public LinkedList(){
        count = 0;
    }

    int count(){
        int count = 0;
        Node<T> cur  = head;
        while(cur != null){
            cur = cur.getNext();
            count++;
        }
        return count--;
    }

    void add(T elem) {
        Node<T> node = new Node<>(elem, null);
        if (head == null) {
            head = node;
        } else {
            Node<T> cur = head;
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(node);
        }
        count++;
    }

    T get(int i) {
        if (i < 0 || i >= count) {
            throw new IndexOutOfBoundsException("Incorrect index: " + i);
        } else {
            T element = null;
            Node<T> cur = head;
            for (int j = 0; j < i; j++) {
                cur = cur.getNext();
            }

            return cur.getValue();
        }
    }

    Node<T> getNode(int i){
        if (i < 0 || i >= count) {
            throw new IndexOutOfBoundsException("Incorrect index: " + i);
        } else {
            T element = null;
            Node<T> cur = head;
            for (int j = 0; j < i; j++) {
                cur = cur.getNext();
            }

            return cur;
        }
    }

    void remove (int i) {
        i--; // без этой операции удалит элемент, стоящий после того что надо
        Node<T> cur = head;
        for (int j = 0; j < i; j++) {
            cur = cur.getNext();
        }    // cur - iитый элемент
        Node<T> cur1 = head;
        for (int j = 0; j < i + 2; j++) {
            cur1 = cur1.getNext();
        }    // cur1 - послеследующий node от iитого
        // дальше надо просто прецепить cur1 к cur
        cur.next = cur1;
    }

    @Override
    public String toString() {
        String s = "LinkedList{";
        if (head != null) {
            Node<T> cur = head;
            while (cur.getNext() != null) {
                T value = cur.getValue();
//                s += value != null ? value.toString() : "null";
                if (value != null) {
                    s += value.toString();
                } else {
                    s += "null";
                }
                s += ", ";
                cur = cur.getNext();
            }
            s += cur.getValue() != null ? cur.getValue().toString() : "null";        }
        s += "}";
        return s;
    }

    private class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }
}