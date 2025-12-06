package com.example.bma_project.Mohaiminul.classesFor5and6;

import com.example.bma_project.Pulok.CommonClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class LoginViewController {
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private PasswordField passTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML  // for the Login Button
    public void handleLoginButton(ActionEvent actionEvent) throws IOException {

        if (((idTextField.getText().equals(CommonClass.adminOfficer.getUsername())) &&
                    (passTextField.getText().equals(CommonClass.adminOfficer.getPassword()))))
            {
                HelperClass.sceneSwitch(actionEvent,"Pulok/User1_2/User1/adminDashboard.fxml","Dashboard");
            }
        else if ((idTextField.getText().equals(CommonClass.fo_officer.getId()) && (passTextField.getText().equals(CommonClass.fo_officer.getPassword())))) //check if input is FO's id
        {
            HelperClass.sceneSwitch(actionEvent, "Mohaiminul/financeofficerDash-view.fxml", "Dash Board"); // logins to dashboard.
        }


            else if (idTextField.getText().startsWith("doc_")) { //check if input is doctor's id

                if (HelperClass.doctorArrayList.isEmpty()) // check if doctor profiles are available in arraylist
                {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setContentText("no profile for any doctor, please contact FO to add a profile");
                    a.showAndWait();
                }

                for (Doctor d : HelperClass.doctorArrayList) { // docarraylist isn't empty, so we iterate over the doctor objects from the list and
                    // try to find a match for id and password which we got from text fields

                    if (d.getId().equals(idTextField.getText()) && (d.getPassword().equals(passTextField.getText()))) {

                        HelperClass.loggedInDoctor = d; // for successful login of a doctor, we track it. we can add or edit that doctors fields (id,pass,joblist) using it
                        HelperClass.sceneSwitch(actionEvent, "Mohaiminul/user6/doctorsDash-view.fxml", "Dash Board"); // got a match, so switch to docdashboard
                        break;
                    }
                }
            }

            else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("incorrect id or password!");
                a.showAndWait();
            }

    }

    }
