package org.example.calculator;

import org.example.calculator.operator.AdditionOpeartor;
import org.example.calculator.operator.DivisionOperator;
import org.example.calculator.operator.MultiplicationOperator;
import org.example.calculator.operator.SubtractionOperator;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithemticOperators =
            List.of(new AdditionOpeartor(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return arithemticOperators.stream()
                .filter(arithemticOperators -> arithemticOperators.supports(operator))
                .map(arithemticOperators -> arithemticOperators.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
