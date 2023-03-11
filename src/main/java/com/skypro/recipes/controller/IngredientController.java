package com.skypro.recipes.controller;
import com.skypro.recipes.model.Ingredient;
import com.skypro.recipes.service.IngredientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/getingredient")
    public Ingredient getIngredient(@RequestParam Long idIng) {
        return ingredientService.getIngredient(idIng);
    }

    @GetMapping("/addingredient")
    public Ingredient addNewIngredient(@RequestParam Ingredient ingredient) {
        return ingredientService.addNewIngredient(ingredient);
    }
    @GetMapping
    public ResponseEntity<Map<Long, Ingredient>> getAllIngredient() {
        Map<Long, Ingredient> ingredientsL = ingredientService.getAllIngredient();
        if (ingredientsL == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ingredientsL);
    }
    @PutMapping
    public ResponseEntity<Ingredient> putIngredient(@PathVariable Long idIng, @RequestBody Ingredient ingredient) {
        Ingredient ingredient1 = ingredientService.putIngredient(idIng, ingredient);
        if (ingredient1 == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ingredient);
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteIngredient(@PathVariable Long idIng) {
        if (ingredientService.deleteIngredient(idIng)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
