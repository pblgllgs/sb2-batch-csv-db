package com.pblgllgs.sb2batchcsvdb.config;
/*
 *
 * @author pblgl
 * Created on 02-02-2024
 *
 */

import com.pblgllgs.sb2batchcsvdb.entities.Customer;
import com.pblgllgs.sb2batchcsvdb.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class CustomerWriter implements ItemWriter<Customer> {

    private final CustomerRepository customerRepository;


    @Override
    public void write(List<? extends Customer> list) throws Exception {
        log.info("Thread name: "+ Thread.currentThread().getName());
        customerRepository.saveAll(list);
    }
}
