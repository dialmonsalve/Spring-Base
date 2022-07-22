package com.diamones.springboot.app.models;

public class ItemFactura {
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ItemFactura(Integer id,Producto producto, Integer cantidad) {

		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public Double calcularImporte() {
		return producto.getPrecio() * cantidad;
	}

	private Producto producto;
	private Integer cantidad;
	private  Integer id;

}
