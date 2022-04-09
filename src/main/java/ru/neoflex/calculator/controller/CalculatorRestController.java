package ru.neoflex.calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.calculator.dto.ResultDto;
import ru.neoflex.calculator.service.CalculatorService;

@RestController
public class CalculatorRestController implements CalculatorControllerApi {

    private final CalculatorService calculatorService;

    public CalculatorRestController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @Override
    public ResponseEntity<ResultDto> sumOfNumbers(Double num1, Double num2) {
        ResultDto result = calculatorService.sumOfNumbers(num1, num2);
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<ResultDto> numberDivision(Double num1, Double num2) {
        ResultDto result = calculatorService.numberDivision(num1, num2);
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<ResultDto> subtractionOfNumbers(Double num1, Double num2) {
        ResultDto result = calculatorService.subtractionOfNumbers(num1, num2);
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<ResultDto> numberMultiplication(Double num1, Double num2) {
        ResultDto result = calculatorService.numberMultiplication(num1, num2);
        return ResponseEntity.ok(result);
    }
}