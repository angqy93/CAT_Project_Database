package org.example.catproj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

public class SignInController{

    @FXML
    private Button signin_button;

    @FXML
    private AnchorPane signin_form;

    @FXML
    private PasswordField signin_password;

    @FXML
    private Hyperlink signin_signup;

    @FXML
    private TextField signin_username;

    @FXML
    private Button signup_button;

    @FXML
    private TextField signup_email;

    @FXML
    private AnchorPane signup_form;

    @FXML
    private Hyperlink signup_login;

    @FXML
    private PasswordField signup_password;

    @FXML
    private TextField signup_username;

    private Connection connect;
    private Statement statement;
    private ResultSet result;

    public void signin(){

        String sql = "SELECT * FROM USER_PROF WHERE USER_NAME = ? AND USER_PASS = ?";

        connect = database.connectDB();

        try {
            if (connect != null) { // Check if the connection is successful
                PreparedStatement pstmt = connect.prepareStatement(sql);
                pstmt.setString(1, signin_username.getText());
                pstmt.setString(2, signin_password.getText());

                System.out.println("Ten");
                result = pstmt.executeQuery();

                Alert alert;

                if (signin_username.getText().isEmpty() || signin_password.getText().isEmpty()) {
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Please fill all blank fields");
                    alert.showAndWait();
                } else {
                    if (result.next()) {
                        System.out.println("Eleven");
                        alert = new Alert(Alert.AlertType.CONFIRMATION);
                        alert.setTitle("Information Message.");
                        alert.setHeaderText(null);
                        alert.setContentText("Successfully Login!");
                        alert.showAndWait();
                    } else {
                        System.out.println("Twelve");
                        alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Error Message.");
                        alert.setHeaderText(null);
                        alert.setContentText("Wrong Username/Password");
                        alert.showAndWait();
                    }
                }
            } else {
                System.out.println("Database connection failed."); // Print a message if connection is not successful
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void switchform(ActionEvent event){
        if(event.getSource() == signin_signup){
            signin_form.setVisible(false);
            signup_form.setVisible(true);
        } else if (event.getSource() == signup_login) {
            signin_form.setVisible(true);
            signup_form.setVisible(false);
        }
    }
}
