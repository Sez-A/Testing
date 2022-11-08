package unit_tests.booking_manager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HotelDao {
    public List<String> fetchAvailableRooms() throws SQLException {
        List<String> availableRooms = new ArrayList<>();
        Connection connection = DriverManager.getConnection("DATABASE_URL");
        Statement statement = connection.createStatement();
        ResultSet rs;
        rs = statement.executeQuery("SELECT * FROM ROOMS WHERE AVAILABLE LIKE '1'");
        while (rs.next()) {
            availableRooms.add(rs.getString("Room name"));
        }
        return availableRooms;
    }


}
