package Lektion2;

import java.util.Scanner;

public class TextUserInterface {

    private IFunktionalitet funk;

    public TextUserInterface(IFunktionalitet funk){
        this.funk = funk;

    }

    public void readCPR(){
        boolean notDone = true;
        Scanner scanner = new Scanner(System.in);
        String CprInput;
        double BMI = 0.0;
        while (notDone){
            System.out.println("Indtast CPR-nummeret på den person, du ønsker BMI beregnet for.");
            CprInput = scanner.next();
            BMI = funk.getBMI(CprInput);
            if (BMI < 0 ){
                System.out.println("Det indtastede CPR-nummer findes ikke i databasen.");
            } else {
                notDone = false;
            }
        }

        System.out.println("BMI: " + BMI);
    }





}
