package Lektion3.toLagsOpgaven;

import java.util.ArrayList;

public class DemoData implements IData {

    private class Ingredient {
        int id;
        String name;
        int amount;

        Ingredient(int id, String name, int amount) {
            this.id = id;
            this.name = name;
            this.amount = amount;
        }

        @Override
        public String toString() {
            String output = "id: " + id + " , navn: " + name +", mængde: " +  amount;
            return output;
        }
    }

    private ArrayList<Ingredient> ingredients;

    public DemoData() {
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(0, "sukker", 10));
        ingredients.add(new Ingredient(1, "flormelis", 60));
        ingredients.add(new Ingredient(2, "mel", 240));
        ingredients.add(new Ingredient(3, "smør", 185));
    }

    @Override
    public String[] getAllIngredients() {
        String[] ingredientNames = new String[ingredients.size()];
        for (int i=0;i<ingredients.size();i++){
            ingredientNames[i] = ingredients.get(i).toString();
        }
        return ingredientNames;
    }

    @Override
    public String getIngredientName(int id) throws IngredientNotFoundException {
        for (int i = 0; i<ingredients.size();i++){
            if (this.ingredients.get(i).id == id){
                return this.ingredients.get(i).name;
            }
        }
        throw new IngredientNotFoundException("Ugyldigt ID");
    }

    @Override
    public int getIngredientAmount(int id) throws IngredientNotFoundException{
        for (int i = 0; i<ingredients.size();i++){
            if (this.ingredients.get(i).id == id){
                return this.ingredients.get(i).amount;
            }
        }
        throw new IngredientNotFoundException("Ugyldigt ID");
    }

    @Override
    public void setIngredientName(int id, String name) throws IngredientNotFoundException{
        boolean succces = false;

        for (int i = 0; i<ingredients.size();i++){
            if (this.ingredients.get(i).id == id){
                this.ingredients.get(i).name = name;
                succces = true;
            }
        }
        if (!succces){
            throw new IngredientNotFoundException("Ugyldigt ID");
        }
    }

    @Override
    public void setIngredientAmount(int id, int amount) throws IngredientNotFoundException{
        boolean succces = false;
        for (int i = 0; i<ingredients.size();i++){
            if (this.ingredients.get(i).id == id){
                this.ingredients.get(i).amount = amount;
                succces = true;
            }
        }
        if (!succces){
            throw new IngredientNotFoundException("Ugyldigt ID");
        }
    }

    @Override
    public void createIngredient(int id, String name, int amount) {
        ingredients.add(new Ingredient(id, name, amount));
    }
}

