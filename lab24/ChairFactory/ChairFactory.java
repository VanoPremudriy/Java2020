package ru.mirea.java2020.lab24.ChairFactory;

public class ChairFactory implements ChairAbstractFactory {
    @Override
    public FunctionChair createFunctionChair() {
        return new FunctionChair();
    }

    @Override
    public MagicChair createMagicChair(String material) {
        return new MagicChair(material);
    }

    @Override
    public VictorianChair createVictorianChair(String owner) {
        return new VictorianChair(owner);
    }
}