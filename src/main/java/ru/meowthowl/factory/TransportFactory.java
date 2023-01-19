package ru.meowthowl.factory;

import ru.meowthowl.constants.TransportType;
import ru.meowthowl.transport.Transport;
import ru.meowthowl.transport.vehicles.Bus;
import ru.meowthowl.transport.vehicles.Car;
import ru.meowthowl.transport.vehicles.Motorcycle;
import ru.meowthowl.transport.vehicles.Scooter;

public class TransportFactory {
    public Transport createTransport(TransportType type) {
        return switch (type) {
            case MOTORCYCLE -> new Motorcycle();
            case SCOOTER -> new Scooter();
            case CAR -> new Car();
            case BUS -> new Bus();
        };
    }
}
