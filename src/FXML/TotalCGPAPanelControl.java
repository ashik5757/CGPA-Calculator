package FXML;

import Class.*;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
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

        double credit;
        double cgpa;

        try {
            credit = Double.parseDouble(tfCredit.getText());
            cgpa = Double.parseDouble(tfCGPA.getText());

            if (cgpa<=4.0 && cgpa>=0) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("TotalCGPAPanel2.fxml"));
                Parent panel = loader.load();

                TotalCGPAPanel2Control totalCGPAPanel2Control = loader.getController();
                totalCGPAPanel2Control.setCurrentCGPA(cgpa);
                totalCGPAPanel2Control.setCurrentCredit(credit);
                totalCGPAPanel2Control.setLabel();

                mainPanel.getChildren().setAll(panel);

            }

            else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setHeaderText("CGPA is Invalid");
                alert.setContentText("Please input correct CGPA");
                alert.show();

            }





        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Input format incorrect");
            alert.setContentText("Please input correct format");
            alert.show();
        }




    }

}
