package FXML;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomepageControl {

    @FXML
    private JFXButton btNewProfile;

    @FXML
    private JFXButton btSavedProfile;

    @FXML
    private JFXButton btSemester;

    @FXML
    private JFXButton btTotalCGPA;

    private Parent root;
    private Stage stage;

    @FXML
    void newProfile(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Homepage2.fxml"));
        root = loader.load();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }

    @FXML
    void savedProfile(ActionEvent event) {

    }

    @FXML
    void semesterCGPA(ActionEvent event) {

    }

    @FXML
    void totalCGPA(ActionEvent event) {

    }

}
