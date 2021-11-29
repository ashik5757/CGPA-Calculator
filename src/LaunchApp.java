import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import Class.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LaunchApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/Homepage2.fxml"));
        Parent root = loader.load();

        createPath();

        primaryStage.setTitle("CGPA Calculator");
        primaryStage.setScene(new Scene(root));
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();

        primaryStage.setOnCloseRequest(e ->{
            e.consume();
            logOut(primaryStage);
        });




        root.setOnMousePressed(pressEvent -> {
            root.setOnMouseDragged(dragEvent -> {
                primaryStage.setX(dragEvent.getScreenX() - pressEvent.getSceneX());
                primaryStage.setY(dragEvent.getScreenY() - pressEvent.getSceneY());
            });
        });




    }


    public void logOut(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log Out");
        alert.setHeaderText("You are about to EXIT");
        alert.setContentText("Are you sure??");


        if (alert.showAndWait().get() == ButtonType.OK) {
            stage.close();
        }

    }




    public void createPath() throws IOException {

//        Path path = Paths.get("/CGPA-Calculator/data/Profile/");
//        Path path2 = Paths.get("/CGPA-Calculator/data/Session/");
//
//        if (!Files.isDirectory(path)) {
//            Files.createDirectories(path);
//        }
//
//        if (!Files.isDirectory(path2)) {
//            Files.createDirectories(path2);
//        }
//
//        File file = new File("/CGPA-Calculator/data/CurrentProfile.txt");
//        if (!file.exists()) {
//            file.createNewFile();
//        }
//
//        File file2 = new File("/CGPA-Calculator/data/ProfileList.txt");
//        if (!file2.exists()) {
//            file2.createNewFile();
//        }

//        File dataFile = new File("/CGPA-Calculator/data/DataList.txt");
//        if (!dataFile.exists()) {
//
//            DataList dataList = new DataList();
//            createDataList(dataList);
//
//        }


        Path path = Paths.get("/CGPA-Calculator/data/");

        if (!Files.isDirectory(path)) {
            Files.createDirectories(path);
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




}
