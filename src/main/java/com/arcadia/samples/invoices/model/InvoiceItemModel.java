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
@Table(name = "detalle")
public class InvoiceItemModel {

    public InvoiceItemModel(){
        
    }
    
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "id_factura")
    private int id_factura;
    
    @Column(name = "id_producto")
    private int id_producto;
    
    @Column(name = "cantidad")
    private int cantidad;
    
    @Column(name = "precio")
    private int precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }   
}
