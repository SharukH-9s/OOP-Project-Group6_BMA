package com.example.bma_project.Mohaiminul.classesFor5and6;

import java.io.Serializable;
import java.util.ArrayList;

public class Doctor extends Users implements Serializable {
    private String address, education, skill;
    private int  experience;
    private String transaction_id;

    // constructor for making an object using only User's 5 fields. generated before putting other 5 fields. must be used to make constructor
    public Doctor(int phone, String password, String email, String name, String id) {
        super(phone, password, email, name, id);
    }

    // constructor for making an object using User's 5 fields + new 5 fields. generated after putting other 5 fields
    public Doctor(int phone, String password, String email, String name, String id, String address, int experience, String skill, String education, String transaction_id) {
        super(phone, password, email, name, id);
        this.address = address;
        this.experience = experience;
        this.skill = skill;
        this.education = education;
        this.transaction_id = transaction_id;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTransaction_id(String transactionId) {
        this.transaction_id = transactionId;
    }
    public String getTransaction_id() {
        return transaction_id;
    }


    // arraylist for a doctor. and 2 methods to access existing job objects and add new job objects to a doctors job list
    private ArrayList<job> appliedJobs = new ArrayList<>();

    public ArrayList<job> getAppliedJobs() {
        return appliedJobs;
    }

    public void addAppliedJob(job newJob) {
        appliedJobs.add(newJob);
    }

    }




