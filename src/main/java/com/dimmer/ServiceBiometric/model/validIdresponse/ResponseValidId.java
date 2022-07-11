package com.dimmer.ServiceBiometric.model.validIdresponse;

import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
@ToString
@Getter
@Setter
public class ResponseValidId {

    private ResponseCustomerData responseCustomerData;
    private ResultData resultData;
    private Status status;

}
