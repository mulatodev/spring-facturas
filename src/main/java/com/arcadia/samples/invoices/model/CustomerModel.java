package com.arcadia.samples.invoices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import java.util.HashSet;
import java.util.Set;

//import com.arcadia.samples.invoices.model.InvoiceModel;

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
    @GeneratedValue
    @Column(name = "Id", nullable=false)
    private int id;
    
    @Column(name = "nombre", nullable=false)
    private String nombre;
    
    @Column(name = "email")
    private String email;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Set<InvoiceModel> invoice = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
    
    public Set<InvoiceModel> getInvoice() {
        return invoice;
    }

    public void setInvoice(final Set<InvoiceModel> invoice) {
        this.invoice = invoice;
    }    
}
