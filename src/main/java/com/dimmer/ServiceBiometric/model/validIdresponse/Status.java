package com.dimmer.ServiceBiometric.model.validIdresponse;

import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
@ToString
@Getter
@Setter
public class Status {

    private Integer requestId;
    private String statusMessage;
    private String errorData;
    private Integer statusCode;

}