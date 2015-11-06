/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.google.code.morphia.annotations.Entity;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import play.data.validation.Required;
import play.modules.morphia.Model;
import models.DetVenta;

/**
 *
 * @author alejandro
 */

@Entity
public class Venta extends Model {
    
    @Required
    public Date fecha;
    
    @Required
    public Double total;
    
    @Required
    public String folio;
    
   /* DetVenta detventa = new DetVenta(folio, Integer.SIZE, total)*/
    
   // List<DetVenta> detventa = new ArrayList<>();
     

    public Venta(Date fecha, Double total, String folio) {
        this.fecha = fecha;
        this.total = total;
        this.folio = folio;
        
         List<DetVenta> detventa = new ArrayList<>();}  
        
          
        

    
    /*
    public Venta(Date fecha, Double total, String folio) {
        this.fecha = fecha;
        this.total = total;
        this.folio = folio;
        /*this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }*/

   

    @Override
    public String toString() {
        return String.format("%s", folio);
    }
    
    
    
}
