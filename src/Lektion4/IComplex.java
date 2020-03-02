package Lektion4;

public interface IComplex {
    String toString();
    double abs();
    double phase();
    IComplex plus(IComplex b); //Hvorfor parameter
    IComplex minus(IComplex b);
    IComplex times(IComplex b);
    IComplex scale(double alpha);
    IComplex conjugate();
    IComplex reciprocal();

}