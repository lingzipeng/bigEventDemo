package com.itemheima.exception;

import com.itemheima.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.util.StringUtils.hasLength;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e){
        e.printStackTrace();
        return Result.error(hasLength(e.getMessage())? e.getMessage() : "操作失败");//(e.getMessage())? e.getMessage() : "操作失败"
    }
}
