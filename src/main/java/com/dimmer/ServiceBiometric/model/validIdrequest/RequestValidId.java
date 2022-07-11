package com.dimmer.ServiceBiometric.model.validIdrequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class RequestValidId {
    private SecurityData securityData;
    private CustomerData customerData;
    private AdditionalData additionalData;
}
