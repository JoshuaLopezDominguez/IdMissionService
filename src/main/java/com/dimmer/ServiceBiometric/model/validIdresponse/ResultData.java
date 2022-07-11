package com.dimmer.ServiceBiometric.model.validIdresponse;

import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
@ToString
@Getter
@Setter
public class ResultData {

    private Integer uniqueRequestId;
    private String verificationResult;
    private String verificationResultCode;
    private Integer verificationResultId;

}