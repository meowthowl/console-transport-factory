package constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TransportType {
    MOTORCYCLE(0),
    SCOOTER(1),
    CAR(2),
    BUS(3);

    private final int value;

    public static TransportType getTypeFromParameter(int x) {
        return switch (x) {
            case 0 -> MOTORCYCLE;
            case 1 -> SCOOTER;
            case 2 -> CAR;
            case 3 -> BUS;
            default -> null;
        };
    }
}
