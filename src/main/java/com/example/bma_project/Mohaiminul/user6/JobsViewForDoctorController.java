package com.example.bma_project.Mohaiminul.user6;

import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import com.example.bma_project.Mohaiminul.classesFor5and6.job;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class JobsViewForDoctorController
{   //datatypes for tableview columns
    @javafx.fxml.FXML
    private TableColumn<job,String> locationCol;
    @javafx.fxml.FXML
    private TableColumn <job, String> jobtitleCol;
    @javafx.fxml.FXML
    private TableColumn<job, Double> salaryCol;
    @javafx.fxml.FXML
    private TableColumn <job,String>hospitalNameCol;
    @javafx.fxml.FXML
    private TableColumn <job, String> TypeCol;
    @javafx.fxml.FXML
    private TableView <job>JobTableView;
    @javafx.fxml.FXML
    private TableColumn <job, LocalDate> appDeadlineCol;
    @javafx.fxml.FXML
    private TableColumn <job, LocalDate> dateofPostedCol;



    @javafx.fxml.FXML
    public void initialize() {
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        jobtitleCol.setCellValueFactory(new PropertyValueFactory<>("jobtitle"));
        hospitalNameCol.setCellValueFactory(new PropertyValueFactory<>("hospitalName"));
        TypeCol.setCellValueFactory(new PropertyValueFactory<>("employmentType"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));
        appDeadlineCol.setCellValueFactory(new PropertyValueFactory<>("deadline"));
        dateofPostedCol.setCellValueFactory(new PropertyValueFactory<>("postdate"));

        // adding jobs to the tableview. we created these jobs in post-job-form, stored in the arraylist.
        JobTableView.getItems().addAll(HelperClass.jobArrayList);
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        // goes back to doctorsDash-view
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/user6/doctorsDash-view.fxml", "Job View");
    }

    @javafx.fxml.FXML
    public void handleApplyForJobButton(ActionEvent actionEvent) throws IOException {
        // if there is no job apply for, we dont switch scene
        if ((HelperClass.jobArrayList).isEmpty())
        {
            Alert c = new Alert(Alert.AlertType.ERROR);
            c.setContentText("No jobs to apply for!");
            c.showAndWait();
        }
       else
           HelperClass.sceneSwitch(actionEvent,"Mohaiminul/user6/aplly-job-form.fxml", "Apply Job");
    }
}