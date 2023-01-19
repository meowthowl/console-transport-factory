package ru.meowthowl.utils;

import ru.meowthowl.constants.ErrorMessages;
import ru.meowthowl.constants.TransportType;
import ru.meowthowl.factory.TransportFactory;
import ru.meowthowl.transport.Transport;

public class ArgsUtils {

    public static void parseArgs(String[] args){
        if (args.length == 0) {
            System.out.println(ErrorMessages.NO_ARGUMENTS_MESSAGE);
        }
        TransportFactory factory = new TransportFactory();
        for (String arg : args) {
            int type = Integer.parseInt(arg);
            TransportType transportType = TransportType.getTypeFromParameter(type);
            if (transportType == null) {
                System.out.println(ErrorMessages.UNKNOWN_TRANSPORT_TYPE + arg);
                continue;
            }
            Transport transport = factory.createTransport(transportType);
            System.out.println(transport);
        }
    }
}
