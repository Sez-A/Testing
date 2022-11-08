package unit_tests.car;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CarServiceTest {

    //    private CarRepository carRepositoryMock;
    private CarService carService;
    private CarRepo carRepo;

    @Before
    public void setup() {
        carRepo = mock(CarRepo.class);
        carService = new CarService(carRepo);
    }

    @Test
    public void addCarMethodShouldAddCarInRepo() {
        Car carToAdd = new Car("BMW", "M5", "Diesel", 2015);
        Car expected = carToAdd;
        when(carRepo.save(carToAdd))
                .thenReturn(expected);

        carService.addCarToRepo(carToAdd);

        assertSame(carToAdd, expected);
    }
}