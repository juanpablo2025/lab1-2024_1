package org.tp24.repository;

import org.tp24.entity.CustomerEntity;
import org.tp24.excepcion.CustomerException;

import java.util.List;

public interface CustomerRepository {
    List<CustomerEntity> findByNameAndLastname(String name, String lastname) throws CustomerException;
    List<CustomerEntity> findByMaxQuota(double maxQuota) throws CustomerException;
    CustomerEntity findByCustomerId(String document) throws CustomerException;

}

