package com.lessons.app.shared;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;


@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorBean> handleNotFound(ResourceNotFoundException ex)
    {
        ErrorBean errorBean = ErrorBean.builder()
                .status(HttpStatus.NO_CONTENT)
                .message(ex.getMessage())
                .localDateTime(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorBean, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorBean> handleGenericException(Exception ex)
    {
        ErrorBean errorBean = ErrorBean.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .message(ex.getMessage())
                .localDateTime(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorBean, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
