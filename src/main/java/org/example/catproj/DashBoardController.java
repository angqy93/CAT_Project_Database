package org.example.catproj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardController {

    @FXML
    private Button addEvent_btn;

    @FXML
    private Button addEvent_clear;

    @FXML
    private TableColumn<?, ?> addEvent_col_date;

    @FXML
    private TableColumn<?, ?> addEvent_col_desc;

    @FXML
    private TableColumn<?, ?> addEvent_col_name;

    @FXML
    private TableColumn<?, ?> addEvent_col_time;

    @FXML
    private TextField addEvent_date;

    @FXML
    private Button addEvent_delete;

    @FXML
    private TextField addEvent_desc;

    @FXML
    private AnchorPane addEvent_form;

    @FXML
    private ImageView addEvent_imageview;

    @FXML
    private Button addEvent_import;

    @FXML
    private Button addEvent_insert;

    @FXML
    private TextField addEvent_name;

    @FXML
    private TextField addEvent_search;

    @FXML
    private TableView<?> addEvent_tableview;

    @FXML
    private TextField addEvent_time;

    @FXML
    private Button addEvent_update;

    @FXML
    private Button dashboard_btn;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    private Label dashboard_totalevents;

    @FXML
    private Label dashboard_totalusers;

    @FXML
    private Button joinEvent_btn;

    @FXML
    private TableColumn<?, ?> joinEvent_col_date;

    @FXML
    private TableColumn<?, ?> joinEvent_col_desc;

    @FXML
    private TableColumn<?, ?> joinEvent_col_name;

    @FXML
    private TableColumn<?, ?> joinEvent_col_time;

    @FXML
    private TextField joinEvent_date;

    @FXML
    private TextField joinEvent_email;

    @FXML
    private TextField joinEvent_firstname;

    @FXML
    private AnchorPane joinEvent_form;

    @FXML
    private ImageView joinEvent_imageview;

    @FXML
    private Label joinEvent_label;

    @FXML
    private TextField joinEvent_lastname;

    @FXML
    private TextField joinEvent_name;

    @FXML
    private TextField joinEvent_phone;

    @FXML
    private Button joinEvent_register;

    @FXML
    private Button joinEvent_select;

    @FXML
    private TableView<?> joinEvent_tableview;

    @FXML
    private Label joinEvent_text;

    @FXML
    private TextField joinEvent_time;

    @FXML
    private Button participants_btn;

    @FXML
    private Button participants_check;

    @FXML
    private TableColumn<?, ?> participants_col_;

    @FXML
    private TableColumn<?, ?> participants_col_email;

    @FXML
    private TableColumn<?, ?> participants_col_lastname;

    @FXML
    private TableColumn<?, ?> participants_col_phone;

    @FXML
    private TextField participants_date;

    @FXML
    private AnchorPane participants_form;

    @FXML
    private TextField participants_name;

    @FXML
    private TextField participants_search;

    @FXML
    private TableView<?> participants_tableview;

    @FXML
    private TextField participants_time;

    @FXML
    private Button signout;

    @FXML
    private Button updateEvent_btn;

    @FXML
    private TableColumn<?, ?> updateEvent_col_date;

    @FXML
    private TableColumn<?, ?> updateEvent_col_desc;

    @FXML
    private TableColumn<?, ?> updateEvent_col_name;

    @FXML
    private TableColumn<?, ?> updateEvent_col_time;

    @FXML
    private ComboBox<?> updateEvent_current;

    @FXML
    private Button updateEvent_delete;

    @FXML
    private AnchorPane updateEvent_form;

    @FXML
    private ImageView updateEvent_imageview;

    @FXML
    private Label updateEvent_label;

    @FXML
    private TextField updateEvent_search;

    @FXML
    private TableView<?> updateEvent_tableview;

    @FXML
    private Label updateEvent_text;

    @FXML
    private Button updateEvent_update;

    @FXML
    private Label username;

    public void displayUsername(){
        username.setText(getData.username);
    }

    private double x = 0;
    private double y = 0;

    public void logOut(){
        signout.getScene().getWindow().hide();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AccessPage.fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(root);

            root.setOnMousePressed((MouseEvent event) ->{
                x = event.getSceneX();
                y = event.getSceneY();
            });

            root.setOnMouseDragged((MouseEvent event) ->{
                stage.setX(event.getScreenX() - x);
                stage.setY(event.getScreenY() - y);
            });

            stage.setScene(scene);
            stage.show();
        }catch(Exception e){e.printStackTrace();}
    }
    public void switchForm(ActionEvent event){
        if(event.getSource()==dashboard_btn){
            dashboard_form.setVisible(true);
            addEvent_form.setVisible(false);
            joinEvent_form.setVisible(false);
            updateEvent_form.setVisible(false);
            participants_form.setVisible(false);

            dashboard_btn.setStyle("-fx-background-color: #ae2d3c");
            addEvent_btn.setStyle("-fx-background-color: transparent");
            joinEvent_btn.setStyle("-fx-background-color: transparent");
            updateEvent_btn.setStyle("-fx-background-color: transparent");
            participants_btn.setStyle("-fx-background-color: transparent");
        } else if(event.getSource()==addEvent_btn){
            dashboard_form.setVisible(false);
            addEvent_form.setVisible(true);
            joinEvent_form.setVisible(false);
            updateEvent_form.setVisible(false);
            participants_form.setVisible(false);

            dashboard_btn.setStyle("-fx-background-color: transparent");
            addEvent_btn.setStyle("-fx-background-color: #ae2d3c");
            joinEvent_btn.setStyle("-fx-background-color: transparent");
            updateEvent_btn.setStyle("-fx-background-color: transparent");
            participants_btn.setStyle("-fx-background-color: transparent");
        }else if(event.getSource()==joinEvent_btn){
            dashboard_form.setVisible(false);
            addEvent_form.setVisible(false);
            joinEvent_form.setVisible(true);
            updateEvent_form.setVisible(false);
            participants_form.setVisible(false);

            dashboard_btn.setStyle("-fx-background-color: transparent");
            addEvent_btn.setStyle("-fx-background-color: transparent");
            joinEvent_btn.setStyle("-fx-background-color: #ae2d3c");
            updateEvent_btn.setStyle("-fx-background-color: transparent");
            participants_btn.setStyle("-fx-background-color: transparent");
        }else if(event.getSource()==updateEvent_btn){
            dashboard_form.setVisible(false);
            addEvent_form.setVisible(false);
            joinEvent_form.setVisible(false);
            updateEvent_form.setVisible(true);
            participants_form.setVisible(false);

            dashboard_btn.setStyle("-fx-background-color: transparent");
            addEvent_btn.setStyle("-fx-background-color: transparent");
            joinEvent_btn.setStyle("-fx-background-color: transparent");
            updateEvent_btn.setStyle("-fx-background-color: #ae2d3c");
            participants_btn.setStyle("-fx-background-color: transparent");
        }else if(event.getSource()==participants_btn){
            dashboard_form.setVisible(false);
            addEvent_form.setVisible(false);
            joinEvent_form.setVisible(false);
            updateEvent_form.setVisible(false);
            participants_form.setVisible(true);

            dashboard_btn.setStyle("-fx-background-color: transparent");
            addEvent_btn.setStyle("-fx-background-color: transparent");
            joinEvent_btn.setStyle("-fx-background-color: transparent");
            updateEvent_btn.setStyle("-fx-background-color: transparent");
            participants_btn.setStyle("-fx-background-color: #ae2d3c");
        }
    }

    public void initialize(){
        displayUsername();
    }
}
