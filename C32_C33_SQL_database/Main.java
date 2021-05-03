package JavaPracticeGitHub.C32_C33_SQL_database;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/Path/To/Database/File/myFirstJDBC.db");
//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/Programare/Baza/orders2.db");
            try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/Programare/Baza/orders2.db");
            Statement statement = conn.createStatement()) {

            // avoid duplicate rows by first removing the table entirely
            statement.execute("DROP TABLE persoane");

            statement.execute("CREATE TABLE IF NOT EXISTS persoane " +
                    " (nume TEXT, adresa TEXT, limba TEXT)");

            statement.execute("INSERT INTO persoane (nume, adresa, limba) " +
                    "VALUES('Popescu G.','Buhusi','RO')");

            statement.execute("INSERT INTO persoane (nume, adresa, limba) " +
                    "VALUES('Marian V.','Cluj','EN')");

            statement.execute("INSERT INTO persoane (nume, adresa, limba) " +
                    "VALUES('Marta I.','Brasov','RO')");

            statement.execute("INSERT INTO persoane (nume, adresa, limba) " +
                    "VALUES('Balcan M.','Timisoara','RO')");

            statement.execute("INSERT INTO persoane (nume, adresa, limba) " +
                    "VALUES('Raveica R.','Timis','FR')");

            statement.execute("UPDATE persoane SET limba='DE' WHERE nume='Raveica R.'");

            statement.execute("DELETE FROM persoane WHERE limba='EN'");

            statement.execute("SELECT * FROM persoane");

            ResultSet results = statement.getResultSet();
            while(results.next()) {
                System.out.println(results.getString("nume") + " " +
                        results.getString("adresa") + " " +
                        results.getString("limba"));
            }

            results.close();

        } catch (SQLException e) {
            System.out.print("An error occured: ");
            e.printStackTrace();
        }
    }
    }



