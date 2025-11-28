package com.example.bma_project.Mohaiminul.classesFor5and6;

import java.io.Serializable;
import java.time.LocalDate;

public class job implements Serializable { // mae it serializable cause later, we will save jobs in a file
    private String jobtitle,hospitalName,location,employmentType;
    private LocalDate deadline, postdate;
    private double salary;

    public job(double salary, LocalDate postdate, LocalDate deadline, String employmentType, String location, String hospitalName, String jobtitle) {
        this.salary = salary;
        this.postdate = postdate;
        this.deadline = deadline;
        this.employmentType = employmentType;
        this.location = location;
        this.hospitalName = hospitalName;
        this.jobtitle = jobtitle;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getPostdate() {
        return postdate;
    }

    public void setPostdate(LocalDate postdate) {
        this.postdate = postdate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return "job{" +
                "jobtitle='" + jobtitle + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", location='" + location + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", deadline=" + deadline +
                ", postdate=" + postdate +
                ", salary=" + salary +
                '}';
    }
}
