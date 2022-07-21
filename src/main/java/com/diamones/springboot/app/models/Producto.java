package com.diamones.springboot.app.models;

public class Producto {

	public Producto() {
		super();

	}

	public Producto(Integer id, String descripcion, Integer cantidad, Double precio) {

		this.id = id;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	private Integer id;
	private String descripcion;
	private Integer cantidad;
	private Double precio;

}
