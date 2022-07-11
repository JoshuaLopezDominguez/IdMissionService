package com.dimmer.ServiceBiometric.model.validIdresponse;

import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
@ToString
@Getter
@Setter
public class Nmresult {

    private Integer resultCountNM;
    private String orderStatusNM;
    private String orderUrlNM;
    private String orderIdNM;
    private String productIdNM;
    private String createdOnNM;
    private String vital4APIHostTried;

}