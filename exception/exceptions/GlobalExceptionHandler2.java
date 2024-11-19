package com.trip.exception.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


//전역에서 발생하는 예외를 처리.
@ControllerAdvice
public class GlobalExceptionHandler2 {

    // 특정 예외 처리
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleBadRequestException(NullPointerException ex) {

        return ResponseEntity.badRequest().body("GlobalExceptionHandler2의 null badRequest");
    }

//    // 모든 예외 처리(우선 순위 가장 낮음)
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> handleGenericException(Exception ex) {
//
//        return ResponseEntity.badRequest().body("GlobalExceptionHandler2의 excpetion 잘못된 호출입니다.");
//    }
}
