package com.tranbaquan.specialjava.big_number;

public class BigNumber {
    private byte[] numberArrays;
    private boolean positive;

    public BigNumber(String number) {
        positive = true;
        setNumber(number);
    }

    public String getNumber() {
        return null;
    }

    public void setNumber(String number) {
        int length = number.length();
        for (int i = 0; i < length; i++) {
        }
    }

    @Override
    public String toString() {
        return null;
    }

    public BigNumber plus(String other) {

        return null;
    }

    public static void main(String[] args) {
        String n1 = "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111115";
        String n2 = "1111111111111111111232111111111111111111111111111111111111111111111111111111111111111111111111119";
        BigNumber b1 = new BigNumber(n1);
        System.out.println(b1.plus(n2));
    }
}
