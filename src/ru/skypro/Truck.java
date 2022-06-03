package ru.skypro;

public class Truck extends WheelableTransport implements Serviceable, Wheelable {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }


    @Override
    void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
