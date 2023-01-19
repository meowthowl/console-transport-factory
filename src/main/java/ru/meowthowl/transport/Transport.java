package ru.meowthowl.transport;

public abstract class Transport {
    protected String name;
    protected int wheels;
    protected int maxSpeed;

    public abstract String toString();

    public abstract String getUniqueCharacteristics();
}


