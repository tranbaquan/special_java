package com.tranbaquan.specialjava.snack.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Map {
    private int[][] map;
    private Snack snack;
    private Food food;
    private Poison poison;
    private int size;

    public Map(int size) {
        this.size = size;
        this.map = new int[size][size];
        snack = new Snack(new Location(size / 2, size / 2));
        food = new Food(size);
        poison = new Poison(size);
    }

    public void draw() {
        this.map = new int[size][size];
        snack.draw(map);
        food.draw(map);
        poison.draw(map);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < map.length; i++) {
            s += Arrays.toString(map[i]) +"\n";
        }
        return s;
    }

    public static void main(String[] args) {
//        Map map = new Map(5);
//        map.draw();
//        System.out.println(map);
//        map.snack.move(Direction.UP);
//        map.draw();
//        System.out.println(map);
//        map.snack.move(Direction.LEFT);
//        map.draw();
//        System.out.println(map);
//        map.snack.move(Direction.UP);
//        map.draw();
//        System.out.println(map);

        PriorityQueue<String> s = new PriorityQueue<>();
        s.add("f");
        s.add("b");
        s.add("a");
        s.add("d");
        System.out.println(s.toString());
        System.out.println(6 >>> 1);

    }
}
