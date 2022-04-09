package ru.neoflex.calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.neoflex.calculator.dto.ErrorMessageDto;
import ru.neoflex.calculator.exception.MyArithmeticException;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(value = {MyArithmeticException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessageDto resourceNotFoundException(MyArithmeticException ex) {
        return new ErrorMessageDto(ex.getMessage());
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorMessageDto resourceNotFoundException(Exception ex) {
        return new ErrorMessageDto(ex.getMessage());
    }
}
