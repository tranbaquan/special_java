package com.tranbaquan.specialjava.snack.model;

public class Food extends Component {
    public Food(int size) {
        super(size);
        this.type = ComponentType.FOOD;
    }

    public Food(Location location) {
        super(location);
        this.type = ComponentType.FOOD;
    }
}
