package ITV;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ITVSimulation {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();


        Random random = new Random();
        long simulationTime = 60;
        long simulationStart = System.currentTimeMillis() / 1000;

        System.out.println("ITV Simulation - Vehicle Technical Inspection");
        System.out.println("--------------------------------------------------");

        while (System.currentTimeMillis() / 1000 - simulationStart < simulationTime) {
            try {

                Thread.sleep(1000);


                int vehicleType = random.nextInt(3);


                switch (vehicleType) {
                    case 0:
                        vehicles.add(new Turismo("BrandTurismo" + vehicles.size(), "Model" + vehicles.size(), System.currentTimeMillis() / 1000));
                        break;
                    case 1:
                        vehicles.add(new Truck("BrandTruck" + vehicles.size(), random.nextInt(1000), System.currentTimeMillis() / 1000));
                        break;
                    case 2:
                        vehicles.add(new Motorbike("BrandMotorbike" + vehicles.size(), random.nextBoolean(), System.currentTimeMillis() / 1000));
                        break;
                }

                System.out.println("New vehicle arrived: Type - " + vehicles.get(vehicles.size() - 1).getType() +
                        ", Entry Time - " + vehicles.get(vehicles.size() - 1).getEntryTime());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("\nStarting vehicle inspection:");
        for (Vehicle vehicle : vehicles) {
            vehicle.inspection();
        }
    }
}
