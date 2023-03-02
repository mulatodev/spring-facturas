package com.arcadia.samples.invoices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.sql.Date;
/**
 *
 * @author ganaranjo
 */
@Entity
@Table(name = "factura")
public class InvoiceModel {

    public InvoiceModel(){
        
    }
    
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "id_cliente")
    private int id_cliente;
    
    @Column(name = "fecha")
    private Date fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
