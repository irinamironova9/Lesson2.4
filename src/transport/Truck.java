package transport;

import java.util.concurrent.ThreadLocalRandom;

public final class Truck extends Transport implements Competing {

    public Truck(String brand,
                 String model,
                 Double engineVolume) {

        super(brand, model, engineVolume);
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
                getBrand() + " " + getModel() +
                " с объёмом двигателя в " +
                getEngineVolume() + " литров";
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
}
