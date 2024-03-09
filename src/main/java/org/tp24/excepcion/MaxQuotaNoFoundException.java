package org.tp24.excepcion;

public class MaxQuotaNoFoundException extends RuntimeException{
    public MaxQuotaNoFoundException(String message) {
        super(message);
    }
}
