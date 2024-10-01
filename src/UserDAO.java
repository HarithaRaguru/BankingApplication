import java.sql.Connection;

public class UserDAO {
	    public void registerUser(User user) {
	        String query = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";

	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement statement = connection.prepareStatement(query)) {

	            statement.setString(1, user.getUsername());
	            statement.setString(2, user.getPassword());
	            statement.setString(3, user.getEmail());

	            statement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
