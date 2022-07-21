package com.diamones.springboot.app.models;

import java.util.List;

public class Factura {
	
	public Factura() {

	}
	public Factura(Integer consecutivo, Usuario usuario, List<ItemsFactura> itmes, Double total) {
		super();
		this.consecutivo = consecutivo;
		this.usuario = usuario;
		this.itmes = itmes;
		this.total = total;
	}
	public Integer getConsecutivo() {
		return consecutivo;
	}
	public void setConsecutivo(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<ItemsFactura> getItmes() {
		return itmes;
	}
	public void setItmes(List<ItemsFactura> itmes) {
		this.itmes = itmes;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	private Integer consecutivo;
	private Usuario usuario;	
	private List<ItemsFactura> itmes;
	private Double total;

}
