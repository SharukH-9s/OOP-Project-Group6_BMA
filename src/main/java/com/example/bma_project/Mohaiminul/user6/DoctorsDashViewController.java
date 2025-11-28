package com.example.bma_project.Mohaiminul.user6;

import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class DoctorsDashViewController
{
    @javafx.fxml.FXML
    private Label docName;
    @javafx.fxml.FXML
    private Label docName1;

    @javafx.fxml.FXML
    public void initialize() {
        docName.setText(HelperClass.loggedInDoctor.getName());
    }

    @javafx.fxml.FXML
    public void handleJobsButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/user6/jobs-view-for-doctor.fxml", "Jobs View Doctor");
    }

    @javafx.fxml.FXML
    public void handleLogOutButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/login-view.fxml", "Login");
    }

    @javafx.fxml.FXML
    public void handleEditProfile(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/user6/complete-profile-view.fxml", "Edit profile");
    }

    @javafx.fxml.FXML
    public void handleAppliedJobsButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/user6/save-job.fxml", "Save");

    }
}