package com.example.demolog4j.addNumber;

public class NumberCostume {

    private Integer firstNumber;
    private Integer secondNumber;

    public NumberCostume(Integer firstNumber, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Integer getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Integer firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Integer getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Integer secondNumber) {
        this.secondNumber = secondNumber;
    }

    public NumberCostume() {
    }

    public static Integer add(Integer firstNumber, Integer secondNumber) {
        return firstNumber + secondNumber;
    }
}
