package com.example.viikko2.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class Viikko2Controller {
	@GetMapping("/hello")
	public String welcomeMsg(@RequestParam (name="name") String name, @RequestParam (name="age") String age, Model model) {
		// ottaa vastaan kaksi parametriä muuttujiin name & age
		// luo model-olion, jolla viedään tietoa Thymeleafille
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}
}
