package com.tranbaquan.specialjava.constructor;

public class Bottom extends Foo {
    long a;
    char b = 65;
    public Bottom(String s) {
        // compile error if didn't have this line.
        super(s);
        System.out.println("B");
    }

    public long sum(long a, long b) {
        char j = 65;
        return a+b;
    }
}
