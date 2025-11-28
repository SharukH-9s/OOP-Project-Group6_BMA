package com.example.bma_project.Mohaiminul.user6;

import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import com.example.bma_project.Mohaiminul.classesFor5and6.job;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class SaveJobController
{
    @javafx.fxml.FXML
    private TableColumn <job, String> locationCol;
    @javafx.fxml.FXML
    private TableColumn <job, String>  jobtitleCol;
    @javafx.fxml.FXML
    private TableColumn <job, Double> salaryCol;
    @javafx.fxml.FXML
    private TableColumn <job, String> hospitalNameCol;
    @javafx.fxml.FXML
    private TableColumn <job, String> TypeCol;
    @javafx.fxml.FXML
    private TableView<job> JobTableView;

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
    public void handlePrintButton(ActionEvent actionEvent) throws IOException {

       // Open Save window
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Jobs File");

        // Default file extension
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("DAT files (*.dat)", "*.dat");
        fileChooser.getExtensionFilters().add(extFilter);

        // Suggest default filename
        fileChooser.setInitialFileName("jobs.dat");

        // Get the current window
        Stage stage = (Stage) JobTableView.getScene().getWindow();

        // Let user choose save location
        File selectedFile = fileChooser.showSaveDialog(stage);

        // If user cancels, do nothing
        if (selectedFile == null) {
            return;
        }


        // Convert TableView data to List
        var list = new java.util.ArrayList<>(JobTableView.getItems());
        // Write to the selected file
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(selectedFile))) {

            out.writeObject(list);
            System.out.println("Jobs saved to: " + selectedFile.getAbsolutePath());

        }
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/user6/doctorsDash-view.fxml", "Dash Board");
    }
}