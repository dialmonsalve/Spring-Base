package com.diamones.springboot.app.models;

public class Producto {

	public Producto(String descripcion, Double precio) {

		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	private String descripcion;
	private Double precio;

}
