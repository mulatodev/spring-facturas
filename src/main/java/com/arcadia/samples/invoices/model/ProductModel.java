package com.arcadia.samples.invoices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

/**
 *
 * @author ganaranjo
 */
@Entity
@Table(name = "producto")
public class ProductModel {
    
    public ProductModel(){
        
    }
    
    @Id
    @Column(name = "id")
    private int Id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "precio")
    private int precio;
    
    @Column(name = "stock")
    private int stock;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
