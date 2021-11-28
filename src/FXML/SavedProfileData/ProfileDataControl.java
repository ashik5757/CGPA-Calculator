package FXML.SavedProfileData;

import Class.*;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

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
    void session1(ActionEvent event) throws IOException {

        if (bt2.isVisible()) {
            String msg = profile.getSessionList().get(0).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt2.isVisible()) {
            loadCalculatePanel(event);
        }



    }

    @FXML
    void session2(ActionEvent event) throws IOException {

        if (bt3.isVisible()) {
            String msg = profile.getSessionList().get(1).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt3.isVisible()) {
            loadCalculatePanel(event);
        }


    }

    @FXML
    void session3(ActionEvent event) throws IOException {

        if (bt4.isVisible()) {
            String msg = profile.getSessionList().get(2).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt4.isVisible()) {
            loadCalculatePanel(event);
        }


    }

    @FXML
    void session4(ActionEvent event) throws IOException {

        if (bt5.isVisible()) {
            String msg = profile.getSessionList().get(3).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt5.isVisible()) {
            loadCalculatePanel(event);
        }


    }

    @FXML
    void session5(ActionEvent event) throws IOException {

        if (bt6.isVisible()) {
            String msg = profile.getSessionList().get(4).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt6.isVisible()) {
            loadCalculatePanel(event);
        }


    }

    @FXML
    void session6(ActionEvent event) throws IOException {

        if (bt7.isVisible()) {
            String msg = profile.getSessionList().get(5).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt7.isVisible()) {
            loadCalculatePanel(event);
        }


    }

    @FXML
    void session7(ActionEvent event) throws IOException {

        if (bt8.isVisible()) {
            String msg = profile.getSessionList().get(6).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt8.isVisible()) {
            loadCalculatePanel(event);
        }
    }

    @FXML
    void session8(ActionEvent event) throws IOException {

        if (bt9.isVisible()) {
            String msg = profile.getSessionList().get(7).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt9.isVisible()) {
            loadCalculatePanel(event);
        }
    }

    @FXML
    void session9(ActionEvent event) throws IOException {

        if (bt10.isVisible()) {
            String msg = profile.getSessionList().get(8).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt10.isVisible()) {
            loadCalculatePanel(event);
        }
    }

    @FXML
    void session10(ActionEvent event) throws IOException {

        if (bt11.isVisible()) {
            String msg = profile.getSessionList().get(9).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt11.isVisible()) {
            loadCalculatePanel(event);
        }
    }

    @FXML
    void session11(ActionEvent event) throws IOException {

        if (bt12.isVisible()) {
            String msg = profile.getSessionList().get(10).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt12.isVisible()) {
            loadCalculatePanel(event);
        }
    }

    @FXML
    void session12(ActionEvent event) throws IOException {

        if (bt13.isVisible()) {
            String msg = profile.getSessionList().get(11).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt13.isVisible()) {
            loadCalculatePanel(event);
        }
    }

    @FXML
    void session13(ActionEvent event) throws IOException {

        if (bt14.isVisible()) {
            String msg = profile.getSessionList().get(12).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt4.isVisible()) {
            loadCalculatePanel(event);
        }
    }

    @FXML
    void session14(ActionEvent event) throws IOException {

        if (bt15.isVisible()) {
            String msg = profile.getSessionList().get(13).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt15.isVisible()) {
            loadCalculatePanel(event);
        }
    }

    @FXML
    void session15(ActionEvent event) throws IOException {

        if (bt16.isVisible()) {
            String msg = profile.getSessionList().get(14).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt16.isVisible()) {
            loadCalculatePanel(event);
        }
    }

    @FXML
    void session16(ActionEvent event) throws IOException {

        if (bt17.isVisible()) {
            String msg = profile.getSessionList().get(15).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt17.isVisible()) {
            loadCalculatePanel(event);
        }
    }

    @FXML
    void session17(ActionEvent event) throws IOException {

        if (bt18.isVisible()) {
            String msg = profile.getSessionList().get(16).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!bt18.isVisible()) {
            loadCalculatePanel(event);
        }
    }

    @FXML
    void session18(ActionEvent event) throws IOException {

        if (bt18.getGraphic() ==null) {
            String msg = profile.getSessionList().get(17).getCgpaClass().toString()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Course Wise Grade-Sheet");
            alert.setContentText(msg);
            alert.getDialogPane().setPrefSize(500,Region.USE_COMPUTED_SIZE);
            alert.show();
        }

        if (!(bt18.getGraphic() ==null)) {
            loadCalculatePanel(event);
        }
    }


    public void loadCalculatePanel(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../SavedProfileData/ProfilePanel.fxml"));
        Parent root = loader.load();

        ProfilePanelControl profilePanelControl = loader.getController();
        profilePanelControl.calculate(event);

        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }


    public void reader() throws IOException, ClassNotFoundException {

        FileInputStream fileRead = new FileInputStream("/CGPA-Calculator/data/DataList.txt");
        ObjectInputStream objRead = new ObjectInputStream(fileRead);

        DataList dataList = (DataList) objRead.readObject();
        setProfile(dataList.getCurrentProfile());


        fileRead.close();
        objRead.close();

    }



    public void sessionText(JFXButton button, Session session) {
        button.setText("Session : " + session.getName() + "\nCredit completed : "+session.getCreditCompleted()+ "\nCGPA : " + session.getCgpa());
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



        int i = 1;

        for (Session session : profile.getSessionList()) {
            if (i==1) {
                sessionText(bt1,session);
                i++;
                bt1.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt1.setGraphic(null);
                bt2.setVisible(true);
            }
            else if (i==2) {
                sessionText(bt2,session);
                i++;
                bt2.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt2.setGraphic(null);
                bt3.setVisible(true);
            }
            else if (i==3) {
                sessionText(bt3,session);
                i++;
                bt3.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt3.setGraphic(null);
                bt4.setVisible(true);
            }
            else if (i==4) {
                sessionText(bt4,session);
                i++;
                bt4.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt4.setGraphic(null);
                bt5.setVisible(true);
            }
            else if (i==5) {
                sessionText(bt5,session);
                i++;
                bt5.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt5.setGraphic(null);
                bt6.setVisible(true);
            }
            else if (i==6) {
                sessionText(bt6,session);
                i++;
                bt6.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt6.setGraphic(null);
                bt7.setVisible(true);
            }
            else if (i==7) {
                sessionText(bt7,session);
                i++;
                bt7.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt7.setGraphic(null);
                bt8.setVisible(true);
            }
            else if (i==8) {
                sessionText(bt8,session);
                i++;
                bt8.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt8.setGraphic(null);
                bt9.setVisible(true);
            }
            else if (i==9) {
                sessionText(bt9,session);
                i++;
                bt9.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt9.setGraphic(null);
                bt10.setVisible(true);
            }
            else if (i==10) {
                sessionText(bt10,session);
                i++;
                bt10.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt10.setGraphic(null);
                bt11.setVisible(true);
            }
            else if (i==11) {
                sessionText(bt11,session);
                i++;
                bt11.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt11.setGraphic(null);
                bt12.setVisible(true);
            }
            else if (i==12) {
                sessionText(bt12,session);
                i++;
                bt12.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt12.setGraphic(null);
                bt13.setVisible(true);
            }
            else if (i==13) {
                sessionText(bt13,session);
                i++;
                bt13.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt13.setGraphic(null);
                bt14.setVisible(true);
            }
            else if (i==14) {
                sessionText(bt14,session);
                i++;
                bt14.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt14.setGraphic(null);
                bt15.setVisible(true);
            }
            else if (i==15) {
                sessionText(bt15,session);
                i++;
                bt15.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt15.setGraphic(null);
                bt16.setVisible(true);
            }
            else if (i==16) {
                sessionText(bt16,session);
                i++;
                bt16.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt16.setGraphic(null);
                bt17.setVisible(true);
            }
            else if (i==17) {
                sessionText(bt17,session);
                i++;
                bt17.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt17.setGraphic(null);
                bt18.setVisible(true);
            }
            else if (i==18) {
                sessionText(bt18,session);
                i++;
                bt18.setContentDisplay(ContentDisplay.valueOf("CENTER"));
                bt18.setGraphic(null);
            }

        }







    }
}
