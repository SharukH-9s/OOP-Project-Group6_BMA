package com.example.bma_project.Mohaiminul.user5;

import com.example.bma_project.HelloApplication;
import com.example.bma_project.Mohaiminul.classesFor5and6.Doctor;
import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class AppliedDocListViewController {
    @javafx.fxml.FXML
    private TableView<Doctor> DocsTable;
    @javafx.fxml.FXML
    private TableColumn<Doctor, String> docIdCol;
    @javafx.fxml.FXML
    private TableColumn<Doctor, String> docNameCol;
    @javafx.fxml.FXML
    private TableColumn <Doctor, String> transcationIdColumn;

    @javafx.fxml.FXML
    public void initialize() {
        // displays the list of created doctors, from here we can select a doctor to see his applied jobs.

        docIdCol.setCellValueFactory(new PropertyValueFactory<>("Id"));
        docNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        transcationIdColumn.setCellValueFactory(new PropertyValueFactory<>("transaction_id"));

        // Load data from HelperClass
        DocsTable.getItems().addAll(HelperClass.doctorArrayList);

        // Add a listener to handle clicks on table rows
        DocsTable.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, newSelection) -> {
                    if (newSelection != null)
                    {
                        showAppliedJobsForDoctor(newSelection);
                    }
                }
        );
    }

    private void showAppliedJobsForDoctor( Doctor selectedDoctor)
    {
        try { // Load the FXML for the next view
            FXMLLoader loader =  new FXMLLoader(HelloApplication.class.getResource("Mohaiminul/appliedJobListView.fxml"));
            Scene scene = new Scene(loader.load());

            //getting controller for next view
            AppliedJobListViewController controller = loader.getController();

            //passing selected doctors id to next controller
            controller.initData(selectedDoctor.getId());

            Stage currentStage = (Stage) DocsTable.getScene().getWindow();

            // SWITCH THE SCENE
            currentStage.setScene(scene);
            currentStage.setTitle("Applied Jobs");

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/financeofficerDash-view.fxml", "Dashboard");
    }
}