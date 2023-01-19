package ru.meowthowl.transport.vehicles;

import ru.meowthowl.transport.Transport;

public class Bus extends Transport {
    public Bus() {
        this.name = "Автобус";
        this.wheels = 6;
        this.maxSpeed = 100;
    }

    @Override
    public String getUniqueCharacteristics() {
        return "Может перевозить до 30 пассажиров";
    }

    @Override
    public String toString() {
        return  "Название: " + name + '\n'
                + "Кол-во колес: " + wheels + '\n'
                + "Максимальная скорость: " + maxSpeed + "км/ч" + '\n'
                + getUniqueCharacteristics() + '\n';
    }
}
