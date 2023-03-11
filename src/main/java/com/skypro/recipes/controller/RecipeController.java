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

    @GetMapping("/getrecipe")
   public Recipe getRecipe(@RequestParam Long idRec) {
        return recipeService.getRecipe(idRec);
    }

    @GetMapping("/addrecipe")
    public void addNewRecipe(@RequestParam Recipe recipe) {
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

    @PutMapping
    public ResponseEntity<Recipe> putRecipe(@PathVariable Long idRec, @RequestBody Recipe recipe) {
        Recipe recipe1 = recipeService.putRecipe(idRec, recipe);
        if (recipe1 == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recipe);
    }
    @DeleteMapping("/idRec")
    public ResponseEntity<Void> deleteRecipe(@PathVariable Long idRec) {
        if (recipeService.deleteRecipe(idRec)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }


}
