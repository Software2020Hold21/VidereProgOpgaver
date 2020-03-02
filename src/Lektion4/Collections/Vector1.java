package Lektion4.Collections;

public class Vector1 implements IVector, Comparable<Vector1>{
    private double x;
    private double y;

    public Vector1(double x, double y){
        this.x = x;
        this.y=y;
    }

    public IVector times(double k) {
        return new Vector1(this.x * k, this.y*k);
    }

    public IVector add(IVector v2) {
        double newX= this.x + ((Vector1)v2).getX();
        double newY = this.y + ((Vector1)v2).getY();
        return new Vector1(newX,newY);
    }

    public boolean equals(IVector v2) {
        return (this.x == ((Vector1)v2).getX() && this.y == ((Vector1)v2).getY());
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }


    @Override
    public int compareTo(Vector1 v2) {
        double lv1 = Math.sqrt(this.x*this.x+this.y*this.y);
        double lv2 = Math.sqrt((v2.getX())*v2.getX()+v2.y*v2.y);


        //BEmærk at man burde bruge Double.compare() for at tage højde for, at to doubles som i praksis
        //er ens, ikke nødvendigvis er "lig" hinanden med "=="
        if (lv1==lv2){
            return 0;
        } else if (lv1 > lv2) {
            return 1;
        } else {
            return -1;
        }


    }

    public String toString(){
        return "x: " + this.x +"\ny: " + this.y + "\n";
    }
}
