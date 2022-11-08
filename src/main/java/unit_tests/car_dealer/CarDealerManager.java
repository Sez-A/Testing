package unit_tests.car_dealer;

import java.util.List;

public class CarDealerManager {
    private CarDao carDao;

    public CarDealerManager(CarDao carDao) {
        this.carDao = carDao;
    }

    public boolean checkCarIsAvailableByMake(String make) {
        List<String> availableCars = carDao.availableCars();
        return availableCars.contains(make);
    }
}
