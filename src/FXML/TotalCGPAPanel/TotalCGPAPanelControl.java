package FXML.TotalCGPAPanel;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TotalCGPAPanelControl implements Initializable {

    @FXML
    private JFXButton btExit;

    @FXML
    private TextField tfCredit;

    @FXML
    private TextField tfCGPA;

    @FXML
    private JFXButton btNext;

    @FXML
    private ComboBox<String> cbUniversity;

    private AnchorPane mainPanel;

    public void setMainPanel(AnchorPane mainPanel) {
        this.mainPanel = mainPanel;
    }

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
    void next(ActionEvent event) throws IOException {

        double credit;
        double cgpa;

        try {
            credit = Double.parseDouble(tfCredit.getText());
            cgpa = Double.parseDouble(tfCGPA.getText());

            if ((cgpa<=4.0 && cgpa>=0) && (credit>=0 && credit<=200) && cbUniversity.getValue()!=null) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("TotalCGPAPanel2.fxml"));
                Parent panel = loader.load();

                TotalCGPAPanel2Control totalCGPAPanel2Control = loader.getController();
                totalCGPAPanel2Control.setCurrentCGPA(cgpa);
                totalCGPAPanel2Control.setCurrentCredit(credit);
                totalCGPAPanel2Control.setLabel();
                totalCGPAPanel2Control.setUniversity(cbUniversity.getValue());
                totalCGPAPanel2Control.setAllGrade();


                mainPanel.getChildren().setAll(panel);

            }

            else {

                if (!(credit>=0 && credit<=200)) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("Credit is Invalid");
                    alert.setContentText("Please input correct Credit");
                    alert.show();
                }

                else if (!(cgpa<=4.0 && cgpa>=0)) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("CGPA is Invalid");
                    alert.setContentText("Please input correct CGPA");
                    alert.show();
                }

                else if (cbUniversity.getValue()==null) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("You didn't select any university");
                    alert.setContentText("Please select a university");
                    alert.show();
                }

            }




        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Input format incorrect or Empty");
            alert.setContentText("Please input correct format");
            alert.show();
        }

    }


    public void setCbUniversity() {

        String[] uniList = {"EWU","NSU","AIUB","AUST","IUB"};
        cbUniversity.getItems().setAll(uniList);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        setCbUniversity();

    }
}
