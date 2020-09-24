package ua.nure.recipeapp.services;

import ua.nure.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
