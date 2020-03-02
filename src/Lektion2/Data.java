package Lektion2;

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
    public String getIngredientName(int id) {
        String ingredientName = "";
        for (int i = 0; i < ingredients.size(); i++) {
            if(ingredients.get(i).id==id)
                ingredientName=ingredients.get(i).toString();
        }
        return ingredientName;
    }

    @Override
    public int getIngredientAmount(int id) {
        int amount =-1;
        for (int i = 0; i < ingredients.size(); i++) {
            if(ingredients.get(i).id==id)
                amount=ingredients.get(i).amount;
        }
        return amount;
    }

    @Override
    public void setIngredientName(int id, String name) {
        for (int i = 0; i < ingredients.size(); i++) {
            if(ingredients.get(i).id==id)
                ingredients.get(i).name=name;
        }
    }

    @Override
    public void setIngredientAmount(int id, int amount) {
        for (int i = 0; i < ingredients.size(); i++) {
            if(ingredients.get(i).id==id)
                ingredients.get(i).amount=amount;
        }
    }

    @Override
    public void createIngredient(int id, String name, int amount) {
        ingredients.add(new Ingredient(id,name,amount));
    }
}