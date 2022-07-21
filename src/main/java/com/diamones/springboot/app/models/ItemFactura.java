package com.diamones.springboot.app.models;

public class ItemFactura {

	public ItemFactura() {

	}

	public ItemFactura(Integer id, Producto producto) {

		this.id = id;
		this.producto = producto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	

	private Integer id;
	private Producto producto;

}
