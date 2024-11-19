package com.trip.exception.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 컨트롤러를 거치지 않고 예외가 발생한 시점에서 자동으로 응답 상태 코드와 메시지를 클라이언트에게 보내기 때문에 간단한 예외 처리
// 근데 @ControllerAdvice 보다 우선 순위가 낮음, 커스텀한 예외 처리를 사용하고 싶다면, @ControllerAdvice에서 excption.class에 대한 핸들러 명시 x.
@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class BadRequestException extends RuntimeException{
    public BadRequestException(String message) {
        super(message);
    }
}
