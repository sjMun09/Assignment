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

    public double calculate(T num1, T num2, OperatorType operator) {
        double a = num1.doubleValue();
        double b = num2.doubleValue();
        double result;

        switch (operator) {
            case ADD -> result = a + b;
            case SUBTRACT -> result = a - b;
            case MULTIPLY -> result = a * b;
            case DIVIDE -> {
                if (b == 0) {
                    System.out.println(" 나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return 0;
                }
                result = a / b;
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
