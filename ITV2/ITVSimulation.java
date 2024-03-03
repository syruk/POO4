package ITV2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ITVSimulation {
    public static void main(String[] args) {
        List<Transport> transports = new ArrayList<>();


        Random random = new Random();
        long simulationTime = 60;
        long simulationStart = System.currentTimeMillis() / 1000;

        System.out.println("ITV Simulation - Transport Inspection");
        System.out.println("------------------------------------------");

        while (System.currentTimeMillis() / 1000 - simulationStart < simulationTime) {
            try {

                Thread.sleep(1000);


                int transportType = random.nextInt(3);


                switch (transportType) {
                    case 0:
                        transports.add(new Car("BrandCar" + transports.size(), "Model" + transports.size(), System.currentTimeMillis() / 1000));
                        break;
                    case 1:
                        transports.add(new Airplane("Airline" + transports.size(), random.nextInt(500), System.currentTimeMillis() / 1000));
                        break;
                    case 2:
                        transports.add(new Boat("NameBoat" + transports.size(), random.nextInt(100), System.currentTimeMillis() / 1000));
                        break;
                }

                System.out.println("New transport arrived: Type - " + transports.get(transports.size() - 1).getType() +
                        ", Entry Time - " + transports.get(transports.size() - 1).getEntryTime());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("\nStarting transport inspection:");
        for (Transport transport : transports) {
            transport.inspection();
        }
    }
}
