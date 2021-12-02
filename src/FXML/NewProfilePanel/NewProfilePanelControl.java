package FXML.NewProfilePanel;

import Class.*;
import FXML.SavedProfileData.ProfilePanelControl;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;

public class NewProfilePanelControl implements Initializable {

    @FXML
    private JFXButton btCreate;

    @FXML
    private ComboBox<String> cbUniversity;

    @FXML
    private ComboBox<String> cbSession;

    @FXML
    private ComboBox<Integer> cbYear;

    @FXML
    private TextField tfName;

    @FXML
    private JFXButton btExit;

    @FXML
    void createProfile(ActionEvent event) throws IOException, ClassNotFoundException {


        if (!tfName.getText().isBlank() && cbSession.getValue()!=null && cbYear.getValue()!=null && cbUniversity.getValue()!=null) {

            File dataFile = new File("/CGPA-Calculator/data/DataList.txt");
            Profile profile;

            if (!dataFile.exists()) {
                profile = new Profile(tfName.getText(),cbUniversity.getValue(),cbSession.getValue(),cbYear.getValue());
                addProfile(profile);
            }

            else if (dataFile.exists())  {
                profile = new Profile(profileName(tfName.getText()),cbUniversity.getValue(),cbSession.getValue(),cbYear.getValue());
                addProfile(profile);
            }


            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/SavedProfileData/ProfilePanel.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        }


        else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Input format incorrect or Empty");
            alert.setContentText("Please input all information");
            alert.show();

        }



    }


    public void addProfile(Profile profile) throws IOException, ClassNotFoundException {

        File dataFile = new File("/CGPA-Calculator/data/DataList.txt");

        if (!dataFile.exists()) {

            DataList dataList = new DataList(profile);
            dataList.updateList(profile);
            createDataList(dataList);

        }

        else if (dataFile.exists()) {       // check at first launch , if it is work or not

            FileInputStream fileRead = new FileInputStream("/CGPA-Calculator/data/DataList.txt");
            ObjectInputStream objRead = new ObjectInputStream(fileRead);

            DataList dataList = (DataList) objRead.readObject();
            dataList.updateList(profile);
            dataList.setCurrentProfile(profile);

            createDataList(dataList);

            fileRead.close();
            objRead.close();
        }

    }




    public void createDataList(Object dataList) throws IOException{

        FileOutputStream fileOut = new FileOutputStream("/CGPA-Calculator/data/DataList.txt");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);


        objOut.writeObject(dataList);
        fileOut.close();
        objOut.flush();
        objOut.close();


    }





    public String profileName(String name) throws IOException, ClassNotFoundException {

        FileInputStream fileRead = new FileInputStream("/CGPA-Calculator/data/DataList.txt");
        ObjectInputStream objRead = new ObjectInputStream(fileRead);

        DataList dataList = (DataList) objRead.readObject();

        int i = 1;
        String tempName = name;

        for (Profile profile : dataList.getProfileList()) {
            if (profile.getName().equals(name)) {
                name = tempName + "_" + i;
                i++;
            }
        }

        fileRead.close();
        objRead.close();


        return name;

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


    public void setCbUniversity() {

        String[] uniList = {"EWU","NSU","AIUB","AUST","IUB"};
        cbUniversity.getItems().setAll(uniList);
    }

    public void setCbSession() {
        String[] session = {"Summer","Fall","Winter","Spring"};
        cbSession.getItems().setAll(session);
    }

    public void setCbYear() {
        Integer[] year = {15,16,17,18,19,20,21,22};
        cbYear.getItems().setAll(year);
    }


    @FXML
    void updateSession(ActionEvent event) {

        if (cbUniversity.getValue().equals("AUST")) {
            String[] session = {"Fall","Spring"};
            cbSession.getItems().setAll(session);
            cbSessionReset(cbSession);
        }

        else {
            String[] session = {"Summer","Fall","Spring"};
            cbSession.getItems().setAll(session);
            cbSessionReset(cbSession);
        }


    }


    public void cbSessionReset(ComboBox<String> cbSession) {

        cbSession.getSelectionModel().clearSelection();
        //cbSession.getSelectionModel().selectFirst();

        cbSession.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText("Session");
                } else {
                    setText(item);
                }
            }
        });
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        setCbUniversity();
        setCbSession();
        setCbYear();


    }
}
