package ru.neoflex.calculator.controller;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.neoflex.calculator.dto.ErrorMessageDto;
import ru.neoflex.calculator.dto.ResultDto;

@Api(description = "Калькулятор API")
@RequestMapping("/api/v1")
public interface CalculatorControllerApi {

    @ApiOperation(
            value = "Подсчёт суммы двуух чисел",
            notes = "Данный метод подсчитавыет сумму двух чисел и возвращает ответ в виде JSON"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful execution", response = ResultDto.class),
            @ApiResponse(code = 404, message = "Not Found", response = ErrorMessageDto.class),
            @ApiResponse(code = 500, message = "Server error")
    })
    @GetMapping(value = "/sum-of-numbers",
            produces = {"application/json"})
    ResponseEntity<ResultDto> sumOfNumbers(
            @ApiParam(value = "Первое число") @RequestParam("num1") Double num1,
            @ApiParam(value = "Второе число") @RequestParam("num2") Double num2
    );

    @ApiOperation(
            value = "Деление двух чисел",
            notes = "Данный метод выполняет деление двух чисел и возвращает ответ в виде JSON"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful execution", response = ResultDto.class),
            @ApiResponse(code = 400, message = "Bad Request", response = ErrorMessageDto.class),
            @ApiResponse(code = 404, message = "Not Found", response = ErrorMessageDto.class),
            @ApiResponse(code = 500, message = "Server error")
    })
    @GetMapping(value = "/number-division",
            produces = {"application/json"})
    ResponseEntity<ResultDto> numberDivision(
            @ApiParam(value = "Первое число") @RequestParam("num1") Double num1,
            @ApiParam(value = "Второе число") @RequestParam("num2") Double num2
    );

    @ApiOperation(
            value = "Вычитание двух чисел",
            notes = "Данный метод выполняет вычитание двух чисел и возвращает ответ в виде JSON"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful execution", response = ResultDto.class),
            @ApiResponse(code = 404, message = "Not Found", response = ErrorMessageDto.class),
            @ApiResponse(code = 500, message = "Server error")
    })
    @GetMapping(value = "/subtraction-of-numbers",
            produces = {"application/json"})
    ResponseEntity<ResultDto> subtractionOfNumbers(
            @ApiParam(value = "Первое число") @RequestParam("num1") Double num1,
            @ApiParam(value = "Второе число") @RequestParam("num2") Double num2
    );

    @ApiOperation(
            value = "Умножение двух чисел",
            notes = "Данный метод выполняет умножение двух чисел и возвращает ответ в виде JSON"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful execution", response = ResultDto.class),
            @ApiResponse(code = 404, message = "Not Found", response = ErrorMessageDto.class),
            @ApiResponse(code = 500, message = "Server error")
    })
    @GetMapping(value = "/number-multiplication",
            produces = {"application/json"})
    ResponseEntity<ResultDto> numberMultiplication(
            @ApiParam(value = "Первое число") @RequestParam("num1") Double num1,
            @ApiParam(value = "Второе число") @RequestParam("num2") Double num2
    );
}
