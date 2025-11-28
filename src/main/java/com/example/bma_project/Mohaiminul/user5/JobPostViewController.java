package com.example.bma_project.Mohaiminul.user5;

import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import com.example.bma_project.Mohaiminul.classesFor5and6.job;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.time.LocalDate;

public class JobPostViewController
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
        // this part works like setters. sets each fields of job class to each column
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
    public void handleAddNewJobButton(ActionEvent actionEvent) throws IOException{
        HelperClass.sceneSwitch(actionEvent, "Mohaiminul/post-job-form.fxml", "Post Job");
    }

    @javafx.fxml.FXML
    public void handleBackToDashButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/financeofficerDash-view.fxml", "Dashboard");
    }
}