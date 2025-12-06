package com.example.bma_project.Pulok;

import com.example.bma_project.HelloApplication;
import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import com.example.bma_project.Pulok.User1.Admin;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.example.bma_project.Mohaiminul.classesFor5and6.financeOfficer;
import java.io.IOException;

public class CommonClass  {

    public static Admin adminOfficer= new Admin();

    public static financeOfficer fo_officer;

    //scene switch method
    public static void sceneSwitch(ActionEvent actionEvent, String fxmlfile, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlfile));
        Scene Newscene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(Newscene);
        stage.setTitle(title);
        stage.show();
    }
}
