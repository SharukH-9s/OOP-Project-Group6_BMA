module com.example.bma_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.bma_project to javafx.fxml;
    exports com.example.bma_project;
    exports com.example.bma_project.Mohaiminul.user6;
    opens com.example.bma_project.Mohaiminul.user6 to javafx.fxml;
    exports com.example.bma_project.Mohaiminul.user5;
    opens com.example.bma_project.Mohaiminul.user5 to javafx.fxml;
    exports com.example.bma_project.Mohaiminul.classesFor5and6;
    opens com.example.bma_project.Mohaiminul.classesFor5and6 to javafx.fxml;

}