package org.tp24.excepcion;

public class CustomerNoFoundException extends RuntimeException{
    public CustomerNoFoundException(String message) {
        super(message);
    }
}
