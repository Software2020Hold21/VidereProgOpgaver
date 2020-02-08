package Lektion2;

public class Main {
    public static void main(String[] args) {
        IData data = new Data();
        IFunktionalitet funktionalitet = new Funktionalitet(data);
        TextUserInterface textUserInterface = new TextUserInterface(funktionalitet);
        textUserInterface.readCPR();

    }


}
