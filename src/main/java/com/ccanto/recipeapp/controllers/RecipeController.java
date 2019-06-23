package com.ccanto.recipeapp.controllers;

import com.ccanto.recipeapp.exception.RecipeNotFoundException;
import com.ccanto.recipeapp.model.Recipe;
import com.ccanto.recipeapp.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class RecipeController {

	@Autowired
	private RecipeRepository recipeRepository;

	@GetMapping
	public Iterable findAll() {
		return recipeRepository.findAll();
	}

	@GetMapping("/title/{recipeTitle}")
	public List<Recipe> findByTitle(@PathVariable String bookTitle) {
		return recipeRepository.findByTitle(bookTitle);
	}

	@GetMapping("/{id}")
	public Recipe findOne(@PathVariable Long id) {
		return recipeRepository.findById(id)
				.orElseThrow(RecipeNotFoundException::new);
	}
}
