package com.company;

public class LinkedList<T> {
    private Node<T> head;
    private int count;

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
    }

    T get(int i) {

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