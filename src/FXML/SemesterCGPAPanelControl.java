package FXML;

import Class.*;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class SemesterCGPAPanelControl implements Initializable {

    @FXML
    private GridPane addGridPane;

    @FXML
    private JFXButton btAdd;

    @FXML
    private JFXButton btRemove;

    @FXML
    private JFXButton btCalculate;

    @FXML
    private JFXButton btExit;

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

//    @FXML
//    private ComboBox<String> cbCourse1;
//
//    @FXML
//    private ComboBox<String> cbCourse2;
//
//    @FXML
//    private ComboBox<String> cbCourse3;
//
//    @FXML
//    private ComboBox<String> cbCourse4;
//
//    @FXML
//    private ComboBox<String> cbCourse5;
//
//    @FXML
//    private ComboBox<String> cbCourse6;

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

//        setCbCourse(cbCourse1);
//        setCbCourse(cbCourse2);
//        setCbCourse(cbCourse3);
//        setCbCourse(cbCourse4);
//        setCbCourse(cbCourse5);
//        setCbCourse(cbCourse6);

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


//        cbCourse1.getSelectionModel().select(-1);
//        //cbCourse1.getSelectionModel().clearSelection();
//        cbCourse2.getSelectionModel().select(-1);
//        cbCourse3.getSelectionModel().select(-1);
//        cbCourse4.getSelectionModel().select(-1);
//        cbCourse5.getSelectionModel().select(-1);
//        cbCourse6.getSelectionModel().select(-1);
//
//        cbCourse1.setPromptText("Course");
//        cbCourse2.setPromptText("Course");
//        cbCourse3.setPromptText("Course");
//        cbCourse4.setPromptText("Course");
//        cbCourse5.setPromptText("Course");
//        cbCourse6.setPromptText("Course");

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

        int textError = 0;
        int creditError = 0;
        int gradeError = 0;


        CGPA cgpa = new CGPA(0,0);



        if (tfCourse1.getText().isBlank() || cbCredit1.getValue()==null || cbGrade1.getValue()==null ||
            tfCourse2.getText().isBlank() || cbCredit2.getValue()==null || cbGrade2.getValue()==null) {

            if (tfCourse1.getText().isBlank())
                textError++;
            if (cbCredit1.getValue()==null)
                creditError++;
            if (cbGrade1.getValue()==null)
                gradeError++;

            if (tfCourse2.getText().isBlank())
                textError++;
            if (cbCredit2.getValue()==null)
                creditError++;
            if (cbGrade2.getValue()==null)
                gradeError++;

        }

        if (!tfCourse1.getText().isBlank() && cbCredit1.getValue()!=null && cbGrade1.getValue()!=null &&
            !tfCourse2.getText().isBlank() && cbCredit2.getValue()!=null && cbGrade2.getValue()!=null) {

            Course course1 = new Course(tfCourse1.getText(),cbCredit1.getValue(),cbGrade1.getValue());
            Course course2 = new Course(tfCourse2.getText(),cbCredit2.getValue(),cbGrade2.getValue());

            cgpa.addCourse(course1);
            cgpa.addCourse(course2);


        }




        if (hBox3.isVisible()) {

            if (tfCourse3.getText().isBlank() || cbCredit3.getValue()==null || cbGrade3.getValue()==null) {
                if (tfCourse3.getText().isBlank())
                    textError++;
                if (cbCredit3.getValue()==null)
                    creditError++;
                if (cbGrade3.getValue()==null)
                    gradeError++;
            }

            else {
                Course course3 = new Course(tfCourse3.getText(),cbCredit3.getValue(),cbGrade3.getValue());
                cgpa.addCourse(course3);
            }

        }

        if (hBox4.isVisible()) {

            if (tfCourse4.getText().isBlank() || cbCredit4.getValue()==null || cbGrade4.getValue()==null) {
                if (tfCourse4.getText().isBlank())
                    textError++;
                if (cbCredit4.getValue()==null)
                    creditError++;
                if (cbGrade4.getValue()==null)
                    gradeError++;
            }

            else {
                Course course4 = new Course(tfCourse4.getText(),cbCredit4.getValue(),cbGrade4.getValue());
                cgpa.addCourse(course4);
            }

        }

        if (hBox5.isVisible()) {

            if (tfCourse5.getText().isBlank() || cbCredit5.getValue()==null || cbGrade5.getValue()==null) {
                if (tfCourse5.getText().isBlank())
                    textError++;
                if (cbCredit5.getValue()==null)
                    creditError++;
                if (cbGrade5.getValue()==null)
                    gradeError++;
            }

            else {
                Course course5 = new Course(tfCourse5.getText(),cbCredit5.getValue(),cbGrade5.getValue());
                cgpa.addCourse(course5);
            }

        }

        if (hBox6.isVisible()) {

            if (tfCourse6.getText().isBlank() || cbCredit6.getValue()==null || cbGrade6.getValue()==null) {
                if (tfCourse6.getText().isBlank())
                    textError++;
                if (cbCredit6.getValue()==null)
                    creditError++;
                if (cbGrade6.getValue()==null)
                    gradeError++;
            }

            else {
                Course course6 = new Course(tfCourse6.getText(),cbCredit6.getValue(),cbGrade6.getValue());
                cgpa.addCourse(course6);
            }

        }


        if (textError>0 || creditError>0 || gradeError>0) {

            String msg = "";

            if (textError>0)
                msg += "\n\n  " + textError + " Course Name";

            if (creditError>0)
                msg += "\n\n  " + creditError + " Credit Selection";

            if (gradeError>0)
                msg += "\n\n  " + gradeError + " Grade Selection";


            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Some information are missing" + msg);
            alert.setContentText("Please Input All Data");
            alert.show();

        }


        if (textError==0 && creditError==0 && gradeError==0) {
            lbCGPA.setText("CGPA : " + cgpa.getCalculatedCGPA());
            lbCredit.setText("Total Credit : " + cgpa.getTotalCredit());
        }





    }

    @FXML
    void exit(ActionEvent event) {

        System.exit(0);
    }

//    public void setCbCourse(ComboBox<String> course) {
//
//        String[] courseList = {"ACT102","ENG101","ENG102","CSE103"};
//        course.getItems().setAll(courseList);
//
//    }

    public void setCbCredit(ComboBox<Double> credit) {

        Double[] creditList = {0.5,1.0,2.0,3.0,4.0,4.5};
        credit.getItems().setAll(creditList);

    }

    public void setGrade(ComboBox<String> grade) {

        String[] gradeList = {"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","F"};
        grade.getItems().setAll(gradeList);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        setCbCourse(cbCourse1);
//        setCbCourse(cbCourse2);
//        setCbCourse(cbCourse3);
//        setCbCourse(cbCourse4);
//        setCbCourse(cbCourse5);
//        setCbCourse(cbCourse6);

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
