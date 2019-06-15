package com.tranbaquan.specialjava.snack.model;

import java.util.Random;

public abstract class Component {
    protected Location location;
    protected ComponentType type;

    public Component(int size) {
        random(size);
    }


    public Component(Location location) {
        this.location = location;
    }

    public void random(int size) {
        Random r = new Random();
        location = new Location(r.nextInt(size), r.nextInt(size));
    }

    public void draw(int[][] map) {
        map[location.getX()][location.getY()] = type.getValue();
    }
}
