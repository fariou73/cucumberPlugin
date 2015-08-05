package com.simbirsoft.plugin;

import com.simbirsoft.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Main implements PluginIngredientsInterface {

    public static void main(String[] args) {

    }

    @Override
    public List<IngredientInterface> getIngredients() {
        List<IngredientInterface> ingridients = new ArrayList<IngredientInterface>();
        ingridients.add(new Ingredient("Cucumber", 100));
        return ingridients;
    }
}
