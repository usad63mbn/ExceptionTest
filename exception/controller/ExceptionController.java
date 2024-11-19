package com.trip.exception.controller;


import com.trip.exception.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controller가 200번대 응답을 주로 담당.

@RestController
@RequestMapping("/exception")
public class ExceptionController {
    @Autowired
    ExceptionService exceptionService;


    @GetMapping
    ResponseEntity<String> test1(){
        exceptionService.isTrueForTest1();
        return ResponseEntity.ok("정상 호출");
    }

    @DeleteMapping
    ResponseEntity<String> test2(){
        exceptionService.hasSomethingForTest2();
        return ResponseEntity.ok("정상 호출");
    }

}
