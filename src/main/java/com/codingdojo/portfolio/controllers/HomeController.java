package com.codingdojo.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/about_me")
	public String about() {
		return "me.html";
	}
	
	@RequestMapping("/my_projects")
	public String my_projects() {
		return "projects.html";
	}
	
	@RequestMapping("/project_page")
	public String project_page() {
		return "projectpage.html";
	}
}
