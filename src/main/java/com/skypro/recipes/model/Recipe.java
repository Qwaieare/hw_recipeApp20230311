package com.skypro.recipes.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String nameOfRecipe;
    private int tame;
    private List<Ingredient> ingredient;
    private List<String> preparationStep;

    public Recipe(String nameOfRecipe, int tame, List<Ingredient> ingredient, List<String> preparationStep) {
        this.nameOfRecipe = nameOfRecipe;
        this.tame = tame;
        this.ingredient = ingredient;
        this.preparationStep = preparationStep;
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public void setNameOfRecipe(String nameOfRecipe) {
        this.nameOfRecipe = nameOfRecipe;
    }

    public int getTame() {
        return tame;
    }

    public void setTame(int tame) {
        this.tame = tame;
    }

    public List<Ingredient> getIngredient() {
        return ingredient;
    }

    public void setIngredient(List<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }

    public List<String> getPreparationStep() {
        return preparationStep;
    }

    public void setPreparationStep(List<String> preparationStep) {
        this.preparationStep = preparationStep;
    }
}
