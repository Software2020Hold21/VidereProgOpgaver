package Lektion4;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        IVector[] vectors = new IVector[6];

        //Tilføj elementer til listen
        vectors[0] = new Vector(1, 1);
        vectors[1] = new Vector(400, 278);
        vectors[2] = new Vector(3, 7);
        vectors[3] = new Vector(1, 2);
        vectors[4] = (Vector) vectors[0].add(vectors[2]); //Vi er nødt til at caste til Vector
        vectors[5] = (  Vector) vectors[0].times(4); //Vi er nødt til at caste til Vector

        System.out.println("vectors før sortering: " + Arrays.toString(vectors));

        //Sortor listen
        //Arrays.sort(vectors);
        //System.out.println("vectors efter sortering: " + Arrays.toString(vectors));

        //Sammenlign to vektorer
        Vector v1 = new Vector(1.4, 2.3);
        Vector v2 = new Vector(1.4, 2.3);
        Vector v3 = new Vector(2, 1);
        Vector v4 = new Vector(1, 2);

        System.out.println(v1 + " er lig " + v2 + ": " + v1.equals(v2));
        System.out.println(v3 + " er lig " + v4 + ": " + v3.equals(v4));
        System.out.println("ADD" + v3);
        System.out.println(v3);

    }
}
