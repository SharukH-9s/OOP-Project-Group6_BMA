package com.example.bma_project.Pulok.User2;

import com.example.bma_project.Mohaiminul.classesFor5and6.Doctor;
import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class EditDocListController
{
    @javafx.fxml.FXML
    private TableView<Doctor> DocsTable;
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


        DocsTable.getItems().addAll(HelperClass.doctorArrayList);
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Pulok/User1/adminDashboard.fxml","Dashboard");
    }

    @javafx.fxml.FXML
    public void deleteButton(ActionEvent actionEvent) {

        for (Doctor d: HelperClass.doctorArrayList)
        {
            if (d.getExperience() < 2)
            {
                HelperClass.doctorArrayList.remove(d);
            }
        }
    }
}