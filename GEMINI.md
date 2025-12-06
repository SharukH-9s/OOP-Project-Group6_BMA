# BMA Project

## Project Overview

This is a JavaFX application that serves as a simple management system for a hospital or medical association. The application has two main user roles: Finance Officer and Doctor.

*   **Finance Officer:** The finance officer can post job openings, manage doctor profiles, and view the payment status of doctors.
*   **Doctor:** Doctors can apply for jobs, view their application status, and manage their profiles.

The application uses JavaFX for the user interface and stores data in-memory in `ArrayList`s.

## Building and Running

This is a Maven project. You will need a JDK (version 21 or higher) and Maven installed.

### Building the Project

To build the project, run the following command from the root directory:

```bash
./mvnw clean install
```

### Running the Project

To run the application, use the following command:

```bash
./mvnw clean javafx:run
```

**Note:** The application may require the `JAVA_HOME` environment variable to be set to the path of your JDK installation.

## Development Conventions

*   **Code Style:** The code follows standard Java conventions.
*   **UI:** The user interface is defined in FXML files located in `src/main/resources/com/example/bma_project/Mohaiminul/`.
*   **Controllers:** Each FXML file has a corresponding controller class in `src/main/java/com/example/bma_project/Mohaiminul/`.
*   **Data Models:** The core data models (`Doctor`, `financeOfficer`, `job`) are located in `src/main/java/com/example/bma_project/Mohaiminul/classesFor5and6/`.
*   **Helper Class:** A `HelperClass` is used to store shared data (in-memory) and provide utility functions like scene switching.
*   **Unpaid Doctors View:** The `unpaid-doctors-view.fxml` and its controller `UnpaidDoctorsViewController.java` are used by the finance officer to view lists of paid and unpaid doctors.