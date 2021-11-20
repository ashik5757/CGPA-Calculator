package FXML.SavedProfilePanel;

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
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SavedProfilePanelControl implements Initializable {

    @FXML
    private JFXButton btExit;

    @FXML
    private JFXButton btOpenProfile;

    @FXML
    private ComboBox<String> cbSavedProfile;


    private DataList dataList;



    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void openProfile(ActionEvent event) throws IOException {


        dataList.setCurrentProfile(getSelectedProfile());
        createDataList(dataList);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../SavedProfileData/ProfilePanel.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }


    public Profile getSelectedProfile() {
        int index = cbSavedProfile.getSelectionModel().getSelectedIndex();
        return dataList.getProfileList().get(index);
    }







    public void createDataList(Object dataList) throws IOException{

        FileOutputStream fileOut = new FileOutputStream("/CGPA-Calculator/data/DataList.txt");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);


        objOut.writeObject(dataList);
        fileOut.close();
        objOut.flush();
        objOut.close();


    }



//    public ArrayList<String> profileList(){
//
//        ArrayList<String> profileList = new ArrayList<>();
//
//        for(Profile profile : dataList.getProfileList()) {
//            profileList.add(profile.getName());
//        }
//
//        return profileList;
//    }


    public void setCbSavedProfile() throws IOException, ClassNotFoundException {

        ArrayList<String> profileList = new ArrayList<>();

        for(Profile profile : dataList.getProfileList()) {
            profileList.add(profile.getName());
        }

        cbSavedProfile.getItems().setAll(profileList);
    }


    public void setDataList() throws IOException, ClassNotFoundException {

        FileInputStream fileRead = new FileInputStream("/CGPA-Calculator/data/DataList.txt");
        ObjectInputStream objRead = new ObjectInputStream(fileRead);

        dataList = (DataList) objRead.readObject();

        fileRead.close();
        objRead.close();
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            setDataList();
            setCbSavedProfile();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
