package com.example.bma_project.Mohaiminul.user6;

import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CompleteProfileViewController
{
    @javafx.fxml.FXML
    private TextField expTextField;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField skillTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField numberTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField educationTextField;
    @javafx.fxml.FXML
    private Label idLabel;
    @javafx.fxml.FXML
    private TextField passTextField;
    @javafx.fxml.FXML
    private TextField transactionIdTextField;


    @javafx.fxml.FXML
    public void initialize() { // id Doc_ doesn't change, so we display it as soon as this window loads
    idLabel.setText(HelperClass.loggedInDoctor.getId()); // show the id that was given by the FO
    }

    @javafx.fxml.FXML
    public void handleUpdateButton(ActionEvent actionEvent) throws IOException { //using the loggedInDoctor from helperclass, we change current doctor object's data
        // first check for empty fields.
        if ( !expTextField.getText().isEmpty() && !addressTextField.getText().isEmpty() && !skillTextField.getText().isEmpty() && !emailTextField.getText().isEmpty() && !numberTextField.getText().isEmpty()
                && !nameTextField.getText().isEmpty() && !educationTextField.getText().isEmpty() && !passTextField.getText().isEmpty() )
        {
            if ( passTextField.getText().length() > 5 ) // if all fields have inputs, validate password
            {
                HelperClass.loggedInDoctor.setExperience(Integer.parseInt(expTextField.getText()));
                HelperClass.loggedInDoctor.setAddress(addressTextField.getText());
                HelperClass.loggedInDoctor.setSkill(skillTextField.getText());
                HelperClass.loggedInDoctor.setEmail(emailTextField.getText());
                HelperClass.loggedInDoctor.setPhone(Integer.parseInt(numberTextField.getText()));
                HelperClass.loggedInDoctor.setName(nameTextField.getText());
                HelperClass.loggedInDoctor.setEducation(educationTextField.getText());
                HelperClass.loggedInDoctor.setPassword(passTextField.getText());
                HelperClass.loggedInDoctor.setTransaction_id(transactionIdTextField.getText());

                HelperClass.sceneSwitch(actionEvent,"Mohaiminul/user6/doc-own-profile-detail.fxml", "profile ");

            }
        }
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {

        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/user6/doctorsDash-view.fxml", "Dash Board");

    }
}