package FXML.SavedProfileData;

import Class.*;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class ProfileDataControl implements Initializable {

    @FXML
    private JFXButton btExit;

    @FXML
    private GridPane gridPane;

    @FXML
    private JFXButton bt1;

    @FXML
    private JFXButton bt4;

    @FXML
    private JFXButton bt5;

    @FXML
    private JFXButton bt7;

    @FXML
    private JFXButton bt8;

    @FXML
    private JFXButton bt9;

    @FXML
    private JFXButton bt10;

    @FXML
    private JFXButton bt11;

    @FXML
    private JFXButton bt12;

    @FXML
    private JFXButton bt13;

    @FXML
    private JFXButton bt14;

    @FXML
    private JFXButton bt15;

    @FXML
    private JFXButton bt16;

    @FXML
    private JFXButton bt17;

    @FXML
    private JFXButton bt18;

    @FXML
    private JFXButton bt2;

    @FXML
    private JFXButton bt3;

    @FXML
    private JFXButton bt6;

    @FXML
    private Label lbName;

    @FXML
    private Label lbCredit;

    @FXML
    private Label lbCGPA;

    @FXML
    private Label lbUniversity;


    private Profile profile;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }




    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void session1(ActionEvent event) {

        if (bt2.isVisible()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("LAlal");
            alert.setContentText("hgdahdg");
            alert.show();
        }

        if (!bt2.isVisible()) {
            bt1.setText("Session : Fall-20 \nCredit completed : 10.5 \nCGPA : 3.60");
            bt1.setContentDisplay(ContentDisplay.valueOf("CENTER"));
            bt1.setGraphic(null);
            bt2.setVisible(true);
        }



    }

    @FXML
    void session2(ActionEvent event) {

        if (bt3.isVisible()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("LAlal");
            alert.setContentText("hgdahdg");
            alert.show();
        }

        if (!bt3.isVisible()) {
            bt2.setText("Session : Fall-20 \nCredit completed : 10.5 \nCGPA : 3.60");
            bt2.setContentDisplay(ContentDisplay.valueOf("CENTER"));
            bt2.setGraphic(null);
            bt3.setVisible(true);
        }


    }

    @FXML
    void session3(ActionEvent event) {

        if (bt4.isVisible()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("LAlal");
            alert.setContentText("hgdahdg");
            alert.show();
        }

        if (!bt4.isVisible()) {
            bt3.setText("Session : Fall-20 \nCredit completed : 10.5 \nCGPA : 3.60");
            bt3.setContentDisplay(ContentDisplay.valueOf("CENTER"));
            bt3.setGraphic(null);
            bt4.setVisible(true);
        }


    }

    @FXML
    void session4(ActionEvent event) {

        if (bt5.isVisible()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("LAlal");
            alert.setContentText("hgdahdg");
            alert.show();
        }

        if (!bt5.isVisible()) {
            bt4.setText("Session : Fall-20 \nCredit completed : 10.5 \nCGPA : 3.60");
            bt4.setContentDisplay(ContentDisplay.valueOf("CENTER"));
            bt4.setGraphic(null);
            bt5.setVisible(true);
        }


    }

    @FXML
    void session5(ActionEvent event) {

    }

    @FXML
    void session6(ActionEvent event) {

    }

    @FXML
    void session7(ActionEvent event) {

    }

    @FXML
    void session8(ActionEvent event) {

    }

    @FXML
    void session9(ActionEvent event) {

    }

    @FXML
    void session10(ActionEvent event) {

    }

    @FXML
    void session11(ActionEvent event) {

    }

    @FXML
    void session12(ActionEvent event) {

    }

    @FXML
    void session13(ActionEvent event) {

    }

    @FXML
    void session14(ActionEvent event) {

    }

    @FXML
    void session15(ActionEvent event) {

    }

    @FXML
    void session16(ActionEvent event) {

    }

    @FXML
    void session17(ActionEvent event) {

    }

    @FXML
    void session18(ActionEvent event) {

    }



    public void reader() throws IOException, ClassNotFoundException {

        FileInputStream fileRead = new FileInputStream("/CGPA-Calculator/data/DataList.txt");
        ObjectInputStream objRead = new ObjectInputStream(fileRead);

        DataList dataList = (DataList) objRead.readObject();
        setProfile(dataList.getCurrentProfile());


        fileRead.close();
        objRead.close();

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            reader();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        lbName.setText("Name : " + profile.getName());
        lbUniversity.setText("University : " + profile.getUniversity());
        lbCGPA.setText("CGPA : " + profile.getCgpa());
        lbCredit.setText("Credit Completed : " + profile.getCreditCompleted());

    }
}
