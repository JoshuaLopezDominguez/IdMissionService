package com.dimmer.ServiceBiometric.exception;

public class FilterError extends Exception {

    private String statusCode;
    private String messageError;

    public FilterError(String statusCode,String messageError) {
        super("Problemas de Filtro");
        this.statusCode = statusCode;
        this.messageError = messageError;
    }
    public String getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    public String getMessageError() {
        return messageError;
    }
    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }

}
