package racing.transport;

import java.util.concurrent.ThreadLocalRandom;

public final class Car extends Transport implements Competing {
    public Car(String brand,
               String model,
               Double engineVolume) {

        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.printf("Автомобиль %s %s начал движение.\n", getBrand(), getModel());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Автомобиль %s %s закончил движение.\n", getBrand(), getModel());
    }

    @Override
    public String toString() {
        return "Автомобиль " +
                super.toString();
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s %s совершил пит-стоп.\n", getBrand(), getModel());
    }

    @Override
    public void getBestLapTime() {
        System.out.printf("Лучшее время круга автомобиля %s %s - %s секунд.\n",
                getBrand(),
                getModel(),
                ThreadLocalRandom.current().nextInt(1, 1000));
    }

    @Override
    public void getMaxSpeed() {
        System.out.printf("Максимальная скорость автомобиля %s %s - %s км/ч.\n",
                getBrand(),
                getModel(),
                ThreadLocalRandom.current().nextInt(1, 400));
    }
}
