package com.tranbaquan.specialjava.storage;

import java.util.ArrayList;
import java.util.List;

public class MyDate {
    private int date;

    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDate() {
        return date;
    }


    public int getDay() {
        return this.date & 31;
    }

    public void setDay(int day) {
        date = date & ~31;
        date = date | day;
    }

    public int getMonth() {
        return (this.date >> 5) & 15;
    }

    public void setMonth(int month) {
        date = date & ~(15 << 5);
        date = date | (month << 5);
    }

    public int getYear() {
        return this.date >> 9;
    }

    public void setYear(int year) {
        date = date << 23;
        date = date >>> 23;
        date = date | (year << 9);
    }

    @Override
    public String toString() {
        return getDay() + "/" + getMonth() + "/" + getYear();
    }

    public static void main(String[] args) {
        MyDate date = new MyDate(9, 5, 2019);
        System.out.println(date);
        date.setMonth(2);
        System.out.println(date);
        date.setDay(6);
        System.out.println(date);


        MyDate d1 = new MyDate(20, 12, 2019);
        MyDate d2 = new MyDate(11, 11, 2018);
        MyDate d3 = new MyDate(26, 1, 2019);
        MyDate d4 = new MyDate(8, 2, 2020);
        MyDate d5 = new MyDate(4, 5, 2017);
        MyDate d6 = new MyDate(7, 7, 2018);
        MyDate d7 = new MyDate(22, 8, 2016);
        MyDate d8 = new MyDate(13, 9, 2019);
        MyDate d9 = new MyDate(28, 7, 2020);
        MyDate d10 = new MyDate(21, 11, 2019);

        List<MyDate> list = new ArrayList<>();
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d5);
        list.add(d6);
        list.add(d7);
        list.add(d8);
        list.add(d9);
        list.add(d10);
        list.sort(new MyDateComparator());

//        System.out.println(list);
    }
}
