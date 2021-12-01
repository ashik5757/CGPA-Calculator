package FXML.SemesterCGPAPanel;

import Class.*;
import com.jfoenix.controls.JFXAutoCompletePopup;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import org.controlsfx.control.textfield.AutoCompletionBinding;
import org.controlsfx.control.textfield.TextFields;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
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
    private ComboBox<String> cbUniversity;

    String university;


    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }






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

//        setCbCredit(cbCredit1);
//        setCbCredit(cbCredit2);
//        setCbCredit(cbCredit3);
//        setCbCredit(cbCredit4);
//        setCbCredit(cbCredit5);
//        setCbCredit(cbCredit6);
//
//        setGrade(cbGrade1);
//        setGrade(cbGrade2);
//        setGrade(cbGrade3);
//        setGrade(cbGrade4);
//        setGrade(cbGrade5);
//        setGrade(cbGrade6);



        tfCourse1.setText("");
        tfCourse2.setText("");
        tfCourse3.setText("");
        tfCourse4.setText("");
        tfCourse5.setText("");
        tfCourse6.setText("");

        creditReset(cbCredit1);
        creditReset(cbCredit2);
        creditReset(cbCredit3);
        creditReset(cbCredit4);
        creditReset(cbCredit5);
        creditReset(cbCredit6);

        gradeReset(cbGrade1);
        gradeReset(cbGrade2);
        gradeReset(cbGrade3);
        gradeReset(cbGrade4);
        gradeReset(cbGrade5);
        gradeReset(cbGrade6);



        lbCGPA.setText("CGPA : " + 0.0);
        lbCredit.setText("Total Credit : " + 0.0);

    }


    public void gradeReset(ComboBox<String> grade) {

        grade.getSelectionModel().clearSelection();

        grade.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText("Grade");
                } else {
                    setText(item);
                }
            }
        });
    }


    public void creditReset(ComboBox<Double> credit) {

        credit.getSelectionModel().clearSelection();

        credit.setButtonCell(new ListCell<Double>() {
            @Override
            protected void updateItem(Double item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == -1) {
                    setText("Credit");
                } else {
                    setText(String.valueOf(item));
                }
            }
        });
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

            Course course1 = new Course(tfCourse1.getText(),cbCredit1.getValue(),cbGrade1.getValue(),cbUniversity.getValue());
            Course course2 = new Course(tfCourse2.getText(),cbCredit2.getValue(),cbGrade2.getValue(),cbUniversity.getValue());

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
                Course course3 = new Course(tfCourse3.getText(),cbCredit3.getValue(),cbGrade3.getValue(),cbUniversity.getValue());
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
                Course course4 = new Course(tfCourse4.getText(),cbCredit4.getValue(),cbGrade4.getValue(),cbUniversity.getValue());
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
                Course course5 = new Course(tfCourse5.getText(),cbCredit5.getValue(),cbGrade5.getValue(),cbUniversity.getValue());
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
                Course course6 = new Course(tfCourse6.getText(),cbCredit6.getValue(),cbGrade6.getValue(),cbUniversity.getValue());
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

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log Out");
        alert.setHeaderText("You are about to EXIT");
        alert.setContentText("Are you sure??");

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.exit(0);
        }

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

//    public void setGrade(ComboBox<String> grade) {
//
//        String[] gradeList = {"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","F"};
//        grade.getItems().setAll(gradeList);
//
//    }

    public void setGrade(ComboBox<String> grade) {

        if (cbUniversity.getValue().equals("EWU")) {
            String[] gradeList = {"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","F"};
            grade.getItems().setAll(gradeList);
        }

        else if (cbUniversity.getValue().equals("IUB") || cbUniversity.getValue().equals("NSU")) {
            String[] gradeList = {"A","A-","B+","B","B-","C+","C","C-","D+","D","F"};
            grade.getItems().setAll(gradeList);
        }

        else if (cbUniversity.getValue().equals("AIUB")) {
            String[] gradeList = {"A+","A","B+","B","C+","C","D+","D","F"};
            grade.getItems().setAll(gradeList);
        }

        else if (cbUniversity.getValue().equals("AUST")) {
            String[] gradeList = {"A+","A","A-","B+","B","B-","C+","C","D","F"};
            grade.getItems().setAll(gradeList);
        }

    }

    @FXML
    void setAllGrade(ActionEvent event) {
        //reset(event);
        setGrade(cbGrade1);
        setGrade(cbGrade2);
        setGrade(cbGrade3);
        setGrade(cbGrade4);
        setGrade(cbGrade5);
        setGrade(cbGrade6);
    }



    public ArrayList<String> getCourseName() throws IOException {

        ArrayList<String> list = new ArrayList<>();

        InputStream in = new FileInputStream("CourseName.txt");
        //InputStream in = getClass().getResourceAsStream("/CourseName.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line;

        while ((line=reader.readLine())!=null) {
            list.add(line);
        }

        in.close();
        reader.close();


        return list;
    }



    public void popUpStyle(TextField textField, ArrayList<String> list) throws FileNotFoundException {


        AutoCompletionBinding<String> autoComplete = TextFields.bindAutoCompletion(textField,list);
        autoComplete.setPrefWidth(textField.getPrefWidth());
        autoComplete.getAutoCompletionPopup().setStyle(
//                "-fx-font-family :  Candara;" +
                        "-fx-font-style :  italic;" +
                        "-fx-font-weight : BOLD;" +
                        "-fx-font-size : 15"
        );

    }







    public void setCbUniversity() {

        String[] uniList = {"EWU","NSU","AIUB","AUST","IUB"};
        cbUniversity.getItems().setAll(uniList);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        setCbCourse(cbCourse1);
//        setCbCourse(cbCourse2);
//        setCbCourse(cbCourse3);
//        setCbCourse(cbCourse4);
//        setCbCourse(cbCourse5);
//        setCbCourse(cbCourse6);


        try {
            popUpStyle(tfCourse1,getCourseName());
            popUpStyle(tfCourse2,getCourseName());
            popUpStyle(tfCourse3,getCourseName());
            popUpStyle(tfCourse4,getCourseName());
            popUpStyle(tfCourse5,getCourseName());
            popUpStyle(tfCourse6,getCourseName());

        } catch (IOException e) {
            e.printStackTrace();
        }


        setCbCredit(cbCredit1);
        setCbCredit(cbCredit2);
        setCbCredit(cbCredit3);
        setCbCredit(cbCredit4);
        setCbCredit(cbCredit5);
        setCbCredit(cbCredit6);

        setCbUniversity();
        cbUniversity.getSelectionModel().selectFirst();

        setGrade(cbGrade1);
        setGrade(cbGrade2);
        setGrade(cbGrade3);
        setGrade(cbGrade4);
        setGrade(cbGrade5);
        setGrade(cbGrade6);



    }
}
