package com.pblgllgs.sb2batchcsvdb.repository;

import com.pblgllgs.sb2batchcsvdb.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
