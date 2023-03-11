package com.skypro.recipes.model;

public class Ingredient {

    private String nameIngredient;
    private int number;
    private String measurement;

    public Ingredient(String nameIngredient, int number, String measurement) {
        this.nameIngredient = nameIngredient;
        this.number = number;
        this.measurement = measurement;
    }

    public String getNameIngredient() {
        return nameIngredient;
    }

    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }
}
