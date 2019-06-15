package com.tranbaquan.specialjava.list;

public class MyList {
    private Node first;
    private Node last;

    public MyList() {
        this.first = new Node();
        this.last = new Node();
    }

    public void prepend(Object data) {
        Node n = new Node(null, first, data);
        this.first.setPrev(n);
        this.first = n;
    }

    public void append(Object data) {
        Node n = new Node(this.last, null, data);
        this.last.setNext(n);
        this.last = n;
    }

    @Override
    public String toString() {
        return "[" + first + "]";
    }

    public static void main(String[] args) {
        MyList myList = new MyList();

        myList.prepend("abc");
        myList.prepend("bcd");
        myList.prepend("cde");
        myList.prepend("def");
        System.out.println(myList);
    }
}
