package Lektion4;

public class Vector implements IVector//  , Comparable<IVector>
    {
    private double x, y;
    
    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public IVector times(int i) {
        double x = this.x * i;
        double y = this.y * i;
        return new Vector(x,y);
    }

    @Override
    public IVector add(IVector v) {
        double x = this.x + v.getX();
        double y = this.y + v.getY();
        IVector v11;
        v11 = new Vector(x,y);
        return (IVector)v11;
    }

    @Override
    public boolean equals(IVector v) {
        if (this == v)
            return true;
        if (v == null)
            return false;

        return this.x == v.getX() && this.y == v.getY();
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }


//    public int compareTo(IVector o) {
//        /*
//         * Længden af vektoren kunne passende findes med en metode
//         */
//        double thisLength = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
//        double oLength = Math.sqrt(Math.pow(o.getX(),2) + Math.pow(o.getY(),2));
//        return Double.compare(thisLength, oLength);
//
}
