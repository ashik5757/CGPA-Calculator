package FXML.SavedProfileData;

import Class.*;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProfilePanelControl implements Initializable {

    @FXML
    private JFXButton btCalculate;

    @FXML
    private JFXButton btHome;

    @FXML
    private JFXButton btProfile;

    @FXML
    private AnchorPane mainPanel;

    private Profile profile;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }


    @FXML
    void calculate(ActionEvent event) throws IOException {

        Parent panel = FXMLLoader.load(getClass().getResource("CalculatePanel.fxml"));
        mainPanel.getChildren().setAll(panel);

    }

    @FXML
    void home(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../Homepage2.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void profile(ActionEvent event) throws IOException {

        Parent panel = FXMLLoader.load(getClass().getResource("ProfileData.fxml"));
        mainPanel.getChildren().setAll(panel);

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfileData.fxml"));
        Parent panel = null;
        try {
            panel = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        ProfileDataControl profileDataControl = loader.getController();
//        profileDataControl.setProfile(profile);

        mainPanel.getChildren().setAll(panel);

    }
}
