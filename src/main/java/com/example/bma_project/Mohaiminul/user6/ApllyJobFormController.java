package com.example.bma_project.Mohaiminul.user6;

import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import com.example.bma_project.Mohaiminul.classesFor5and6.job;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class ApllyJobFormController
{   //
    @javafx.fxml.FXML
    private Text hospitalText;
    @javafx.fxml.FXML
    private Text titleText;
    @javafx.fxml.FXML
    private Text salaryText;
    @javafx.fxml.FXML
    private TextField TitleTextField;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/user6/jobs-view-for-doctor.fxml", "Job View");
    }

    @javafx.fxml.FXML
    public void handleSearchButton(ActionEvent actionEvent) {
         if ( TitleTextField.getText().isEmpty())
        {
            Alert c = new Alert(Alert.AlertType.ERROR);
            c.setContentText("Enter Title");
            c.showAndWait();
        }
         // we search with the title of a job from job table. if we find a match from the jobArraylist,
        // we display that jobs title, salary and hospital name.
           if (!(TitleTextField.getText().isEmpty())) {
               for(job j : HelperClass.jobArrayList){
                   if (j.getJobtitle().equals(TitleTextField.getText())) {
                       hospitalText.setText(j.getHospitalName());
                       titleText.setText(j.getJobtitle());
                       salaryText.setText(Double.toString(j.getSalary()));
                       break;
                   }
               }
           }
    }

    @javafx.fxml.FXML
    public void handleApplyButton(ActionEvent actionEvent) throws IOException {
        if ( TitleTextField.getText().isEmpty())
        {
            Alert c = new Alert(Alert.AlertType.ERROR);
            c.setContentText("no selected jobs");
            c.showAndWait();
        }

        else {
            //we search with the title of a job from the jobArrayList.
            for(job j : HelperClass.jobArrayList){
                if(j.getJobtitle().equals(TitleTextField.getText())){

                    //if we find a match in the title, we display that jobs details
                    hospitalText.setText(j.getHospitalName());
                    titleText.setText(j.getJobtitle());
                    salaryText.setText(Double.toString(j.getSalary()));

                    // we save that job object in the logged in doctor's appliedJobs
                    HelperClass.loggedInDoctor.addAppliedJob(j);
                    Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                    a.setContentText("application has been successful!");
                    a.showAndWait();
                    HelperClass.sceneSwitch(actionEvent, "Mohaiminul/user6/doctors-applied-jobs-view.fxml", "Applied Job");
                    break;
                }
                
            }

        }

    }
}