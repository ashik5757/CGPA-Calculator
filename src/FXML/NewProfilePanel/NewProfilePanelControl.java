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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
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




        FXMLLoader loader = new FXMLLoader(getClass().getResource("../SavedProfileData/ProfilePanel.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


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









//    public void createProfileData(Object profile) throws IOException{
//
//        //FileOutputStream fileOut = new FileOutputStream(file);
//        FileOutputStream fileOut = new FileOutputStream(fileName());
//        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
//
//
//        objOut.writeObject(profile);
//        fileOut.close();
//        objOut.flush();
//        objOut.close();
//
//
//    }
//
//    public void updateFileList() {
//
//
//    }



//    public void reader() throws IOException, ClassNotFoundException {
//
//        FileInputStream fileRead = new FileInputStream("/CGPA-Calculator/data/Profile/Profile-1.txt");
//        ObjectInputStream objRead = new ObjectInputStream(fileRead);
//
//        Profile p = (Profile) objRead.readObject();
//       // System.out.println(p.toString());
//
//        fileRead.close();
//        objRead.close();
//
//    }


//    public File fileName() throws IOException {
//
//        File file;
//        String fileName = "Profile-";
//        int i = 1;
//
//        while(true) {
//
//            file = new File("/CGPA-Calculator/data/Profile/"+fileName+i+".txt");
//
//            if (!file.exists()) {
//                break;
//            }
//
//            else if (file.exists()) {
//                i++;
//            }
//
//        }
//
//        return file;
//
//    }









    @FXML
    void exit(ActionEvent event) {

        System.exit(0);

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        setCbUniversity();
        setCbSession();
        setCbYear();


    }
}
