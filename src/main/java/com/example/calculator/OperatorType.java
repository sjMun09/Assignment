package com.example.calculator;

import java.util.Arrays;

public enum OperatorType {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    ;

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static OperatorType fromChar(char symbol) {
        return Arrays.stream(values())
                .filter(type -> type.getSymbol() == symbol)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 연산자입니다: " + symbol));
    }
}
