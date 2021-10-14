package FXML;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TotalCGPAPanelControl {

    @FXML
    private JFXButton btExit;

    @FXML
    private TextField tfCredit;

    @FXML
    private TextField tfCGPA;

    @FXML
    private JFXButton btNext;

    private AnchorPane mainPanel;

    public void setMainPanel(AnchorPane mainPanel) {
        this.mainPanel = mainPanel;
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void next(ActionEvent event) throws IOException {

        Parent panel = FXMLLoader.load(getClass().getResource("TotalCGPAPanel2.fxml"));
        mainPanel.getChildren().setAll(panel);


    }

}
