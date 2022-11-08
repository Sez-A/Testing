package unit_tests.car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private List<Car> cars;

    public CarRepository() {
        this.cars = new ArrayList<>();
    }

    public Car addCar(Car car) {
        cars.add(car);
        return car;
    }
}
