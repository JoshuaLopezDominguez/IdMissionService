package com.dimmer.ServiceBiometric.model.validIdrequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IdData {

    private String idType;
    private String idCountry;
    private String idState;
    private String idImageFront;
    private String idImageBack;

}
