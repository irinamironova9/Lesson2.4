import racing.drivers.DriverB;
import racing.drivers.DriverC;
import racing.drivers.DriverD;
import racing.transport.Bus;
import racing.transport.Car;
import racing.transport.Truck;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Grande",1.7);
        Car audi = new Car("Audi", "A8 50 L TDI quattro",3.0);
        Car bmw = new Car("BMW", "Z8",3.0);
        Car kia = new Car("KIA", "Sportage 4",2.4);

        Truck volvo = new Truck("Volvo", "FH16", 7.0);
        Truck gaz = new Truck("ГАЗ", "3307", 8.0);
        Truck kamaz = new Truck("КАМАЗ", "65115", 6.5);
        Truck iveco = new Truck("Iveco", "S-Way", 9.4);

        Bus bus1 = new Bus("JHF", "B-43", 6.0);
        Bus bus2 = new Bus("VLJHF", "hf 321", 6.3);
        Bus bus3 = new Bus("Toyota", "Bus-157", 6.5);
        Bus bus4 = new Bus("PAZ", "3205", 6.5);

        System.out.println(lada);
        System.out.println(volvo);
        System.out.println(bus1);
        System.out.println();

        audi.startMoving();
        gaz.startMoving();
        bus2.startMoving();
        System.out.println();

        bmw.stopMoving();
        kamaz.stopMoving();
        bus3.stopMoving();
        System.out.println();

        kia.pitStop();
        kia.getBestLapTime();
        kia.getMaxSpeed();
        System.out.println();

        iveco.pitStop();
        iveco.getBestLapTime();
        iveco.getMaxSpeed();
        System.out.println();

        bus4.pitStop();
        bus4.getBestLapTime();
        bus4.getMaxSpeed();
        System.out.println();

        DriverC alisa = new DriverC("Алиса", 7, iveco);
        DriverB john = new DriverB<>("John", 5, kia);
        DriverD<Bus> anna = new DriverD<>("Анна", 10, bus4);

        alisa.participateInRacing();
        john.participateInRacing();
        anna.participateInRacing();
    }
}