package org.example.catproj;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class database {

    public static Connection connectDB() {

        String url = "jdbc:sqlite:C:/Users/Angqy/Desktop/CAT201/src/main/resources/dat/project.db" ;

        try{

            Connection conn = DriverManager.getConnection(url);

            return conn;

        }catch (Exception e){e.printStackTrace();}

        return null;
    }

}