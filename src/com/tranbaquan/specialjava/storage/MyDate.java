package com.tranbaquan.specialjava.storage;

public class MyDate {
    private int date;

    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
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

    public void setMonth(int month){
        date = date & ~(15 << 5);
        date = date | (month << 5);
    }

    public int getYear() {
        return this.date >> 9;
    }

    public void setYear(int year){
        date = date << 23;
        date = date >>> 23;
        date = date ^ (year << 9);
    }

    @Override
    public String toString() {
        return getDay() + "/" + getMonth() + "/" + getYear();
    }

    public static void main(String[] args) {
        MyDate date = new MyDate(3, 4, 2019);
        System.out.println(date.toString());
        date.setDay(29);
        date.setMonth(10);
        date.setYear(2018);
        System.out.println(date.toString());
    }
}
