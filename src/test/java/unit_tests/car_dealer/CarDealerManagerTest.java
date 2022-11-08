package unit_tests.car_dealer;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CarDealerManagerTest {

    private CarDao carDaoMock;
    private CarDealerManager carDealerManager;

    @Before
    public void setup() {
        carDaoMock = mock(CarDao.class);
        carDealerManager = new CarDealerManager(carDaoMock);
        List<String> availableCars = List.of("Toyota", "Hyundai");
        when(carDaoMock.availableCars()).thenReturn(availableCars);
    }

    @Test
    public void checkCarIsAvailableByMakeShouldReturnTrue() {
        assertTrue(carDealerManager.checkCarIsAvailableByMake("Toyota"));
    }

    @Test
    public void checkCarIsAvailableByMakeShouldReturnFalse() {
        assertFalse(carDealerManager.checkCarIsAvailableByMake("Not exiting car!"));
    }
}