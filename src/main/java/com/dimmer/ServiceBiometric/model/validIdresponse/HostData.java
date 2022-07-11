package com.dimmer.ServiceBiometric.model.validIdresponse;

import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
@ToString
@Getter
@Setter
public class HostData {

    private TextMatchResult textMatchResult;
    private Wlsresult wlsresult;
    private CriminalRecord criminalRecord;
    private Pepresult pepresult;
    private SexOffenders sexOffenders;
    private Nmresult nmresult;

}