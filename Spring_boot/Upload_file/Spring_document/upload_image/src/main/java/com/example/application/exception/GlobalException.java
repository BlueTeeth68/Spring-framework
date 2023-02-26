package com.example.application.exception;

import com.example.application.storage.StorageException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {

    @ExceptionHandler({StorageException.class})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> handleStorageException(
            Exception ex, WebRequest request) {
        String error = "File is empty.";
        ErrorDetails errorDetails =
                new ErrorDetails(HttpStatus.NO_CONTENT, error, ex.getMessage());
        return new ResponseEntity<Object>(
                errorDetails, new HttpHeaders(), errorDetails.getStatus());
    }

}
