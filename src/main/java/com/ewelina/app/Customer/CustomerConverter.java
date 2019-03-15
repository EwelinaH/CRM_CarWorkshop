package com.ewelina.app.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class CustomerConverter implements Converter<String, Customer> {

    @Autowired
    public CustomerService customerService;

    @Override
    public Customer convert(String source){
        if(source == null || source.isEmpty()){
            return null;
        }
        Long id = Long.parseLong(source);
        return customerService.find(id);
    }
}
