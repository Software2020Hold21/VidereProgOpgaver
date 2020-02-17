package Lektion3.BmiOpgaven;

public class Main {
    public static void main(String[] args) throws DataException {
        IData data = new Data();
        IFunktionalitet funktionalitet = new Funktionalitet(data);
        TextUserInterface textUserInterface = new TextUserInterface(funktionalitet);
        textUserInterface.readCPR();
    }
}
