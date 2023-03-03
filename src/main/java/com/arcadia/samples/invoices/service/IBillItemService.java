package com.arcadia.samples.invoices.service;

import com.arcadia.samples.invoices.model.BillItemModel;
import java.util.List;

/**
 *
 * @author ganaranjo
 */
public interface IBillItemService {
   
    public List<BillItemModel> getAllItems();
    /*public BillItemModel getBillItemById(Long id);*/
}
