package com.test.ep;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@ControllerAdvice(basePackages = "com.test.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public void runtimeException(Exception e) {
        log.println("捕获全局运行时异常,同时写入日志文件2");
        e.printStackTrace();
    }

}
