package com.skypro.recipes.impl;
import com.skypro.recipes.model.Recipe;
import com.skypro.recipes.service.RecipeService;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
    public class RecipeServiceImpl implements RecipeService {

    private static Map<Long, Recipe> recipeL = new HashMap<>();
    private static Long idRec = 0L;

    @Override
    public Recipe addNewRecipe(Recipe recipe) {
        recipeL.putIfAbsent(idRec++, recipe);
        return recipe;
    }

    @Override
    public Recipe getRecipe(Long idRec) {
         return recipeL.get(idRec);
    }

    @Override
    public Map<Long, Recipe> getAllRecipe() {
        return recipeL;
    }

    @Override
    public Recipe putRecipe(Long idRec, Recipe recipe) {
        recipeL.putIfAbsent(idRec, recipe);
        return recipe;
    }

    @Override
    public boolean deleteRecipe(Long idRec) {
         return recipeL.remove(idRec) != null;
    }

}
