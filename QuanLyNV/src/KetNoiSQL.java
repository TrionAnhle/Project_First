/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Trion
 */
public class KetNoiSQL {
    public static Connection layKetNoi(){
        Connection ketNoi = null;
        String uRL = "jdbc:sqlserver://;databaseName=QLSinhVien";
        String user = "sa";
        String pass= "123";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi= DriverManager.getConnection(uRL, user, pass);
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Loi ket noi SQL: "+ex.getMessage());
        }
        return ketNoi;
    }
    public static void main(String[] args) {
        KetNoiSQL.layKetNoi();
    }
}
