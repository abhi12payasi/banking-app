package com.app.controller;

import com.app.model.Customer;
import com.app.service.IDataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private IDataModelService<Customer, Integer> service;

    @RequestMapping("/save")
    public String addCustomer(@RequestBody Customer customer) {
        int id = service.save(customer);
        System.out.println("customer with " + id + " saved !!");
        return "register"; //ui page name has to be returned from here
    }

    @RequestMapping("/data")
    public String getAllCustomers() {
        System.out.println(service.findAll());
        return "data"; // ui page
    }


}
