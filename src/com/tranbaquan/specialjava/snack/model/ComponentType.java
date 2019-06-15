package com.tranbaquan.specialjava.snack.model;

public enum  ComponentType {
    FOOD(1),
    POISON(-1),
    OBSTACLE(-2),
    SNACK(2);
    private final int value;

    ComponentType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
