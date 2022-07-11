package com.dimmer.ServiceBiometric.model.validIdrequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SecurityData {

    private String userName;
    private String password;
    private String merchantId;
}
