package lab1.Builder;

public class BuilderService {

    public void exec() {
        //строим 1-ю машину
        CarBuilder builder1 = new CarBuilder();

        builder1.setCarType(CarType.SPORTS_CAR);
        builder1.setSeats(2);
        builder1.setEngine(new Engine(3.0, 0));
        builder1.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder1.setTripComputer(new TripComputer());
        builder1.setGPSNavigator(new GPSNavigator());

        Car car1 = builder1.getResult();
        System.out.println("Car built:\n" + car1.getCarType());

        //строим 2-ю машину
        CarBuilder builder2= new CarBuilder();

        builder2.setCarType(CarType.CITY_CAR);
        builder2.setSeats(5);
        builder2.setEngine(new Engine(2.1, 0));
        builder1.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder1.setTripComputer(new TripComputer());
        builder1.setGPSNavigator(new GPSNavigator());
    }
}
