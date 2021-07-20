/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private static Connection Koneksi;
    
    public static Connection GetConnection () throws  SQLException {
        if (Koneksi==null) { 
            new Driver();
            
            Koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/kasircafe","root","");
            }
        return Koneksi;
    }

    public static void Koneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
