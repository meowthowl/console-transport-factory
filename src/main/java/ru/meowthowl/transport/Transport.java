package ru.meowthowl.transport;

import lombok.Data;
@Data
public abstract class Transport {

    protected String name;
    protected int wheels;
    protected int maxSpeed;

    public abstract String toString();

    public abstract String getUniqueCharacteristics();
}


