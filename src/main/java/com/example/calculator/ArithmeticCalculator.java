package com.example.calculator;

import java.util.*;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    private List<Double> results = new ArrayList<>();

    public List<Double> getResults() {
        return new ArrayList<>(results);
    }

    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("가장 먼저 저장된 연산 결과가 삭제되었습니다.");
        } else {
            System.out.println("삭제할 연산 결과가 없습니다.");
        }
    }

    public double calculate(T inputNum1, T inputNum2, OperatorType operator) {
        double num1 = inputNum1.doubleValue();
        double num2 = inputNum2.doubleValue();
        double result;

        switch (operator) {
            case ADD -> result = num1 + num2;
            case SUBTRACT -> result = num1 - num2;
            case MULTIPLY -> result = num1 * num2;
            case DIVIDE -> {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return 0;
                }
                result = num1 / num2;
            }
            default -> throw new IllegalArgumentException("유효하지 않은 연산자입니다.");
        }

        results.add(result);
        return result;
    }

    public List<Double> getResultsGreaterThan(double threshold) {
        return results.stream()
                .filter(result -> result > threshold)
                .collect(Collectors.toList());
    }
}
