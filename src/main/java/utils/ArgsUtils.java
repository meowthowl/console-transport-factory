package utils;

import constants.ErrorMessages;
import constants.TransportType;
import factory.TransportFactory;
import transport.Transport;

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
