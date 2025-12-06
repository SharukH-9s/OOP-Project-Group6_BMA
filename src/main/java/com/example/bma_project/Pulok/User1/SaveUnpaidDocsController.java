package com.example.bma_project.Pulok.User1;

import com.example.bma_project.Mohaiminul.classesFor5and6.Doctor;
import com.example.bma_project.Mohaiminul.classesFor5and6.HelperClass;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

public class SaveUnpaidDocsController
{
    @javafx.fxml.FXML
    private TableView DocsTable;
    @javafx.fxml.FXML
    private TableColumn docIdCol;
    @javafx.fxml.FXML
    private TableColumn docNameCol;
    @javafx.fxml.FXML
    private TableColumn transcationIdColumn;

    @javafx.fxml.FXML
    public void initialize() {
        docIdCol.setCellValueFactory(new PropertyValueFactory<>("Id"));
        docNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        transcationIdColumn.setCellValueFactory(new PropertyValueFactory<>("transaction_id"));

        for (Doctor d : HelperClass.doctorArrayList){
            if ((d.getTransaction_id().equals("empty")) || (!(d.getTransaction_id().startsWith("TRNX")) && !(d.getTransaction_id().endsWith("025"))))  {
                DocsTable.getItems().add(d);
            }
        }
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        HelperClass.sceneSwitch(actionEvent,"Pulok/User1_2/User1/adminDashboard.fxml","Dashboard");
    }

    @javafx.fxml.FXML
    public void handleSaveButton(ActionEvent actionEvent) throws FileNotFoundException {

        //open Save window
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Docs File");

        //default file extension
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("DAT files (*.dat)", "*.dat");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.setInitialFileName("Docs.dat");
        Stage stage = (Stage) DocsTable.getScene().getWindow();
        File selectedFile = fileChooser.showSaveDialog(stage);
        if (selectedFile == null) {
            return;
        }

        var list = new java.util.ArrayList<>(DocsTable.getItems());
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(selectedFile))) {

            out.writeObject(list);
            System.out.println("Docs saved to: " + selectedFile.getAbsolutePath());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }
