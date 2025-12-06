package com.example.bma_project.Pulok.User1;
import com.example.bma_project.Mohaiminul.classesFor5and6.financeOfficer;
import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import com.example.bma_project.Pulok.CommonClass;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AddFOofficerController
{
    @javafx.fxml.FXML
    private TextField phoneText;
    @javafx.fxml.FXML
    private TextField hospitalText;
    @javafx.fxml.FXML
    private TextField passText;
    @javafx.fxml.FXML
    private TextField mailText;
    @javafx.fxml.FXML
    private TextField nameText;
    @javafx.fxml.FXML
    private TextField idText;
    @javafx.fxml.FXML
    private ComboBox designationBox;

    @javafx.fxml.FXML
    public void initialize() {

        designationBox.getItems().addAll("Senior","Junior");

    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
if (!(idText.getText().isEmpty()) && !(passText.getText().isEmpty()))
{
    financeOfficer officer = new financeOfficer(
            Integer.parseInt(phoneText.getText()),
            passText.getText(),mailText.getText(),nameText.getText(),idText.getText(),hospitalText.getText(), (String) designationBox.getValue()
    );

    CommonClass.fo_officer = officer;
}

    }

    @javafx.fxml.FXML
    public void backButtonHandle(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Pulok/User1_2/User1/adminDashboard.fxml","Dashboard");
    }
}