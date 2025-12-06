package com.example.bma_project.Mohaiminul.user5;

import com.example.bma_project.Mohaiminul.classesFor5and6.Doctor;
import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AddNewDoctorViewController
{
    @javafx.fxml.FXML
    private TextField newDocPassTextField;
    @javafx.fxml.FXML
    private TextField newDocIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleAddDocButton(ActionEvent actionEvent) throws IOException {
        if ((!(newDocIdTextField.getText().isEmpty()) && !(newDocPassTextField.getText().isEmpty()))) {

            // if id starts with doc_
            if (newDocIdTextField.getText().startsWith("doc_")){
                //using the 10 fields constructor, we create a new object of doctor only with id and pass.
                // Parent User class's 5 fields comes first
                Doctor newDoc= new Doctor(

                        0, newDocPassTextField.getText(), null,null ,
                        newDocIdTextField.getText()
                );

                // we add the doctor object to arraylist, show success message and show the table
                HelperClass.doctorArrayList.add(newDoc);

                Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                a.setContentText("doc added");
                a.showAndWait();

            } else { // if id doesnt start with doc_
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("doc name starts with doc_");
                a.showAndWait();
            }

        }
        else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("fill both fields");
            a.showAndWait();
        }
    }
    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/financeofficerDash-view.fxml", "Dash Board");
    }

    @javafx.fxml.FXML
    public void handleViewDocListButton(ActionEvent actionEvent) throws IOException {

        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/doc-list-view.fxml", "Doc list ");
    }
}