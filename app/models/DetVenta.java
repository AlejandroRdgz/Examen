/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.google.code.morphia.annotations.Entity;
import play.data.validation.Required;
import play.modules.morphia.Model;

/**
 *
 * @author alejandro
 */


public class DetVenta {
    
    
    public String producto;
    
    public Integer cantidad;
    
    public Double precio;

    public DetVenta(String producto, Integer cantidad, Double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  String.format("%s", producto);
    }
    
    
    
}
