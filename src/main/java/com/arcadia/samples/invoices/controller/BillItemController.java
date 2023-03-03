package com.arcadia.samples.invoices.controller;

import com.arcadia.samples.invoices.service.IBillItemService;
//import com.arcadia.samples.invoices.model.BillItemModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ganaranjo
 */
@Controller
public class BillItemController {

    @Autowired
    private IBillItemService service;
    
    @GetMapping({"/items", "/"})
    public String listBillItems(Model model){
        model.addAttribute("items", service.getAllItems());
        return "items";  
    }
}
