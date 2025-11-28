package com.example.bma_project.Mohaiminul.user6;

import com.example.bma_project.Mohaiminul.classesFor5and6.Doctor;
import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class DocOwnProfileDetailController
{
    @javafx.fxml.FXML
    private TableView <Doctor> DocsTable;
    @javafx.fxml.FXML
    private TableColumn<Doctor,String> docIdCol;
    @javafx.fxml.FXML
    private TableColumn <Doctor,String> docPassCol;
    @javafx.fxml.FXML
    private TableColumn <Doctor,String> docEmailCol;
    @javafx.fxml.FXML
    private TableColumn <Doctor,String>docNumberCol;
    @javafx.fxml.FXML
    private TableColumn <Doctor,String>docAddressCol;
    @javafx.fxml.FXML
    private TableColumn<Doctor,String> docSkillCol;
    @javafx.fxml.FXML
    private TableColumn <Doctor,String> docNameCol;
    @javafx.fxml.FXML
    private TableColumn <Doctor,String> docEducationCol;
    @javafx.fxml.FXML
    private TableColumn <Doctor,Integer> docExpCol;
    @javafx.fxml.FXML
    private Label transactionIdLabel;

    @javafx.fxml.FXML
    public void initialize() {
        docIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        docPassCol.setCellValueFactory(new PropertyValueFactory<>("password"));
        docEmailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        docNumberCol.setCellValueFactory(new PropertyValueFactory<>("phone"));
        docAddressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        docSkillCol.setCellValueFactory(new PropertyValueFactory<>("skill"));
        docNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        docEducationCol.setCellValueFactory(new PropertyValueFactory<>("education"));
        docExpCol.setCellValueFactory(new PropertyValueFactory<>("experience"));
        transactionIdLabel.setText(HelperClass.loggedInDoctor.getTransaction_id());

        DocsTable.getItems().addAll(HelperClass.loggedInDoctor); // displaying currently logged in doctors details


    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/user6/doctorsDash-View.fxml", " Dashboard");
    }
}