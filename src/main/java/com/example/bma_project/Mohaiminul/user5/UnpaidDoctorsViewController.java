package com.example.bma_project.Mohaiminul.user5;

import com.example.bma_project.Mohaiminul.classesFor5and6.Doctor;
import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class UnpaidDoctorsViewController
{
    @javafx.fxml.FXML
    private TableView DocsTable;
    @javafx.fxml.FXML
    private TableColumn <Doctor, String> docIdCol;
    @javafx.fxml.FXML
    private TableColumn <Doctor, String> docNameCol;
    @javafx.fxml.FXML
    private TableColumn<Doctor, String>  transcationIdColumn;
    @javafx.fxml.FXML
    private TableColumn <Doctor, String> PaidtranscationIdColumn;
    @javafx.fxml.FXML
    private TableColumn  <Doctor, String>PaiddocIdCol;
    @javafx.fxml.FXML
    private TableColumn <Doctor, String>PaiddocNameCol;
    @javafx.fxml.FXML
    private TableView paidDocsTable;

    @javafx.fxml.FXML
    public void initialize() {
        docIdCol.setCellValueFactory(new PropertyValueFactory<>("Id"));
        docNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        transcationIdColumn.setCellValueFactory(new PropertyValueFactory<>("transaction_id"));

        PaiddocIdCol.setCellValueFactory(new PropertyValueFactory<>("Id"));
        PaiddocNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        PaidtranscationIdColumn.setCellValueFactory(new PropertyValueFactory<>("transaction_id"));

        for (Doctor d : HelperClass.doctorArrayList){
            if ((d.getTransaction_id().equals("empty")) || (!(d.getTransaction_id().startsWith("TRNX")) && !(d.getTransaction_id().endsWith("025"))))  {
                DocsTable.getItems().add(d);
            }
        }
        for (Doctor d : HelperClass.doctorArrayList){
            if (!(d.getTransaction_id().isEmpty()) && (d.getTransaction_id().startsWith("TRNX")) && (d.getTransaction_id().endsWith("025")))  {
                paidDocsTable.getItems().add(d);
            }
        }

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Mohaiminul/financeofficerDash-view.fxml", "Dashboard");
    }
}