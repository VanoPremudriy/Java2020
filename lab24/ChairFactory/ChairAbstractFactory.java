package ru.mirea.java2020.lab24.ChairFactory;

public interface ChairAbstractFactory {
    public FunctionChair createFunctionChair();
    public MagicChair createMagicChair(String material);
    public VictorianChair createVictorianChair(String owner);

}