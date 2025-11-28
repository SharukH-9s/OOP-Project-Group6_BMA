package com.example.bma_project.Mohaiminul.user5;

import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import javafx.event.ActionEvent;

import java.io.IOException;

public class FinanceofficerDashViewController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handlePostjobButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/job-post-view.fxml", "Jobs");

    }

    @javafx.fxml.FXML
    public void handleLogOutButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/login-view.fxml", "Login");
    }

    @javafx.fxml.FXML
    public void handleAddDocButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/add-new-doctor-view.fxml", "add doc");
    }


    @javafx.fxml.FXML
    public void handleAppliedJobsButon(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/applied-doc-list-view.fxml", "add doc");

    }

    @javafx.fxml.FXML
    public void handleUnpaidProfilesButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/user5/unpaid-doctors-view.fxml", "Pay List");
    }
}