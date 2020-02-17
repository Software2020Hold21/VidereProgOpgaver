package Lektion3.BmiOpgaven;

public class Funktionalitet implements IFunktionalitet {
    private IData data;

    public Funktionalitet(IData data){
        this.data = data;
    }


    // beregn BMI udfra personens CPR-nr
    public double getBMI(String cpr) throws DataException{
        double hoejde = data.getHoejde(cpr);
        double vaegt = data.getVaegt(cpr);
        double BMI = vaegt/(hoejde*hoejde);
        return BMI;
    }

    // returnér en tekst der beskriver BMI intervallet
    public String getTextualBMI(String cpr) throws DataException{
        double BMI = getBMI(cpr);
        String textualBMI = "Ukendt";
        if (BMI< 18.5){
            textualBMI = "Du vejer for lidt";
        } else if (BMI < 25){
            textualBMI = "Din vægt er passende";
        } else if (BMI < 30){
            textualBMI = "Du er overvægtig";
        } else {
            textualBMI = "Du er svært overvægtig";
        }

        return textualBMI;

    }

    // returnér person navn udfra CPR-nr
    public String getNavn(String cpr) throws DataException{
        return data.getNavn(cpr);
    }


}
