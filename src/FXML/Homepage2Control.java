package FXML;

import FXML.TotalCGPAPanel.TotalCGPAPanelControl;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Homepage2Control {

    @FXML
    private JFXButton btNewProfile;

    @FXML
    private JFXButton btSavedProfile;

    @FXML
    private JFXButton btSemesterCGPA;

    @FXML
    private JFXButton btTotalCGPA;

    @FXML
    private AnchorPane mainPanel;

    @FXML
    void newProfile(ActionEvent event) throws IOException {

        Parent panel = FXMLLoader.load(getClass().getResource("NewProfilePanel/NewProfilePanel.fxml"));
        mainPanel.getChildren().setAll(panel);


    }

    @FXML
    void savedProfile(ActionEvent event) throws IOException {
        Parent panel = FXMLLoader.load(getClass().getResource("SavedProfilePanel/SavedProfilePanel.fxml"));
        mainPanel.getChildren().setAll(panel);
    }

    @FXML
    void semesterCGPA(ActionEvent event) throws IOException {

        Parent panel = FXMLLoader.load(getClass().getResource("SemesterCGPAPanel/SemesterCGPAPanel.fxml"));
        mainPanel.getChildren().setAll(panel);


    }

    @FXML
    void totalCGPA(ActionEvent event) throws IOException {

        //Parent panel = FXMLLoader.load(getClass().getResource("TotalCGPAPanel.fxml"));
        //mainPanel.getChildren().setAll(panel);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("TotalCGPAPanel/TotalCGPAPanel.fxml"));
        Parent panel = loader.load();
        mainPanel.getChildren().setAll(panel);

        TotalCGPAPanelControl totalCGPAPanelControl = loader.getController();
        totalCGPAPanelControl.setMainPanel(mainPanel);



    }

}
