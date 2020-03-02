package Lektion4.Collections;

public class Vector2 implements IVector{
    private double x;
    private double y;

    public Vector2(double x, double y){
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

    public int compareTo(Vector1 v2) {
        return 0;
    }
}
