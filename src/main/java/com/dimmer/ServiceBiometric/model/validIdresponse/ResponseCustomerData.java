package com.dimmer.ServiceBiometric.model.validIdresponse;

import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
@ToString
@Getter
@Setter
public class ResponseCustomerData {

    private ExtractedPersonalData extractedPersonalData;
    private HostData hostData;
    private ExtractedIdData extractedIdData;

}