package ua.nure.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.nure.recipeapp.domain.Category;
import ua.nure.recipeapp.domain.UnitOfMeasure;
import ua.nure.recipeapp.repositories.CategoryRepository;
import ua.nure.recipeapp.repositories.UnitOfMeasureRepository;
import ua.nure.recipeapp.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
