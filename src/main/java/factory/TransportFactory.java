package factory;

import constants.TransportType;
import transport.Transport;
import transport.vehicles.Bus;
import transport.vehicles.Car;
import transport.vehicles.Motorcycle;
import transport.vehicles.Scooter;

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
