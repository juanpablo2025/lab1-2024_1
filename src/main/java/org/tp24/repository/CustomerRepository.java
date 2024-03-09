package org.tp24.repository;

import org.tp24.entity.Customer;
import org.tp24.excepcion.CustomerNoFoundException;
import org.tp24.excepcion.CustomerIdNoFoundException;
import org.tp24.excepcion.MaxQuotaNoFoundException;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findByNameAndLastname(String name, String lastname) throws CustomerNoFoundException;
    List<Customer> findByMaxQuota(double maxQuota) throws MaxQuotaNoFoundException;
    Customer findByCustomerId(String document) throws CustomerIdNoFoundException;
}

