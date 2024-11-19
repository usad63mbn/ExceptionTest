package com.trip.exception.service;

import com.trip.exception.exceptions.BadRequestException;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Service;

import java.util.Optional;

// service단에서 400, 500번대 오류를 서비스 계층에서 처리하고 예외를 던지는 방식.
@Service
public class ExceptionService {

    public boolean isTrueForTest1(){
        boolean flag = false;
        if(!flag){
            throw new BadRequestException("test1은 올바르지 않은 요청입니다."); //
            //throw new ArithmeticException("test1의 Exception"); //Handler가 예외를 처리하지 못하면 기본적으로 500번 에러를 발생시킴
        }

        return true;
    }

    public Object hasSomethingForTest2() throws NullPointerException{
        Optional<Object> optional = Optional.empty();
        return optional.orElseThrow(() -> new NullPointerException("object에 값이 없습니다."));
    }
}
