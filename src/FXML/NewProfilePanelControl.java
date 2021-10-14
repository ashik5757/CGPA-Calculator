package FXML;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NewProfilePanelControl implements Initializable {

    @FXML
    private JFXButton btCreate;

    @FXML
    private ComboBox<String> cbDept;

    @FXML
    private ComboBox<String> cbSession;

    @FXML
    private ComboBox<Integer> cbYear;

    @FXML
    private TextField tfName;

    @FXML
    private JFXButton btExit;

    @FXML
    void createProfile(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ProfilePanel.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }


    @FXML
    void exit(ActionEvent event) {

        System.exit(0);

    }

    public void setCbDept() {
        String[] dept = {"EEE","CE","CSE","ME","ARC.E"};
        cbDept.getItems().setAll(dept);
    }

    public void setCbSession() {
        String[] session = {"Summer","Fall","Winter"};
        cbSession.getItems().setAll(session);
    }

    public void setCbYear() {
        Integer[] year = {15,16,17,18,19,20,21,22};
        cbYear.getItems().setAll(year);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        setCbDept();
        setCbSession();
        setCbYear();


    }
}
