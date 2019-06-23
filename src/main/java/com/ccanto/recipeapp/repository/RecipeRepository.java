package com.ccanto.recipeapp.repository;

import com.ccanto.recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

	List<Recipe> findById(String id);

	List<Recipe> findByTitle(String title);

}
