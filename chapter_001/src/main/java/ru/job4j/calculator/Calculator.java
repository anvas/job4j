package ru.job4j.calculator;

/**
 * Calculator.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 */

public class Calculator {
    private double result;

    /**
     * Method add. Addition of arguments.
     * @param first First argument.
     * @param second Second argument.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method subtract. Subtraction of arguments
     * @param first First argument.
     * @param second Second argument.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method multiple. Multiplication of arguments.
     * @param first First argument.
     * @param second Second argument.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method div. Division of arguments.
     * @param first First argument.
     * @param second Second argument.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method getResult.
     * @return Returns the value of the field result.
     */
    public double getResult() {
        return this.result;
    }
}