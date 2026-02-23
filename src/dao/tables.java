/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Deepak Shyam
 */
public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(200),mobilenumber varchar(50),email varchar(200),password varchar(50),address varchar(200),status varchar(500))");
            //st.executeUpdate("insert into appuser(userRole,name,mobilenumber,email,password,address,status) values('superAdmin','superadmi','12345','superadmin@testemail.com','admin','india','Active')");
            //st.executeUpdate("insert into appuser(userRole,name,mobilenumber,email,password,address,status) values('Manager','balaji','9042074459','balaji@gmail.com','bal','india,madurai','Active')");
            //st.executeUpdate("create table customer(customer_pk int AUTO_INCREMENT primary key,nme varchar(200),mobileno varchar(50),email varchar(200))");
            //st.executeUpdate("create table savecarts(cartpk_id int AUTO_INCREMENT primary key,uid int,pname varchar(200),price varchar(200))");
            
            JOptionPane.showMessageDialog(null, "table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {
            }
        }

    }
}
