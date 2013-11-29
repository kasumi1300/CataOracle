
package cataoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.spi.DirStateFactory.Result;
import oracle.jdbc.OracleDriver;
public class CataOracle {

    public static void main(String[] args) throws SQLException {
        String userName = "system";
        String password = "orcl";
        String server = "localhost:100/orcl";
        DriverManager.registerDriver(new OracleDriver());
        // jdbc:oracle:thin:@server,userName,password
        Connection connection = DriverManager.getConnection
                ("jdbc:oracle:thin:@" + server, userName, password);
        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery("select * from CAMBIO_EUR_A_");
        while(set.next()){
            printRegister(set);
        }        
    }
    private static void printRegister(Result)
}
