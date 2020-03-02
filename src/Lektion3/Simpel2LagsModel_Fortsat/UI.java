package Lektion3.Simpel2LagsModel_Fortsat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI implements IUI {
    Scanner scanner = new Scanner(System.in);

   IData data = new Data();

    @Override
    public void showMenu() {
        System.out.println("Hvilken af følgende valgmuligheder ønsker du at bruge");
        System.out.println("1: Se alle ingredienser");
        System.out.println("2: Se en bestemt ingrediens ud fra ID");
        System.out.println("3: Vælge ingrediens ud fra id, dernæst vælge et felt og så indtaste en ny værdi for denne");
        System.out.println("4: Indtaste værdier til en ny ingrediens");
        System.out.println("Indtast dit valg");
        int valg = scanner.nextInt();
        switch (valg){
            case 1:
                showIngredients();
            break;
            case 2:
                showIngredient();
            break;
            case 3:
                changeIngredient();
            break;
            case 4:
                createIngredient();
            break;
        }
    }

    public int getIdFromUser(){
        int id=-1;
        try{
            id = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Du intastede ikke et korrekt tal");
            System.out.println("Indtast et nyt ID");
            getIdFromUser();
        }
        return id;
    }

    @Override
    public void showIngredients() {
        String[] allIngredients = data.getAllIngredients();
        for (int i = 0; i <allIngredients.length ; i++) {
            System.out.println("Ingrediens nummer " + (i+1) + ": " + allIngredients[i]);
        }
    }

    @Override
    public void showIngredient() {
        System.out.println("Indtast id på den ingrediens du ønsker at se");
        int id = getIdFromUser();
        try {
            System.out.println(data.getIngredientName(id));
        }catch (IngredientNotFoundException e){
            System.out.println("Du har indtastet et id på en ingrediens der ikke eksistere");
        }
    }

    @Override
    public void changeIngredient() {
        System.out.println("Vælge id for ingrediens: ");
        int id = getIdFromUser();
        System.out.println("Indtast 1 for at ændre navn eller 2 for at ændre mængde");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Indtast nyt navn");
                String name = scanner.nextLine();
                try{
                    data.setIngredientName(id,name);
                }
                catch (IngredientNotFoundException e){
                    System.out.println("Du har indtastet et id på en ingrediens der ikke eksistere");
                }
            break;
            case 2:
                System.out.println("Indtast ny mængde");
                int amount = scanner.nextInt();
                try {
                    data.setIngredientAmount(id, amount);
                }catch (IngredientNotFoundException e){
                    System.out.println("Du har indtaset et id på en ingrediens der ikke eksistere");
                }
            break;
        }
    }

    @Override
    public void createIngredient() {
        System.out.println("Indtast navnet på den ingrediens du ønsker at oprette: ");
        String name = scanner.nextLine();
        System.out.println("Indtast id på ingrediensen ");
        int id = getIdFromUser();
        System.out.println("Indast mængde på ingrediensen ");
        int amount = scanner.nextInt();
        data.createIngredient(id,name,amount);
    }
}
