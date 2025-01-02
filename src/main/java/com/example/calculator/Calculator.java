package com.example.calculator;

import java.io.*;
import java.util.*;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("첫 번째 수를 입력하세요 (0포함): ");
            int num1 = Integer.parseInt(br.readLine());

            System.out.println("두 번째 수를 입력하세요 (0포함): ");
            int num2 = Integer.parseInt(br.readLine());

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = br.readLine().charAt(0);

            int result = 0;
            boolean check = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                case '*':
                    result = num1 * num2;
                case '/':
                    if (num2 == 0) {
                        System.out.println(" 나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        check = false;
                    } else result = num1 / num2;
                default:
                    System.out.println("올바른 사칙연산 입력해주세요.");
            }
            if (check) System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            if (br.readLine().equalsIgnoreCase("exit")) break;
        }
    }
}
