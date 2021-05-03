package JavaPracticeGitHub.C32_C33_SQL_database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainRefractorizare {
    public static final String DB_NAME = "orders2.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Programare/Baza/" + DB_NAME;

    public static final String TABLE_PERSONS = "persoane";

    public static final String COLUMN_NAME = "nume";
    public static final String COLUMN_ADDRESS = "adresa";
    public static final String COLUMN_LANGUAGE = "limba";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement()) {

            // avoid duplicate rows by first removing the table entirely
            statement.execute("DROP TABLE IF EXISTS " + TABLE_PERSONS);

            statement.execute("CREATE TABLE IF NOT EXISTS " +
                    TABLE_PERSONS +
                    " (" + COLUMN_NAME + " TEXT, " +
                    COLUMN_ADDRESS + " TEXT, " +
                    COLUMN_LANGUAGE + " TEXT" +
                    ")");

            insertPerson(statement, "Popescu G.", "Buhusi", "RO");
            insertPerson(statement, "Marian V.", "Cluj", "EN");
            insertPerson(statement, "Marta I.", "Brasov", "RO");
            insertPerson(statement, "Balcan M.", "Timisoara", "RO");
            insertPerson(statement, "Raveica R.", "Timis", "FR");

            statement.execute("UPDATE persoane SET limba='DE' WHERE nume='Raveica R.'");

            statement.execute("DELETE FROM persoane WHERE limba='EN'");

            statement.execute("SELECT * FROM persoane");

            ResultSet results = statement.getResultSet();
            while(results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getString(COLUMN_ADDRESS) + " " +
                        results.getString(COLUMN_LANGUAGE));
            }

            results.close();

        } catch (SQLException e) {
            System.out.print("An error occured: ");
            e.printStackTrace();
        }
    }
    private static void insertPerson(Statement statement, String name, String address,
                                     String language) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_PERSONS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LANGUAGE +
                " ) " +
                "VALUES('" + name + "', '" + address + "', '" + language + "')");
    }
}
