package com.leyou.exception;

import com.leyou.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LyException extends RuntimeException {
    private ExceptionEnum exceptionEnum;

//    public LyException(ExceptionEnum exceptionEnum) {
//        this.exceptionEnum = exceptionEnum;
//    }
//
//    public ExceptionEnum getExceptionEnum() {
//        return exceptionEnum;
//    }
}
