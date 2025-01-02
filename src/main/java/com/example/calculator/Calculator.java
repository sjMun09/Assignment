package com.example.calculator;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results = new ArrayList<>();

    //@Getter
    public List<Integer> getResults() {
        return new ArrayList<>(results);
    }

    //@Setter
    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("가장 먼저 저장된 연산 결과가 삭제되었습니다.");
        } else {
            System.out.println("삭제할 연산 결과가 없습니다.");
        }
    }

    public int calculate(int num1, int num2, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println(" 나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return 0;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("올바른 사칙연산 입력해주세요.");
        }

        results.add(result);
        return result;
    }
}
