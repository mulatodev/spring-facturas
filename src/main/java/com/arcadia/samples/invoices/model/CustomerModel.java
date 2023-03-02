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
@Table(name = "cliente")
public class CustomerModel {
    
    public CustomerModel(){
    }
    
    @Id
    @Column(name = "Id")
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "email")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
