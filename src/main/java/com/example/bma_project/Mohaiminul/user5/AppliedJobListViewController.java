package com.example.bma_project.Mohaiminul.user5;

import com.example.bma_project.Mohaiminul.classesFor5and6.Doctor;
import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import com.example.bma_project.Mohaiminul.classesFor5and6.job;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.io.IOException;
import java.time.LocalDate;

public class AppliedJobListViewController
{ //datatypes for tableview columns
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
    private TableView<job> JobTableView;
    @javafx.fxml.FXML
    private TableColumn <job, LocalDate> appDeadlineCol;
    @javafx.fxml.FXML
    private TableColumn <job, LocalDate> dateofPostedCol;
    @javafx.fxml.FXML
    private Text docNameLabel;

    @javafx.fxml.FXML
    public void initialize() {
        docNameLabel.setText(HelperClass.loggedInDoctor.getName());

        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        jobtitleCol.setCellValueFactory(new PropertyValueFactory<>("jobtitle"));
        hospitalNameCol.setCellValueFactory(new PropertyValueFactory<>("hospitalName"));
        TypeCol.setCellValueFactory(new PropertyValueFactory<>("employmentType"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));
        appDeadlineCol.setCellValueFactory(new PropertyValueFactory<>("deadline"));
        dateofPostedCol.setCellValueFactory(new PropertyValueFactory<>("postdate"));
    }

    // This method is called by the previous controller to pass in the required data.
    public void initData(String doctorId) {
            Doctor selectedDoctor = null;
           for (Doctor doc : HelperClass.doctorArrayList) {
                   if (doc.getId().equals(doctorId)) {
                            selectedDoctor = doc;
                            break;
                   }
                 }
        if (selectedDoctor.getAppliedJobs() != null) {

            JobTableView.getItems().addAll(selectedDoctor.getAppliedJobs());

        } else {
            // If null
            Alert c = new Alert(Alert.AlertType.ERROR);
            c.setContentText("No applied jobs!");
            c.showAndWait();
        }
         }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/applied-doc-list-view.fxml", "Doc List");
    }
}