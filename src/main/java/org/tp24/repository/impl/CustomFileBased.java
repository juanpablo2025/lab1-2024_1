package org.tp24.repository.impl;

import org.tp24.entity.CustomerEntity;
import org.tp24.excepcion.CustomerException;
import org.tp24.repository.CustomerRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

public class CustomFileBased implements CustomerRepository {
    @Override
    public CustomerEntity findByNameAndLastname(String name, String lastname) throws CustomerException {
        Path path = Paths.get("./src/main/resources/customer-data.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                String[] userDataArray = line.split(",");
                if (userDataArray.length < 6) {
                    throw new CustomerException("Error en el formato de los datos del cliente: Se esperaban al menos 6 campos");
                }
                String firstName = userDataArray[1];
                String lastName = userDataArray[2];
                if (firstName.equals(name) && lastName.equals(lastname)) {
                    String document = userDataArray[0];
                    LocalDate birthDate = LocalDate.parse(userDataArray[3]);
                    String address = userDataArray[4];
                    double maxQuota = Double.parseDouble(userDataArray[5]);
                    return new CustomerEntity(document, firstName, lastName, birthDate, address, maxQuota);

                }

            }
            throw new CustomerException("No se encontró ningún cliente con el nombre y apellido especificados");
        } catch (IOException e) {
            throw new CustomerException("Error al leer el archivo de datos del cliente: " + e.getMessage());
        } catch (DateTimeParseException e) {
            throw new CustomerException("Error en el formato de la fecha de nacimiento: " + e.getMessage());
        } catch (NumberFormatException e) {
            throw new CustomerException("Error en el formato del cupo máximo: " + e.getMessage());
        }


    }

    @Override
    public List<CustomerEntity> findByMaxQuota(double maxQuota) throws CustomerException {
        return null;
    }

    @Override
    public CustomerEntity findByCustomerId(String document) throws CustomerException {
        return null;
    }
}
