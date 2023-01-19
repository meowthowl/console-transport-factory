package transport.vehicles;

import transport.Transport;

public class Motorcycle extends Transport {
    public Motorcycle() {
        this.name = "Мотоцикл";
        this.wheels = 2;
        this.maxSpeed = 180;
    }

    @Override
    public String getUniqueCharacteristics() {
        return "Может перевозить до 2-х пассажиров";
    }

    @Override
    public String toString() {
        return "Название: " + name + '\n'
                + "Кол-во колес: " + wheels + '\n'
                + "Максимальная скорость: " + maxSpeed + "км/ч" + '\n'
                + getUniqueCharacteristics() + '\n';
    }
}
