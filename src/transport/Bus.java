package transport;

import java.util.concurrent.ThreadLocalRandom;

public final class Bus extends Transport implements Competing {

    public Bus(String brand,
               String model,
               Double engineVolume) {

        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.printf("Автобус %s %s начал движение.\n", getBrand(), getModel());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Автобус %s %s закончил движение.\n", getBrand(), getModel());
    }

    @Override
    public String toString() {
        return "Автобус " +
                getBrand() + " " + getModel() +
                " с объёмом двигателя в " +
                getEngineVolume() + " литров";
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s совершил пит-стоп.\n", getBrand(), getModel());
    }

    @Override
    public void getBestLapTime() {
        System.out.printf("Лучшее время круга автобуса %s %s - %s секунд.\n",
                getBrand(),
                getModel(),
                ThreadLocalRandom.current().nextInt(1, 1000));
    }

    @Override
    public void getMaxSpeed() {
        System.out.printf("Максимальная скорость автобуса %s %s - %s км/ч.\n",
                getBrand(),
                getModel(),
                ThreadLocalRandom.current().nextInt(1, 300));
    }
}
