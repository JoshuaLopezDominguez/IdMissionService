package com.dimmer.ServiceBiometric.model.validIdresponse;

import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
@ToString
@Getter
@Setter
public class CriminalRecord {

    private Aliases aliases;
    private Offenses offenses;
    private Profiles profiles;

}