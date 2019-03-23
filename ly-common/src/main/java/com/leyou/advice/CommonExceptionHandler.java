package com.leyou.advice;

import com.leyou.exception.LyException;
import com.leyou.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {

    /**
     * 自定义全局异常处理方法
     * @param le
     * @return
     */
    @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> handleException(LyException le){
        System.out.println("======"+le);
        return ResponseEntity.status(le.getExceptionEnum().getCode())
                .body(new ExceptionResult(le.getExceptionEnum()));
    }




}

