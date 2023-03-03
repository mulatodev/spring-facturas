package com.arcadia.samples.invoices.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author ganaranjo
 */
@Entity
@Table(name = "factura")
public class BillModel {

    public BillModel(){
        
    }
    
    @Id
    @Column(name = "id", nullable=false)
    private int id;
    
    @Column(name = "id_cliente", nullable=false)
    private int id_cliente;
    
    @Column(name = "fecha", nullable=false)
    private Date fecha;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_factura", referencedColumnName = "id")
    private Set<BillItemModel> invoice = new HashSet<>();
    
    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(final int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(final Date fecha) {
        this.fecha = fecha;
    }

    public Set<BillItemModel> getInvoice() {
        return invoice;
    }

    public void setInvoice(final Set<BillItemModel> invoice) {
        this.invoice = invoice;
    }
}
