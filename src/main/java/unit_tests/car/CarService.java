package unit_tests.car;

public class CarService {
    private CarRepository carRepository;
    private CarRepo carRepo;

    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public void addCarToRepo(Car car) {
        this.carRepo.save(car);
    }
}
