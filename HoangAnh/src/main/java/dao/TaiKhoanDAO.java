
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DbContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.TaiKhoan;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanDAO {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    public TaiKhoan DangNhap( String tênĐN, String MK)
    {   
        TaiKhoan kq = null;
        String sql="select* from TaiKhoan where TenĐN=? and MK=?";
        conn =DbContext.getConnection();
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1, tênĐN);
            ps.setString(2, MK);
            rs=ps.executeQuery();
            if(rs.next()) {
               kq = new TaiKhoan(rs.getString(1),rs.getString(2));
            }
        } catch (Exception ex) {
            System.out.println("loi:"+ ex.toString());
        }
        return  kq;
    }
}
