import racing.drivers.DriverB;
import racing.drivers.DriverC;
import racing.drivers.DriverD;
import racing.transport.Bus;
import racing.transport.Car;
import racing.transport.Truck;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Grande",1.7,
                Car.BodyType.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro",3.0,
                "   ");
        Car bmw = new Car("BMW", "Z8",3.0,
                "ПИКАП");
        Car kia = new Car("KIA", "Sportage 4",2.4,
                Car.BodyType.VAN);

        Truck volvo = new Truck("Volvo", "FH16", 7.0,
                Truck.LoadCapacityType.N1);
        Truck gaz = new Truck("ГАЗ", "3307", 8.0,
                Truck.LoadCapacityType.N2);
        Truck kamaz = new Truck("КАМАЗ", "65115", 6.5,
                null);
        Truck iveco = new Truck("Iveco", "S-Way", 9.4,
                Truck.LoadCapacityType.N3);

        Bus bus1 = new Bus("JHF", "B-43", 6.0,
                Bus.CapacityType.LARGE);
        Bus bus2 = new Bus("VLJHF", "hf 321", 6.3,
                Bus.CapacityType.SMALL);
        Bus bus3 = new Bus("Toyota", "Bus-157", 6.5,
                null);
        Bus bus4 = new Bus("PAZ", "3205", 6.5,
                Bus.CapacityType.VERY_LARGE);

//        System.out.println(lada);
//        System.out.println(volvo);
//        System.out.println(bus1);
//        System.out.println();
//
//        audi.startMoving();
//        gaz.startMoving();
//        bus2.startMoving();
//        System.out.println();
//
//        bmw.stopMoving();
//        kamaz.stopMoving();
//        bus3.stopMoving();
//        System.out.println();
//
//        kia.pitStop();
//        kia.getBestLapTime();
//        kia.getMaxSpeed();
//        System.out.println();
//
//        iveco.pitStop();
//        iveco.getBestLapTime();
//        iveco.getMaxSpeed();
//        System.out.println();
//
//        bus4.pitStop();
//        bus4.getBestLapTime();
//        bus4.getMaxSpeed();
//        System.out.println();
//
//        DriverC alisa = new DriverC("Алиса", 7, iveco);
//        DriverB john = new DriverB<>("John", 5, kia);
//        DriverD anna = new DriverD<>("Анна", 10, bus4);
//
//        alisa.participateInRacing();
//        john.participateInRacing();
//        anna.participateInRacing();

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);

        Car.BodyType.displayCarBodyType(lada);
        Car.BodyType.displayCarBodyType(audi);
        Car.BodyType.displayCarBodyType(bmw);
        Car.BodyType.displayCarBodyType(kia);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

        Bus.CapacityType.displayBusCapacityType(bus1);
        Bus.CapacityType.displayBusCapacityType(bus2);
        Bus.CapacityType.displayBusCapacityType(bus3);
        Bus.CapacityType.displayBusCapacityType(bus4);

        System.out.println(volvo);
        System.out.println(gaz);
        System.out.println(kamaz);
        System.out.println(iveco);

        Truck.LoadCapacityType.displayTruckLoadCapacityType(volvo);
        Truck.LoadCapacityType.displayTruckLoadCapacityType(gaz);
        Truck.LoadCapacityType.displayTruckLoadCapacityType(kamaz);
        Truck.LoadCapacityType.displayTruckLoadCapacityType(iveco);
    }
}