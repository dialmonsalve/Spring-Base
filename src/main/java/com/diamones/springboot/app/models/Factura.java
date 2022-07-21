package com.diamones.springboot.app.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Factura {

	public Factura() {

	}

	public Factura(Integer consecutivo, Usuario usuario, List<ItemFactura> itmes, Double total) {

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

	public List<ItemFactura> getItmes() {
		return itmes;
	}

	public void setItmes(List<ItemFactura> itmes) {
		this.itmes = itmes;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	@Autowired
	private Usuario usuario;

	private Integer consecutivo;
	
	@Autowired
	private List<ItemFactura> itmes;
	
	private Double total;

}
