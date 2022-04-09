package ru.neoflex.calculator.service.impl;

import org.springframework.stereotype.Service;
import ru.neoflex.calculator.dto.ResultDto;
import ru.neoflex.calculator.exception.MyArithmeticException;
import ru.neoflex.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    
    @Override
    public ResultDto sumOfNumbers(Double num1, Double num2) {
        return new ResultDto(num1 + num2);
    }

    @Override
    public ResultDto numberDivision(Double num1, Double num2) {
        if (0 == num2) {
            throw new MyArithmeticException("Деление на 0");
        }
        return new ResultDto(num1 / num2);
    }

    @Override
    public ResultDto numberMultiplication(Double num1, Double num2) {
        return new ResultDto(num1 * num2);
    }

    @Override
    public ResultDto subtractionOfNumbers(Double num1, Double num2) {
        return new ResultDto(num1 - num2);
    }
}
