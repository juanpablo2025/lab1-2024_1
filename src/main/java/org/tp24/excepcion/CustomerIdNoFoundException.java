package org.tp24.excepcion;

public class CustomerIdNoFoundException extends RuntimeException{
    public CustomerIdNoFoundException(String message) {
        super(message);
    }
}
