package com.diamones.springboot.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.diamones.springboot.app.models.ItemFactura;
import com.diamones.springboot.app.models.Producto;

@Configuration
public class AppConfig {

    @Bean
    List<ItemFactura> registrarItems() {

        Producto producto1 = new Producto(1, "Televisor Sony", 3, 250000.04);
        Producto producto2 = new Producto(2, "Radio teléfono", 2, 22000.14);
        Producto producto3 = new Producto(3, "Celular motorola", 1, 1320408.18);
        Producto producto4 = new Producto(4, "Laptop asus", 1, 2533000.22);

        ItemFactura linea1 = new ItemFactura(1, producto1);
        ItemFactura linea2 = new ItemFactura(2, producto2);
        ItemFactura linea3 = new ItemFactura(3, producto3);
        ItemFactura linea4 = new ItemFactura(4, producto4);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }

}
