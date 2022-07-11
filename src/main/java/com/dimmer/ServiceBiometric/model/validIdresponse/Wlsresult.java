package com.dimmer.ServiceBiometric.model.validIdresponse;

import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
@ToString
@Getter
@Setter
public class Wlsresult {

    private String orderUrlWLS;
    private String createdOnWLS;
    private String orderStatusWLS;
    private String orderIdWLS;
    private Integer resultCountWLS;
    private String productIdWLS;

}