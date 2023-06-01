/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;
/**
 *
 * @author Viga Pratama
 */
public class Konfig {
    private static Connection MySQLConfig;

     public static Connection configDB() throws SQLException{ 
        try{
        String url = "jdbc:mysql://localhost:3306/lawyer";
        String user = "root";
        String Pass = "";
        
        DriverManager.registerDriver((new com.mysql.jdbc.Driver()));
        MySQLConfig = DriverManager.getConnection(url, user, Pass);
        
        }
        catch(SQLException e){
            System.out.println("Koneksi Database Gagal" +  e.getMessage());
        }
        return MySQLConfig;
}
}
