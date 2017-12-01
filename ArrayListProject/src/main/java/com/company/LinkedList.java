package com.company;

public class LinkedList<T> {
    private Node<T> head;
    private int count;

    public LinkedList() {
        count = 0;
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
            //FIXME implement returning real element
            return null;
        }
    }

    void remove(int i) {
        Node<T> curNode = head;
        if (head != null) {
            if (i > 0) {
                if (i < count) {
                    int j = 0;
                    i--;
                    while (j != i) {
                        curNode = curNode.getNext();
                        j++;
                    }
                    Node<T> elemToBeNext = curNode.getNext().getNext();
                    curNode.setNext(elemToBeNext);
                    count--;
                }
            } else {
                head = head.getNext();
                count--;
            }
        }
    }

    int size() {
        return count;
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



















