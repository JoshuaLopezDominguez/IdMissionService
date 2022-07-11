package com.dimmer.ServiceBiometric.model;

public class ResponseBiometric {

    private String statusCode;
    private String messageCode;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public ResponseBiometric() {
    }

    public ResponseBiometric(String statusCode, String messageCode) {
        this.statusCode = statusCode;
        this.messageCode = messageCode;
    }
}
