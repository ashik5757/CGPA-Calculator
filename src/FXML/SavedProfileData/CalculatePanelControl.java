package FXML.SavedProfileData;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CalculatePanelControl implements Initializable {

    @FXML
    private JFXButton btSemesterCGPA;

    @FXML
    private JFXButton btTotalCGPA;

    @FXML
    private AnchorPane calculatePanel;

    @FXML
    private JFXButton btExit;

    @FXML
    void exit(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log Out");
        alert.setHeaderText("You are about to EXIT");
        alert.setContentText("Are you sure??");

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.exit(0);
        }

    }

    @FXML
    void semesterCGPA(ActionEvent event) throws IOException {

        Parent panel = FXMLLoader.load(getClass().getResource("ProfileSemesterCGPA.fxml"));
        calculatePanel.getChildren().setAll(panel);
        btSemesterCGPA.getStyleClass().setAll("button-selected25");
        btTotalCGPA.getStyleClass().setAll("button-border25");
        btSemesterCGPA.setTextFill(Color.WHITE);
        btTotalCGPA.setTextFill(Color.BLACK);

    }

    @FXML
    void totalCGPA(ActionEvent event) throws IOException {

        Parent panel = FXMLLoader.load(getClass().getResource("ProfileTotalCGPA.fxml"));
        calculatePanel.getChildren().setAll(panel);
        btSemesterCGPA.getStyleClass().setAll("button-border25");
        btTotalCGPA.getStyleClass().setAll("button-selected25");
        btSemesterCGPA.setTextFill(Color.BLACK);
        btTotalCGPA.setTextFill(Color.WHITE);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Parent panel = null;
        try {
            panel = FXMLLoader.load(getClass().getResource("ProfileSemesterCGPA.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        calculatePanel.getChildren().setAll(panel);
        btSemesterCGPA.getStyleClass().setAll("button-selected25");
        btTotalCGPA.getStyleClass().setAll("button-border25");
        btSemesterCGPA.setTextFill(Color.WHITE);
        btTotalCGPA.setTextFill(Color.BLACK);


    }
}
