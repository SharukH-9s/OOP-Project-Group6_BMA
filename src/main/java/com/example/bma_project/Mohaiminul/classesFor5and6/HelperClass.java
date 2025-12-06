package com.example.bma_project.Mohaiminul.classesFor5and6;

import com.example.bma_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;

public class HelperClass {

    //arraylist for holding doctors profiles/objects of Doctor
    public static ArrayList<Doctor>doctorArrayList=new ArrayList<>();

    //arraylist for holding Posted job objects
    public static ArrayList<job> jobArrayList = new ArrayList<>();


    public static Doctor loggedInDoctor;





    //scene switch method
    public static void sceneSwitch(ActionEvent actionEvent, String fxmlFile, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
}