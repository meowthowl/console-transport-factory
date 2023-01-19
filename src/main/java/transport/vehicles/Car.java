package transport.vehicles;

import transport.Transport;

public class Car extends Transport {
    public Car() {
        this.name = "Машина";
        this.wheels = 4;
        this.maxSpeed = 150;
    }

    @Override
    public String getUniqueCharacteristics() {
        return "Может перевозить до 5 пассажиров";
    }

    @Override
    public String toString() {
        return "Название: " + name + '\n'
                + "Кол-во колес: " + wheels + '\n'
                + "Максимальная скорость: " + maxSpeed + "км/ч" + '\n'
                + getUniqueCharacteristics() + '\n';
    }
}
