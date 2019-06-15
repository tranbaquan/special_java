package com.tranbaquan.specialjava.snack.model;

public class Obstacle extends Component {
    public Obstacle(int size) {
        super(size);
        this.type = ComponentType.OBSTACLE;
    }

    public Obstacle(Location location) {
        super(location);
        this.type = ComponentType.OBSTACLE;
    }
}
