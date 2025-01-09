package com.example.calculator;

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
        for (OperatorType type : values()) {
            if (type.getSymbol() == symbol) {
                return type;
            }
        }
        throw new IllegalArgumentException("유효하지 않은 연산자입니다: " + symbol);
    }

}
