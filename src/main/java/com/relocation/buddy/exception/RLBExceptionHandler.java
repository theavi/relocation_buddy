package com.relocation.buddy.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RLBExceptionHandler {

    @ExceptionHandler(value = {NullPointerException.class, RecordNotFoundException.class})
    public String handleDistrictException() {
        System.out.println("Alternate action was taken ");
        return "Record deleted";
    }

    @ExceptionHandler(value = Exception.class)
    public String handleRLBException() {
        System.out.println("Alternate action was taken ");
        return "Record deleted";
    }
}
