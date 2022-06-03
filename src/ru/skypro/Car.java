package ru.skypro;

public class Car extends WheelableTransport implements Serviceable, Wheelable, Engineable{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку автомобиля");
    }


    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель втомобиля");
    }


    @Override
    void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
