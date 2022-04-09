package ru.neoflex.calculator.service;

import org.springframework.stereotype.Service;
import ru.neoflex.calculator.dto.ResultDto;

@Service
public interface CalculatorService {

    ResultDto sumOfNumbers(Double num1, Double num2);
    ResultDto numberDivision(Double num1, Double num2);
    ResultDto numberMultiplication(Double num1, Double num2);
    ResultDto subtractionOfNumbers(Double num1, Double num2);
}
