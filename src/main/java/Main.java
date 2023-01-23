import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Slf4j
public class Main {

    public static void main(String[] args) {

        try (Connection connection =
                     DriverManager.getConnection("postgresql://postgres:root@localhost:5432/postgres")) {
            if (connection != null) {
                log.info("Connected successful!");
            } else {
                log.info("Connection not established...");
            }
        } catch (SQLException s) {
            log.error("Error: %s".formatted(s.getMessage()));
        }
    }
}
