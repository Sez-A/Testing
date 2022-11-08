package unit_tests.booking_manager;

import java.sql.SQLException;
import java.util.List;

public class BookingManager {
    private HotelDao hotelDao;

    public BookingManager(HotelDao hotelDao) {
        this.hotelDao = hotelDao;
    }

    public boolean checkRoomByNameIsAvailable(String roomName) throws SQLException {
        List<String> availableRooms = hotelDao.fetchAvailableRooms();
        return availableRooms.contains(roomName);
    }
}
