package FXML.SavedProfilePanel;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SavedProfilePanelControl {

    @FXML
    private JFXButton btExit;

    @FXML
    private JFXButton btOpenProfile;

    @FXML
    private ComboBox<String> cbSavedProfile;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void openProfile(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../SavedProfileData/ProfilePanel.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }

}
