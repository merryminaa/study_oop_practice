package org.example.calculate;

public class PositiveNumber {
    
    private final int value;

    public PositiveNumber(int value) throws IllegalAccessException {
        validate(value);
        this.value = value;
    }

    private void validate(int value) throws IllegalAccessException {
        if (isNegativeNumber(value)) {
            throw new IllegalAccessException("0 또는 음수를 전달할 수 없습니다.");
        }
    }

    private boolean isNegativeNumber(int value) {
        return value < 1;
    }

    public int toInt() {
        return value;
    }
}
