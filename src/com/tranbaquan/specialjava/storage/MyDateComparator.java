package com.tranbaquan.specialjava.storage;

import java.util.Comparator;

public class MyDateComparator implements Comparator<MyDate> {
    @Override
    public int compare(MyDate o1, MyDate o2) {
        return o1.getDate() - o2.getDate();
    }

}
