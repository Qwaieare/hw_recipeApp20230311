package com.skypro.recipes.controller;
import com.skypro.recipes.model.Recipe;
import com.skypro.recipes.service.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/Recipe")
public class RecipeController {
    private RecipeService recipeService;


    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/{id}")
   public Recipe getRecipe(@PathVariable("id") Long idRec) {
         return recipeService.getRecipe(idRec);
    }

    @PostMapping
    public void addNewRecipe(@RequestBody Recipe recipe) {
        recipeService.addNewRecipe(recipe);
    }

    @GetMapping
    public  ResponseEntity<Map<Long, Recipe>> getAllRecipe()  {
        Map<Long, Recipe> recipeL = recipeService.getAllRecipe();
        if (recipeL == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recipeL);
    }

    @PutMapping("/{idRec}")
    public ResponseEntity<Recipe> putRecipe(@PathVariable Long idRec, @RequestBody Recipe recipe) {
        Recipe recipe1 = recipeService.putRecipe(idRec, recipe);
        if (recipe1 == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recipe);
    }
    @DeleteMapping("/{idRec}")
    public ResponseEntity<Void> deleteRecipe(@PathVariable Long idRec) {
        if (recipeService.deleteRecipe(idRec)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }


}
