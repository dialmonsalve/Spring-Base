package com.diamones.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.diamones.springboot.app.models.Factura;

@Controller
public class facturaController {
	
	@GetMapping("/factura")
	public String facturacion(Model model) {
		
		model.addAttribute("titulo", "Facturación");
		
		model.addAttribute("factura", factura);
		
		return "factura";
	}
	
	@Autowired
	private Factura factura;

}
