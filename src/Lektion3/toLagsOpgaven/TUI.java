package Lektion3.toLagsOpgaven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TUI implements IUI {
    private IData data;
    private Scanner scan = new Scanner(System.in);


    public TUI(IData data){
        this.data = data;
    }


    @Override
    public void showMenu() {
        System.out.println("\nDette er dine valgmuligheder:\n1. Vis ingredienser\n2. Vis en bestemt ingrediens\n3. Ændr ingrediens\n4. Opret ny ingrediens");
        int selection = scan.nextInt();
        switch (selection){
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

    @Override
    public void showIngredients() {
        String[] ingredients = data.getAllIngredients();
        for (int i =0;i<ingredients.length;i++){
            System.out.println(ingredients[i]);
        }
    }

    @Override
    public void showIngredient() {
        System.out.println("Indtast id på den ønskede ingrediens");
        int selectedId = getUserInt();
        try {
            System.out.println("Navn: " + data.getIngredientName(selectedId) + "\nMængde: " + data.getIngredientAmount(selectedId));
        } catch (IngredientNotFoundException e) {
            System.out.println("Der er ingen ingrediens med det indtastede ID.");
        }
    }

    @Override
    public void changeIngredient() {
        System.out.println("Indtast id på den ønskede ingrediens");
        int selectedId = getUserInt();
        System.out.println("Hvad ønsker du at ændre?\n1. Navn \n2. Mængde");
        int selectedAttribute = scan.nextInt();
        switch (selectedAttribute){
            case 1:
                System.out.println("Hvad ønsker du at ændre navnet til?");
                try {
                    data.setIngredientName(selectedId,scan.next());
                } catch (IngredientNotFoundException e){
                    System.out.println("Der findes ingen ingrediens i databasen med det ID.");
                }
                break;
            case 2:
                System.out.println("Hvad ønsker du at ændre mængden til?");
                try {
                    data.setIngredientAmount(selectedId,scan.nextInt());
                } catch (IngredientNotFoundException e){
                    System.out.println("Der findes ingen ingrediens i databasen med det ID.");
                }
                break;
        }

    }

    @Override
    public void createIngredient() {
        System.out.println("Indtast det navn, du vil oprette ingrediensen med");
        String name = scan.next();
        System.out.println("Indtast mængden af ingrediensen.");
        int amount = getUserInt();
        System.out.println("Indtast ønsket id for ingrediensen.");
        int id = getUserInt();

        data.createIngredient(id,name,amount);
    }

    public int getUserInt(){
        Scanner scan = new Scanner(System.in);
        while(true){
            try{
                return scan.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Inputtet skal være et heltal - Prøv igen.");
                return getUserInt();
            }
        }
    }

}
