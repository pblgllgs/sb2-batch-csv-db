package com.pblgllgs.sb2batchcsvdb.config;
/*
 *
 * @author pblgl
 * Created on 02-02-2024
 *
 */

import com.pblgllgs.sb2batchcsvdb.entities.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
//        if(customer.getCountry().equals("United States")) {
//            return customer;
//        }else{
//            return null;
//        }
        return customer;
    }
}