package ua.nure.recipeapp.services;

import ua.nure.recipeapp.commands.RecipeCommand;
import ua.nure.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand findCommandById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long id);
}
