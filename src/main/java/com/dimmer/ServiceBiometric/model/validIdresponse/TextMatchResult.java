package com.dimmer.ServiceBiometric.model.validIdresponse;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
@ToString
@Getter
@Setter
public class TextMatchResult {

    private String servicePresent;
    private Boolean addressLine2Match;
    private Boolean addressZIP5Match;
    private Boolean addressCityMatch;
    private Boolean personBirthDateMatch;
    private Boolean personMiddleInitialMatch;
    private Boolean personLastNameFuzzyAlternateMatch;
    private Boolean personFirstNameFuzzyAlternateMatch;
    private String personLastNameFuzzyPrimaryMatch;
    private String verificationResult;
    private Boolean driverLicenseIssueDateMatch;
    private Boolean driverLicenseNumberMatch;
    private Boolean personSexCodeMatch;
    private Boolean personFirstNameFuzzyPrimaryMatch;
    private Boolean addressLine1Match;
    private Boolean personMiddleNameExactMatch;
    private Boolean addressZIP4Match;
    private Boolean personFirstNameExactMatch;
    private String hostTried;
    private Boolean personMiddleNameFuzzyPrimaryMatch;
    private String documentCategoryMatch;
    private String address;
    private Boolean addressStateCodeMatch;
    private Boolean personLastNameExactMatch;
    private Boolean driverLicenseExpirationDateMatch;
    private String thirdPartyVerificationResultDescription;
    private Boolean personMiddleNameFuzzyAlternateMatch;
    private String identiFraudHostTried;

}