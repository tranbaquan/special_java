package com.tranbaquan.specialjava.snack.model;

import java.util.LinkedList;

public class Snack {
    private LinkedList<Location> locations;
    private Direction currentDirection;
    private ComponentType type;

    public Snack(Location center) {
        locations = new LinkedList<>();
        locations.add(center);
        locations.add(new Location(center.getX()+1, center.getY()));
        locations.add(new Location(center.getX()+2, center.getY()));
        currentDirection = Direction.UP;
        type = ComponentType.SNACK;
    }

    public void move(Direction next) {
        Location location = new Location(locations.getFirst().getX(), locations.getFirst().getY());
        location.changeLocation(next);
        locations.addFirst(location);
        locations.removeLast();
    }

    public void eat(Direction next) {
        Location location = locations.getFirst();
        location.changeLocation(next);
        locations.addFirst(location);
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void draw(int[][] map) {
        locations.stream().forEach(location ->
                map[location.getX()][location.getY()] = type.getValue()
        );
    }
}
