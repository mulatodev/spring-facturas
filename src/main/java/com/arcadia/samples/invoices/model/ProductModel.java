package com.arcadia.samples.invoices.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

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
    @Column(name = "id", nullable=false)
    private int Id;
    
    @Column(name = "nombre", nullable=false)
    private String nombre;
    
    @Column(name = "precio", nullable=false)
    private int precio;
    
    @Column(name = "stock")
    private int stock;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto", referencedColumnName = "id")
    private Set<InvoiceItemModel> invoiceItem = new HashSet<>();
    
    public int getId() {
        return Id;
    }

    public void setId(final int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(final int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(final int stock) {
        this.stock = stock;
    }

    public Set<InvoiceItemModel> getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(final Set<InvoiceItemModel> invoiceItem) {
        this.invoiceItem = invoiceItem;
    }
}
