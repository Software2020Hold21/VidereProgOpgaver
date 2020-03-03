package Lektion4;

import java.util.Arrays;

// Test vectorklassen
public class TestVector {
    public void sort() {
        Vector[] vectors = new Vector[]{
            new Vector(1, 1),
            new Vector(400, 278),
            new Vector(3, 7),
            new Vector(1, 2)
        };
        Arrays.sort(vectors);
    }

    public void add() {
        Vector v = (Vector) new Vector(1, 1).add(new Vector(2, 2));
    }

    public void times() {
        Vector v = (Vector) new Vector(1, 2).times(5);
    }

    public void equals() {
        Vector v1 = new Vector(1, 2);
        Vector v2 = new Vector(1, 2);
    }
}
