package com.dimmer.ServiceBiometric.model;

import com.dimmer.ServiceBiometric.model.validIdrequest.AdditionalData;
import com.dimmer.ServiceBiometric.model.validIdrequest.CustomerData;
import com.dimmer.ServiceBiometric.model.validIdrequest.SecurityData;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestIdMissionValidateId {

    private SecurityData securityData;
    private CustomerData customerData;
    private AdditionalData additionalData;


}
