package com.diamones.springboot.app.models;

import java.util.List;

public class Factura {
	
	private Integer consecutivo;
	private Usuario usuario;	
	private List<ItemsFactura> itmes;
	private Double total;

}
