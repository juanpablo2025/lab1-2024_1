package org.tp24;

import org.tp24.entity.CustomerEntity;
import org.tp24.excepcion.CustomerException;
import org.tp24.repository.impl.CustomFileBased;
import org.tp24.service.CustomerServiceImpl;

import java.util.logging.Logger;


public class ApplicationRunner {
    private static final Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

    public ApplicationRunner() throws CustomerException {
    }

    public static void main(String[] args) throws CustomerException {
        run();

        CustomerServiceImpl customerService = new CustomerServiceImpl(new CustomFileBased());
        String name = "Ana";
        String lastname = "Zapata";
        CustomerEntity customer = customerService.findByNameAndLastname(name, lastname);
        System.out.println(customer.getName() + " " + customer.getLastname() + " " + customer.getDocument() + " " + customer.getBirthdate() + " " + customer.getAddress() + " " + customer.getMaxQuota());
    }

    static void run() {
        logger.info("La aplicación ha sido ejecutada exitosamente.");
    }



}
