package ru.mirea.java2020.lab24.ComplexNumbers;

public class ComplexNumbersFactory implements ComplexNumbersAbstractFactory {
    @Override
    public ComplexNumber produceNumber(double x, double y) {
        return new ComplexNumber(x, y);
    }
}