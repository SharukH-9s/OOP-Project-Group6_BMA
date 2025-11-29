package com.example.bma_project.Mohaiminul.classesFor5and6;

public class Users {
    protected String id;
    protected String name;
    protected String email;
    protected String password;
    protected int phone;

    public Users(int phone, String password, String email, String name, String id) {
        this.phone = phone;
        this.password = password;
        this.email = email;
        this.name = name;
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
