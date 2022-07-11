package com.dimmer.ServiceBiometric.model.validIdrequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PersonalData {

    private String uniqueNumber;
    private String name;
    private String phone;
    private String email;
    private String dob;
    private String gender;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String district;
    private String country;

}
