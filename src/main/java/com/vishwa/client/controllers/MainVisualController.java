package com.vishwa.client.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainVisualController {

	@GetMapping("/home")
	public ModelAndView getHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home.html");
		return mv;
	}
}
