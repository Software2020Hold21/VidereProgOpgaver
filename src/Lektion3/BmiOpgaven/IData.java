package Lektion3.BmiOpgaven;

public interface IData {

    //Returner personens navn
    public String getNavn(String cpr) throws DataException;

    //Returner personens vægt
    public double getVaegt(String cpr) throws DataException;

    //Returner personens højde
    public double getHoejde(String cpr) throws DataException;

}
