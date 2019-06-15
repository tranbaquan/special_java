package com.tranbaquan.specialjava.snack.model;

public class Poison extends Component {
    public Poison(int size) {
        super(size);
        this.type = ComponentType.POISON;
    }

    public Poison(Location location) {
        super(location);
        this.type = ComponentType.POISON;
    }
}
