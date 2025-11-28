package com.example.bma_project.Mohaiminul.user6;

import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import com.example.bma_project.Mohaiminul.classesFor5and6.job;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class DoctorsAppliedJobsViewController
{
    @javafx.fxml.FXML
    private TableColumn <job,String> locationCol;
    @javafx.fxml.FXML
    private TableColumn <job, String> jobtitleCol;
    @javafx.fxml.FXML
    private TableColumn <job, Double> salaryCol;
    @javafx.fxml.FXML
    private TableColumn <job, String>hospitalNameCol;
    @javafx.fxml.FXML
    private TableColumn <job, String>TypeCol;
    @javafx.fxml.FXML
    private TableView <job> JobTableView;

    @javafx.fxml.FXML
    public void initialize() {
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        jobtitleCol.setCellValueFactory(new PropertyValueFactory<>("jobtitle"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));
        hospitalNameCol.setCellValueFactory(new PropertyValueFactory<>("hospitalName"));
        TypeCol.setCellValueFactory(new PropertyValueFactory<>("employmentType"));

        JobTableView.getItems().addAll(HelperClass.loggedInDoctor.getAppliedJobs());

    }



    @javafx.fxml.FXML
    public void handleEditButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/user6/doctorsDash-View.fxml", " Dashboard");
    }
}