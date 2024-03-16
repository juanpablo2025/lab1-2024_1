package org.tp24.excepcion;

public class CustomerNoFoundException extends Exception{
    public CustomerNoFoundException(String message) {
        super(message);
    }
}
