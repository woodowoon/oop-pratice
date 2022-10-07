package org.example.calculator;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithemticOperators =
            List.of(new AdditionOpertor(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public static int calculate(int operand1, String operator, int operand2) {
        return arithemticOperators.stream()
                .filter(arithemticOperators -> arithemticOperators.supports(operator))
                .map(arithemticOperators -> arithemticOperators.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
