
	public class DatabaseConnection {
	    private static final String URL = "jdbc:mysql://localhost:3306/health_tracker";
	    private static final String USER = "root";
	    private static final String PASSWORD = "password";

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(URL, USER, PASSWORD);
	    }
	}

