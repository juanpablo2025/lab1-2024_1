package org.tp24.service;

import org.tp24.entity.Customer;
import org.tp24.excepcion.CustomerNoFoundException;
import org.tp24.repository.CustomerRepository;

import java.util.List;

public class ServiceImpl {
    private final CustomerRepository customerRepository;

    public ServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findByNameAndLastname(String name, String lastname) throws CustomerNoFoundException {
        try {
            return customerRepository.findByNameAndLastname(name, lastname);
        } catch (CustomerNoFoundException e) {
            throw new CustomerNoFoundException("No se encontraron clientes con el nombre y apellido especificados");
        }
    }

    public List<Customer> findByMaxQuota(double maxQuota) throws CustomerNoFoundException {
        try {
            return customerRepository.findByMaxQuota(maxQuota);
        } catch (CustomerNoFoundException e) {
            throw new CustomerNoFoundException("No se encontraron clientes con cupos máximos iguales o superiores al valor especificado");
        }
    }

    public Customer findByCustomerId(String document) throws CustomerNoFoundException {
        try {
            return customerRepository.findByCustomerId(document);
        } catch (CustomerNoFoundException e) {
            throw new CustomerNoFoundException("No se encontró ningún cliente con el número de identificación especificado");
        }
    }
}
