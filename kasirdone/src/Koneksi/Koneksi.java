/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Koneksi {

    
     public static Connection getKoneksi(String host, String port, String username, String password, String db){
        String konString ="jdbc:mysql://" + host + ":" + port + "/" + db;
        Connection Koneksi = null;
       try {
            Class.forName("com.mysql.jdbc.Driver");
            Koneksi = DriverManager.getConnection(konString, username, password);
            System.out.println("koneksi berhasil");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Koneksi Database Error " + ex.getMessage());
            Koneksi = null;         
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "kelas Error " + ex.getMessage());
            
        }
       return Koneksi;
}

    public static void Connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
