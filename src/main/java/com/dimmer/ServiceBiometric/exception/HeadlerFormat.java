package com.dimmer.ServiceBiometric.exception;

import com.dimmer.ServiceBiometric.model.ResponseBiometric;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@ControllerAdvice
public class HeadlerFormat {
    private static final Logger log = LoggerFactory.getLogger(HeadlerFormat.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseBiometric> methodArgumentNotValidException(HttpServletRequest request, MethodArgumentNotValidException e) {

        // get spring errors
        BindingResult result = e.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();

        // convert errors to standard string
        StringBuilder errorMessage = new StringBuilder();
        fieldErrors.forEach(f -> errorMessage.append("[{"+f.getField() + "} " + f.getDefaultMessage() +  "]"));

        // return error info object with standard json
        ResponseBiometric responseError = new ResponseBiometric("400", errorMessage.toString());
        System.out.println("Error De Consumo: "+ responseError.toString()+" -> "+request.getRequestURI());
        return new ResponseEntity<>(responseError, HttpStatus.OK);
    }

    @ExceptionHandler(FilterError.class)
    public ResponseEntity<ResponseBiometric> methodArgumentFilterErrorException(HttpServletRequest request, FilterError e) {
        ResponseBiometric responseError = new ResponseBiometric();
        responseError.setStatusCode(e.getStatusCode());
        responseError.setMessageCode(e.getMessageError());
        log.warn(request.getRequestURI());
        log.error("Problemas De Peticion [{}]", responseError.toString());
        return new ResponseEntity<>(responseError, HttpStatus.OK);
    }

}
