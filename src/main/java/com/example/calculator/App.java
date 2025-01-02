package com.example.calculator;

import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Calculator ccl = new Calculator();

        while (true) {
            System.out.println("첫 번째 수를 입력하세요 (0포함): ");
            int num1 = Integer.parseInt(br.readLine());

            System.out.println("두 번째 수를 입력하세요 (0포함): ");
            int num2 = Integer.parseInt(br.readLine());

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = br.readLine().charAt(0);

            int result = ccl.calculate(num1, num2, operator);
            System.out.println("결과: " + result);
            System.out.println("결과 목록: " + ccl.getResults());

            System.out.println("가장 먼저 저장된 연산 결과를 삭제합니까?: ");
            String remove = br.readLine();
            if (remove.equalsIgnoreCase("yes")) ccl.removeResult();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (br.readLine().equalsIgnoreCase("exit")) break;
        }
    }
}
