package lab6;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

public class DatabaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseService.class);

    public void exec() {
        DBProperties properties = DBProperties.getProperties();
        try(Connection connection = DriverManager.getConnection(
                properties.getUrl(),
                properties.getUser(),
                properties.getPassword()
        )) {
            getStudents(connection); //достать инфу о студенте
            addStudent(connection);
            updateStudent(connection);
            transaction(connection);
        }
        catch (SQLException e) {
            LOGGER.info(e.getMessage(), e); //выброс ошибки
        }
    }

    private void getStudents(@NotNull Connection connection) throws SQLException {
        String query = "SELECT s.id, s.name, s.surname, s.group_id FROM student s";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            try(ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    LOGGER.info(
                            "id: {}, name: {}, surname: {}, group_id: {}",
                            result.getInt("id"),
                            result.getString("name"),
                            result.getString("surname"),
                            result.getString("group_id")
                    );
                }
            }
        }
    }

    private void addStudent(@NotNull Connection connection) throws SQLException {
        String query = "INSERT INTO student (name, surname, group_id) VALUES (?, ?, ?)";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "Пупа");
            statement.setString(2, "Лупипупин");
            statement.setLong(3, 1);
            statement.executeUpdate();
        }
    }
    private void updateStudent(@NotNull Connection connection) throws SQLException {
        String query = "UPDATE student SET name = ? WHERE id = ?";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "Владимир Путин");
            statement.setLong(2, 5);
            statement.execute();
        }
    }
    private void transaction(@NotNull Connection connection) throws SQLException {
        String query = "UPDATE student SET name = ? WHERE id = ?";
        connection.setAutoCommit(false);
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "Наруто Узумаки");
            statement.setLong(2, 6);
            statement.execute();

            String example = null;
            example.toString();
            connection.commit();
        }
        catch (RuntimeException e) {
            LOGGER.info("Ошибка {}", e.getMessage());
            connection.rollback();
        }
        finally {
            connection.setAutoCommit(true);
        }
    }
}
