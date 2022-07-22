package com.diamones.springboot.app.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Usuario {

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;

	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Value("${usuario.nombre}")
	private String nombre;
	
	@Value("${usuario.apellido}")
	private String apellido;
	
	@Value("${usuario.edad}")	private Integer edad;
	@Value("${usuario.email}")
	private String email;
}
