package com.dimmer.ServiceBiometric.controller;

import com.dimmer.ServiceBiometric.exception.FilterError;
import com.dimmer.ServiceBiometric.model.RequestBiometric;
import com.dimmer.ServiceBiometric.model.ResponseBiometric;
import com.dimmer.ServiceBiometric.service.IServiceBiometric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ControllerBiometric {

    private IServiceBiometric isb;

    @Autowired
    public ControllerBiometric(IServiceBiometric isb) {
        this.isb = isb;
    }

    @PostMapping("Service/Facematch")
    public ResponseEntity<ResponseBiometric> FaceMatch(@Valid @RequestBody RequestBiometric r) throws FilterError {
        return ResponseEntity.ok(new ResponseBiometric());
    }



}
