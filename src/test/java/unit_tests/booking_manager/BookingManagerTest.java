package unit_tests.booking_manager;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class BookingManagerTest {

    private HotelDao hotelDaoMock;
    private BookingManager bookingManager;

    @Before
    public void setup() throws SQLException {
        hotelDaoMock = Mockito.mock(HotelDao.class);
        bookingManager = new BookingManager(hotelDaoMock);
        List<String> availableRooms = List.of("A");
        when(hotelDaoMock.fetchAvailableRooms()).thenReturn(availableRooms);
    }

    @Test
    public void checkRoomByNameIsAvailableShouldReturnTrue() throws SQLException {
        assertTrue(bookingManager.checkRoomByNameIsAvailable("A"));
    }

    @Test
    public void checkRoomByNameIsAvailableShouldReturnFalse() throws SQLException {
        assertFalse(bookingManager.checkRoomByNameIsAvailable("C"));
    }

}