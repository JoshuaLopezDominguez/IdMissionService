package com.dimmer.ServiceBiometric.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class RequestBiometric {

    @NotNull
    private String idType;
private String idFrontImage;



}
