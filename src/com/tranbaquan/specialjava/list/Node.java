package com.tranbaquan.specialjava.list;

public class Node {
    private Node prev;
    private Node next;
    private Object data;

    public Node() {
    }

    public Node(Node prev, Node next, Object data) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        String s = "";
        if(prev != null) s = prev + s;
        s += data + ", ";
        if(next != null) s+= next;
        return s;
    }
}
