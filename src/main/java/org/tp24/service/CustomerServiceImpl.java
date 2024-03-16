package org.tp24.service;

import org.tp24.entity.CustomerEntity;
import org.tp24.excepcion.CustomerException;
import org.tp24.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity findByNameAndLastname(String name, String lastname) throws CustomerException {
        try {
            return customerRepository.findByNameAndLastname(name, lastname);
        } catch (CustomerException e) {
            throw new CustomerException("No se encontraron clientes con el nombre y apellido especificados");
        }
    }

    public List<CustomerEntity> findByMaxQuota(double maxQuota) throws CustomerException {
        try {
            return customerRepository.findByMaxQuota(maxQuota);
        } catch (CustomerException e) {
            throw new CustomerException("No se encontraron clientes con cupos máximos iguales o superiores al valor especificado");
        }
    }

    public CustomerEntity findByCustomerId(String document) throws CustomerException {
        try {
            return customerRepository.findByCustomerId(document);
        } catch (CustomerException e) {
            throw new CustomerException("No se encontró ningún cliente con el número de identificación especificado");
        }
    }
}
