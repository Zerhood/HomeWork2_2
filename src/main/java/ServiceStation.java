public interface ServiceStation {
    void check(Car car);
    void check(Bicycle bicycle);
    void check(Truck truck);
    default void checkAuto(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}