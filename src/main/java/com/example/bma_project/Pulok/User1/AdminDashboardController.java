package com.example.bma_project.Pulok.User1;

import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import com.example.bma_project.Pulok.CommonClass;
import javafx.event.ActionEvent;

import java.io.IOException;

public class AdminDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createUser5Button(ActionEvent actionEvent) throws IOException {
        CommonClass.sceneSwitch(actionEvent,"Pulok/User1_2/User1/addFOofficer.fxml", "Add");

    }

    @javafx.fxml.FXML
    public void logOutButtonHandle(ActionEvent actionEvent) throws IOException {
        CommonClass.sceneSwitch(actionEvent,"Mohaiminul/login-view.fxml", "Login");
    }

    @javafx.fxml.FXML
    public void saveUnpaidDocs(ActionEvent actionEvent) throws IOException {
        CommonClass.sceneSwitch(actionEvent,"Pulok/User1_2/User1/saveUnpaidDocs.fxml", "Add");
    }

    @javafx.fxml.FXML
    public void editbutonhandle(ActionEvent actionEvent) throws IOException {
        CommonClass.sceneSwitch(actionEvent,"Pulok.User1_2/User2/EditDocList.fxml", "Edit");
    }
}