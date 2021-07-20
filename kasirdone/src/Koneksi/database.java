/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class database {
    public static Connection con;
    private final static String host ="127.0.0.1";
    private final static String user ="root";
    private final static String pwd ="";
    private final static String db ="kasircafe";
    public static void koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"+host+"/"+db,user,pwd);            
        } catch (Exception e) {
            System.out.println("Koneksi gagal:"+e);
            System.exit(0);
        }
    }
    public static void eksekusi (String sql){
        try {
            java.sql.Statement st = con.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Eksekusi gagal:"+e);
        }
    }
    public static ResultSet AmbilData (String query){
        ResultSet rs =null;
        try {
            java.sql.Statement st = con.createStatement();
            rs =st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("AmbilData Gagal"+e);
        }
        return rs;
    }

    public static void Koneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Object GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
