package com.diamones.springboot.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.diamones.springboot.app.models.ItemFactura;
import com.diamones.springboot.app.models.Producto;

@Configuration
public class AppConfig {

    @Bean("itemsFactura")
    List<ItemFactura> registrarItems() {

        Producto producto1 = new Producto("Televisor Sony", 250000.04);
        Producto producto2 = new Producto("Radio teléfono", 22000.14);
        Producto producto3 = new Producto("Celular motorola", 1320408.18);
        Producto producto4 = new Producto("Laptop asus", 2533000.22);

        ItemFactura linea1 = new ItemFactura(producto1, 4);
        ItemFactura linea2 = new ItemFactura(producto2, 2);
        ItemFactura linea3 = new ItemFactura(producto3, 8);
        ItemFactura linea4 = new ItemFactura(producto4, 9);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }

}
