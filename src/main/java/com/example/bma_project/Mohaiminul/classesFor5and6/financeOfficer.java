package com.example.bma_project.Mohaiminul.classesFor5and6;

public class financeOfficer extends Users {
   private String hospitalName;
   private String designation;

    public financeOfficer(String phone, String password, String email, String name, String id, String hospitalName, String designation) {
        super(phone, password, email, name, id);
        this.hospitalName = hospitalName;
        this.designation = designation;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "financeOfficer{" +
                "hospitalName='" + hospitalName + '\'' +
                ", designation='" + designation + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
    // create a single financeofficer object which will be used in various controller
    static financeOfficer officer = new financeOfficer("01963649988", "1234", "MHSRK", "officer1","mroff", "DMC", "FinanceOfficer");
}
