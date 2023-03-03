package com.arcadia.samples.invoices.service;

import com.arcadia.samples.invoices.model.BillItemModel;
import com.arcadia.samples.invoices.model.IBillItemModel;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ganaranjo
 */

@Service
public class BillItemService implements IBillItemService {
    
    @Autowired
    private IBillItemModel repository;
    
    public List<BillItemModel> getAllItems() {
        return repository.findAll();
    }
    
    /*public BillItemModel getBillItemById(Long id){
        return repository.findById(id).get();
    }*/
}
