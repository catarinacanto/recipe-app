package com.ccanto.recipeapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppControler {

	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("appName", "recipes");
		return "home";
	}


}
