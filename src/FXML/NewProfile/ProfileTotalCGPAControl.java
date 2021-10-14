package FXML.NewProfile;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileTotalCGPAControl implements Initializable{

    @FXML
    private GridPane addGridPane;

    @FXML
    private JFXButton btAdd;

    @FXML
    private JFXButton btRemove;

    @FXML
    private JFXButton btCalculate;

    @FXML
    private JFXButton btReset;

    @FXML
    private TextField tfCourse1;

    @FXML
    private TextField tfCourse2;

    @FXML
    private TextField tfCourse3;

    @FXML
    private TextField tfCourse4;

    @FXML
    private TextField tfCourse5;

    @FXML
    private TextField tfCourse6;

    @FXML
    private ComboBox<Double> cbCredit1;

    @FXML
    private ComboBox<Double> cbCredit2;

    @FXML
    private ComboBox<Double> cbCredit3;

    @FXML
    private ComboBox<Double> cbCredit4;

    @FXML
    private ComboBox<Double> cbCredit5;

    @FXML
    private ComboBox<Double> cbCredit6;

    @FXML
    private ComboBox<String> cbGrade1;

    @FXML
    private ComboBox<String> cbGrade2;

    @FXML
    private ComboBox<String> cbGrade3;

    @FXML
    private ComboBox<String> cbGrade4;

    @FXML
    private ComboBox<String> cbGrade5;

    @FXML
    private ComboBox<String> cbGrade6;

    @FXML
    private GridPane courseGridPane;

    @FXML
    private HBox hBox3;

    @FXML
    private HBox hBox4;

    @FXML
    private HBox hBox5;

    @FXML
    private HBox hBox6;

    @FXML
    private Label lbCGPA;

    @FXML
    private Label lbCredit;

    @FXML
    private Label lbCurrentCGPA;

    @FXML
    private Label lbCurrentCredit;

    @FXML
    private JFXButton btAddProfile;

    @FXML
    void addCourse(ActionEvent event) {

        if (hBox3.isVisible()==false) {
            hBox3.setVisible(true);
            addGridPane.getChildren().remove(btAdd);
            addGridPane.getChildren().remove(btRemove);
            addGridPane.add(btRemove,0,0);
            addGridPane.add(btAdd,0,1);

        }

        else if (hBox4.isVisible()==false) {
            hBox4.setVisible(true);
            addGridPane.getChildren().remove(btAdd);
            addGridPane.getChildren().remove(btRemove);
            addGridPane.add(btRemove,0,1);
            addGridPane.add(btAdd,0,2);

        }

        else if (hBox5.isVisible()==false) {
            hBox5.setVisible(true);
            addGridPane.getChildren().remove(btAdd);
            addGridPane.getChildren().remove(btRemove);
            addGridPane.add(btRemove,0,2);
            addGridPane.add(btAdd,0,3);
        }
        else if (hBox6.isVisible()==false) {
            hBox6.setVisible(true);
            addGridPane.getChildren().remove(btAdd);
            addGridPane.getChildren().remove(btRemove);
            addGridPane.add(btRemove,0,4);
        }


    }


    @FXML
    void removeCourse(ActionEvent event) {

        if (hBox4.isVisible()==false) {
            hBox3.setVisible(false);
            addGridPane.getChildren().remove(btAdd);
            addGridPane.getChildren().remove(btRemove);
            addGridPane.add(btAdd,0,0);

        }

        else if (hBox5.isVisible()==false) {
            hBox4.setVisible(false);
            addGridPane.getChildren().remove(btAdd);
            addGridPane.getChildren().remove(btRemove);
            addGridPane.add(btRemove,0,0);
            addGridPane.add(btAdd,0,1);
        }
        else if (hBox6.isVisible()==false) {
            hBox5.setVisible(false);
            addGridPane.getChildren().remove(btAdd);
            addGridPane.getChildren().remove(btRemove);
            addGridPane.add(btRemove,0,1);
            addGridPane.add(btAdd,0,2);
        }

        else {
            hBox6.setVisible(false);
            addGridPane.getChildren().remove(btAdd);
            addGridPane.getChildren().remove(btRemove);
            addGridPane.add(btRemove,0,2);
            addGridPane.add(btAdd,0,3);
        }


    }

    @FXML
    void reset(ActionEvent event) {

        setCbCredit(cbCredit1);
        setCbCredit(cbCredit2);
        setCbCredit(cbCredit3);
        setCbCredit(cbCredit4);
        setCbCredit(cbCredit5);
        setCbCredit(cbCredit6);

        setGrade(cbGrade1);
        setGrade(cbGrade2);
        setGrade(cbGrade3);
        setGrade(cbGrade4);
        setGrade(cbGrade5);
        setGrade(cbGrade6);


        tfCourse1.setText("");
        tfCourse2.setText("");
        tfCourse3.setText("");
        tfCourse4.setText("");
        tfCourse5.setText("");
        tfCourse6.setText("");


        cbCredit1.getSelectionModel().select(-1);
        cbCredit2.getSelectionModel().select(-1);
        cbCredit3.getSelectionModel().select(-1);
        cbCredit4.getSelectionModel().select(-1);
        cbCredit5.getSelectionModel().select(-1);
        cbCredit6.getSelectionModel().select(-1);

        cbCredit1.setPromptText("Credit");
        cbCredit2.setPromptText("Credit");
        cbCredit3.setPromptText("Credit");
        cbCredit4.setPromptText("Credit");
        cbCredit5.setPromptText("Credit");
        cbCredit6.setPromptText("Credit");


        cbGrade1.getSelectionModel().select(-1);
        cbGrade2.getSelectionModel().select(-1);
        cbGrade3.getSelectionModel().select(-1);
        cbGrade4.getSelectionModel().select(-1);
        cbGrade5.getSelectionModel().select(-1);
        cbGrade6.getSelectionModel().select(-1);

        cbGrade1.setPromptText("Grade");
        cbGrade2.setPromptText("Grade");
        cbGrade3.setPromptText("Grade");
        cbGrade4.setPromptText("Grade");
        cbGrade5.setPromptText("Grade");
        cbGrade6.setPromptText("Grade");


    }

    @FXML
    void calculate(ActionEvent event) {

    }

    @FXML
    void addToProfile(ActionEvent event) {

    }



    public void setCbCredit(ComboBox<Double> credit) {

        Double[] creditList = {0.5,1.0,2.0,3.0,4.0};
        credit.getItems().setAll(creditList);

    }

    public void setGrade(ComboBox<String> grade) {

        String[] gradeList = {"A","A-","B+","B","B-","C+","C","C-","D+","D","F"};
        grade.getItems().setAll(gradeList);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        setCbCredit(cbCredit1);
        setCbCredit(cbCredit2);
        setCbCredit(cbCredit3);
        setCbCredit(cbCredit4);
        setCbCredit(cbCredit5);
        setCbCredit(cbCredit6);

        setGrade(cbGrade1);
        setGrade(cbGrade2);
        setGrade(cbGrade3);
        setGrade(cbGrade4);
        setGrade(cbGrade5);
        setGrade(cbGrade6);

    }
}
