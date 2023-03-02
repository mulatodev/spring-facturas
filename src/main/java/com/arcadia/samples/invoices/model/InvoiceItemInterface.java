package com.arcadia.samples.invoices.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ganaranjo
 */
public interface InvoiceItemInterface extends JpaRepository<InvoiceItemModel, Long>{
    
}
