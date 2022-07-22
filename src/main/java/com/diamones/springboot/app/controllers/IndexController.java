package com.diamones.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
		
	@RequestMapping({"/index","","/"})
	public String index(Model model) {
		
		model.addAttribute("titulo", "Mi primer página con Spring");
		return "index";
	}
	
	@RequestMapping("/segunda")
	public String segundaPagina(Model model) {
		
		model.addAttribute("paginaDos","Esta es la numero 2");
		return "/segunda";
	}
	
	@RequestMapping("/variables/{texto}")
	public String variableTexto(@PathVariable String texto,  Model model) {
		
		model.addAttribute("titulo", "variables en el path");
		
		model.addAttribute("saludo", "Acá va lo que se pasa en el path, que es: " + texto);
		
		return "/variables";
		
	}


}
