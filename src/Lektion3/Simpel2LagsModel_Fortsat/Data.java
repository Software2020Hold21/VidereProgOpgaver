package Lektion3.Simpel2LagsModel_Fortsat;

import java.util.ArrayList;

public class Data implements IData {
    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

    public Data(){
        ingredients.add(new Ingredient(1, "flormelis", 60));
        ingredients.add(new Ingredient(2, "mel", 240));
        ingredients.add(new Ingredient(3, "smør", 185));

    }


    private class Ingredient {
        int id;
        String name;
        int amount;

        Ingredient(int id, String name, int amount) {
            this.id = id;
            this.name=name;
            this.amount=amount;
        }

        @Override
        public String toString() {
            return "Ingrediens id = "+id+", navn = "+name+", amount = "+amount;

        }
    }

    @Override
    public String[] getAllIngredients() {
        String[] ingredientsNames = new String[ingredients.size()];
        for (int i = 0; i <ingredients.size() ; i++) {
            ingredientsNames[i]=ingredients.get(i).toString();
        }
        return ingredientsNames;

    }

    @Override
    public String getIngredientName(int id) throws IngredientNotFoundException {
        String ingredientName = "";
        for (int i = 0; i < ingredients.size(); i++) {
            if(ingredients.get(i).id==id) {
                ingredientName = ingredients.get(i).toString();
                return ingredientName;
            }
        }
        throw new IngredientNotFoundException("Ugyldigt ID");
    }

    @Override
    public int getIngredientAmount(int id) throws IngredientNotFoundException {
        int amount =-1;
        for (int i = 0; i < ingredients.size(); i++) {
            if(ingredients.get(i).id==id)
                amount=ingredients.get(i).amount;
            return amount;

        }
        throw new IngredientNotFoundException("Ugyldigt ID");

    }

    @Override
    public void setIngredientName(int id, String name) throws IngredientNotFoundException{
        boolean succes=false;
        for (int i = 0; i < ingredients.size(); i++) {
            if(ingredients.get(i).id==id) {
                ingredients.get(i).name = name;
                succes=true;
            }
        }
        if(!succes)
            throw new IngredientNotFoundException("Ugyldigt ID");
    }

    @Override
    public void setIngredientAmount(int id, int amount) throws IngredientNotFoundException{
        boolean succes=false;
        for (int i = 0; i < ingredients.size(); i++) {
            if(ingredients.get(i).id==id) {
                ingredients.get(i).amount = amount;
                succes=true;
            }
            if(!succes)
                    throw new IngredientNotFoundException("Ugyldigt ID");
        }
    }

    @Override
    public void createIngredient(int id, String name, int amount) {
        ingredients.add(new Ingredient(id,name,amount));
    }
}