package racing.transport;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public final class Truck extends Transport implements Competing {

    public enum LoadCapacityType {

        N1("N1 (с полной массой до 3,5 тонн)"),
        N2("N2 (с полной массой свыше 3,5 до 12 тонн)"),
        N3("N3 (с полной массой свыше 12 тонн)");

        private final String loadCapacity;

        LoadCapacityType(String loadCapacity) {
            this.loadCapacity = loadCapacity;
        }

        public static void displayTruckLoadCapacityType(Truck truck) {
            if (truck.getLoadCapacityType() == null) {
                System.out.printf("Нет данных о грузоподъёмности грузовика %s %s.\n",
                        truck.getBrand(), truck.getModel());
                return;
            }
            for (int i = 0; i < Truck.LoadCapacityType.values().length; i++) {
                if (truck.getLoadCapacityType().equals(Truck.LoadCapacityType.values()[i])) {
                    System.out.printf("Тип грузоподъёмности грузовика %s %s - %s.\n",
                            truck.getBrand(), truck.getModel(),
                            Truck.LoadCapacityType.values()[i].getLoadCapacity());
                }
            }
        }

        @Override
        public String toString() {
            return loadCapacity;
        }

        public String getLoadCapacity() {
            return loadCapacity;
        }
    }

    private final LoadCapacityType loadCapacityType;

    public Truck(String brand,
                 String model,
                 Double engineVolume,
                 LoadCapacityType loadCapacityType) {

        super(brand, model, engineVolume);
        this.loadCapacityType = loadCapacityType;
    }

    @Override
    public void startMoving() {
        System.out.printf("Грузовик %s %s начал движение.\n", getBrand(), getModel());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Грузовик %s %s закончил движение.\n", getBrand(), getModel());
    }

    @Override
    public String toString() {
        return "Грузовик " +
                super.toString() +
                " и типом грузоподъёмности " + Objects.requireNonNullElse(loadCapacityType, "(информация не указана)");
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовик %s %s совершил пит-стоп.\n", getBrand(), getModel());
    }

    @Override
    public void getBestLapTime() {
        System.out.printf("Лучшее время круга грузовика %s %s - %s секунд.\n",
                getBrand(),
                getModel(),
                ThreadLocalRandom.current().nextInt(1, 1000));
    }

    @Override
    public void getMaxSpeed() {
        System.out.printf("Максимальная скорость грузовика %s %s - %s км/ч.\n",
                getBrand(),
                getModel(),
                ThreadLocalRandom.current().nextInt(1, 200));
    }

    public LoadCapacityType getLoadCapacityType() {
        return loadCapacityType;
    }
}
