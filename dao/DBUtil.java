package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class DBUtil {
    static private final String DB_URL = "jdbc:mysql://localhost:3306/school?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    static private final String DB_USER = "root";
    static private final String DB_PASS = "Darkstar20";

    public static Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        return connection;
    }

//    public static int insert(Connection conn, String query, String... params) {
//        try (PreparedStatement statement = conn.prepareStatement(query)) {
//            for (int i = 0; i < params.length; i++) {
//                statement.setString(i + 1, params[i]);
//            }
//            return statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
}

