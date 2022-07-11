package com.dimmer.ServiceBiometric.model.validIdrequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AdditionalData {

    private String uniqueRequestId;
    private String manualReviewRequired;
    private String bypassAgeValidation;
    private String deDuplicationRequired;
    private String bypassNameMatching;
    private String postDataAPIRequired;
    private String sendInputImagesInPost;
    private String sendProcessedImagesInPost;
    private String needImmediateResponse;
    private String deduplicationSynchronous;
    private String verifyDataWithHost;
    private String idBackImageRequired;
    private String stripSpecialCharacters;

}
