public interface ServiceStation {
    void check(Car car);
    void check(Bicycle bicycle);
    void check(Truck truck);
    default void checkAuto(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }
}