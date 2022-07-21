package com.diamones.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diamones.springboot.app.models.Usuario;

@Controller
public class IndexController {
	
	public IndexController() {

	}
	
	@Autowired
	public IndexController(List<Usuario> usuario) {
		this.usuario=usuario;
	}
	
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
	
	@ModelAttribute("usuarios")
	public List<Usuario> listaUsuarios() {
		
		usuario.add(new Usuario("Diego", "Monsalve", 40, "diales@gmail.es"));
		usuario.add(new Usuario("Pedro", "Perez", 28, "pepe@gmail.es"));
		usuario.add(new Usuario("Alberto", "Alvarez", 33, "albert@gmail.es"));
		usuario.add(new Usuario("Josue", "Rosado" , 20, "jos@gmail.es"));
		
		return usuario;
	}

	private List<Usuario> usuario;

}
