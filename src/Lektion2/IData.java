package Lektion2;

public interface IData {

    //Returner personens navn
    public String getNavn(String cpr);

    //Returner personens vægt
    public double getVaegt(String cpr);

    //Returner personens højde
    public double getHoejde(String cpr);

}
