package com.example.calculator;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArithmeticCalculator<Double> ccl = new ArithmeticCalculator<>();

        while (true) {
            double num1 = 0, num2 = 0;
            OperatorType operator = null;

            // 첫 번째 숫자 입력 처리
            try {
                System.out.println("첫 번째 수를 입력하세요 (0포함): ");
                num1 = Double.parseDouble(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 숫자입니다. 다시 입력해주세요.");
                continue;
            }

            // 연산자 입력 처리
            try {
                System.out.println("사칙연산 기호를 입력하세요 (+, -, *, /): ");
                char operatorChar = br.readLine().charAt(0);
                operator = OperatorType.fromChar(operatorChar);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            // 두 번째 숫자 입력 처리
            try {
                System.out.println("두 번째 수를 입력하세요 (0포함): ");
                num2 = Double.parseDouble(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 숫자입니다. 다시 입력해주세요.");
                continue;
            }

            // 계산 및 결과 출력
            try {
                double result = ccl.calculate(num1, num2, operator);
                System.out.println("결과: " + result);
                System.out.println("결과 목록: " + ccl.getResults());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                continue;
            }

            // 결과 목록 처리
            System.out.println("결과값 중 특정 값보다 큰 결과를 조회하시겠습니까? (y/n)");
            if (br.readLine().equalsIgnoreCase("y")) {
                try {
                    System.out.println("조회 기준값을 입력하세요: ");
                    double threshold = Double.parseDouble(br.readLine());
                    System.out.println("조회 결과: " + ccl.getResultsGreaterThan(threshold));
                } catch (NumberFormatException e) {
                    System.out.println("유효하지 않은 숫자입니다. 조회를 건너뜁니다.");
                }
            }

            // 결과 삭제 처리
            System.out.println("가장 먼저 저장된 연산 결과를 삭제합니까? (y/n)");
            if (br.readLine().equalsIgnoreCase("y")) {
                ccl.removeResult();
            }

            // 프로그램 종료 여부 확인
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (br.readLine().equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}
