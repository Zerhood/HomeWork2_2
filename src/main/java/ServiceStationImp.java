public class ServiceStationImp implements ServiceStation {
    @Override
    public void check(Car car) {
        checkAuto(car);
        car.checkEngine();
    }

    @Override
    public void check(Bicycle bicycle) {
        checkAuto(bicycle);
    }

    @Override
    public void check(Truck truck) {
        checkAuto(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }
}