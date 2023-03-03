package com.arcadia.samples.invoices.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ganaranjo
 */
public interface IBillItemModel extends JpaRepository<BillItemModel, Long>{
    
}
