
package cataoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;
public class CataOracle {

    public static void main(String[] args) throws SQLException {
        String userName = "system";
        String password = "orcl";
        String server = "localhost:100";
        DriverManager.registerDriver(new OracleDriver());
        // jdbc:oracle:thin:@server,userName,password
        Connection connection = DriverManager.getConnection
                ("jdbc:oracle:thin:@" + server, userName, password);
    }
}
