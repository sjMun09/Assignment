package com.example.calculator;

import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArithmeticCalculator<Double> ccl = new ArithmeticCalculator<>();

        while (true) {
            try {
                System.out.println("첫 번째 수를 입력하세요 (0포함): ");
                double num1 = Double.parseDouble(br.readLine());

                System.out.println("사칙연산 기호를 입력하세요 (+, -, *, /): ");
                char operatorChar = br.readLine().charAt(0);
                OperatorType operator = OperatorType.fromChar(operatorChar);

                System.out.println("두 번째 수를 입력하세요 (0포함): ");
                double num2 = Double.parseDouble(br.readLine());

                double result = ccl.calculate(num1, num2, operator);
                System.out.println("결과: " + result);
                System.out.println("결과 목록: " + ccl.getResults());

                System.out.println("결과값 중 특정 값보다 큰 결과를 조회하시겠습니까? (y/n)");
                if (br.readLine().equalsIgnoreCase("y")) {
                    System.out.println("조회 기준값을 입력하세요: ");
                    double threshold = Double.parseDouble(br.readLine());
                    System.out.println("조회 결과: " + ccl.getResultsGreaterThan(threshold));
                }

                System.out.println("가장 먼저 저장된 연산 결과를 삭제합니까? (y/n)");
                if (br.readLine().equalsIgnoreCase("y")) {
                    ccl.removeResult();
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                if (br.readLine().equalsIgnoreCase("exit")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("잘못된 연산자입니다. +, -, *, / 중 하나를 입력하세요.: " + e.getMessage());
            }
        }
    }
}
