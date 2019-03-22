package com.tranbaquan.specialjava.recursive;

public class Recursion {
    public void decToBin(int n) {
        if (n == 0) {
            return;
        }
        decToBin(n / 2);
        System.out.print(n % 2);
    }

    public int digits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + digits(n / 10);
    }

    public void reverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n % 10);
        reverse(n / 10);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        recursion.decToBin(10);
        System.out.println();
        System.out.println(recursion.digits(1000));
        recursion.reverse(1080);
    }
}
