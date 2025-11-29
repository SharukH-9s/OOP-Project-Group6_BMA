package com.example.bma_project.Mohaiminul.user5;

import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import com.example.bma_project.Mohaiminul.classesFor5and6.job;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class PostJobFormController
{
    @javafx.fxml.FXML
    private DatePicker dealineDatePicker;
    @javafx.fxml.FXML
    private TextField salaryTextfield;
    @javafx.fxml.FXML
    private TextField titletextField;
    @javafx.fxml.FXML
    private TextField companyNameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> EmployTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> locationCombobox;

    @javafx.fxml.FXML
    public void initialize() { // this creates the values for input fields each time when this window is appeared by clicking add new job button from job-post-view window
        locationCombobox.getItems().addAll("Dhaka","Khulna","CTG","ECB");
        EmployTypeComboBox.getItems().addAll("Full Time","Part Time", "Intern");

    }

    @javafx.fxml.FXML
    public void handlePostJobButton(ActionEvent actionEvent) throws IOException {
        //create an object of job class. we created a job class with jobtitle,hospitalName,location,employmentType,deadline, postdate,salary fields.
        //these fields will get values from the textFields and ComboBoxes.

        if (!(salaryTextfield.getText().isEmpty()) || (LocalDate.now().isBefore(LocalDate.now())) || (!(salaryTextfield.getText().isEmpty())) || (!(EmployTypeComboBox.getValue().isBlank()
        )) || (!(locationCombobox.getValue().isBlank() )) || (!(companyNameTextField.getText().isEmpty())) || (!(titletextField.getText().isEmpty())))
        {
            job newJob = new job(
                    Double.parseDouble(salaryTextfield.getText()),
                    LocalDate.now(),
                    dealineDatePicker.getValue(),
                    EmployTypeComboBox.getValue(),
                    locationCombobox.getValue(),
                    companyNameTextField.getText(),
                    titletextField.getText()
            );
            // now we add this newjob to the jobArrayList, which was created in helperClass to hold objects like newjob of job types.
            HelperClass.jobArrayList.add(newJob);
            //as soon as a new job object is created in arraylist, we display it on JobPostView window
            HelperClass.sceneSwitch(actionEvent,"Mohaiminul/job-post-view.fxml", "Job View");
        }
        else {
            Alert e= new Alert(Alert.AlertType.ERROR);
            e.setContentText("Fill all fields!");
            e.showAndWait();
        }
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        // button for going back to JobPostView window
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/job-post-view.fxml", "Job View");

    }
}