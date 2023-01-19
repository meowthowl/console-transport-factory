package ru.meowthowl.transport.vehicles;

import ru.meowthowl.transport.Transport;

public class Scooter extends Transport {
    public Scooter() {
        this.name = "Самокат";
        this.wheels = 2;
        this.maxSpeed = 30;
    }

    @Override
    public String getUniqueCharacteristics() {
        return "Может перевозить до 1 пассажира";
    }

    @Override
    public String toString() {
        return  "Название: " + name + '\n'
                + "Кол-во колес: " + wheels + '\n'
                + "Максимальная скорость: " + maxSpeed + "км/ч" + '\n'
                + getUniqueCharacteristics() + '\n';
    }
}
