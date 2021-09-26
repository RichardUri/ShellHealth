package com.company.Transactions;


import java.util.ArrayList;
import java.util.Random;

/*
* Insert Desc
*/
public class Prescription {

    private String patientName; //might remove
    private String presName;
    private String description;
    private String expDate;
    private String quantity;

    ArrayList<String> patientList = new ArrayList<>();
    ArrayList<String> prescripList = new ArrayList<>();
    ArrayList<String> descList = new ArrayList<>();
    ArrayList<String> expList = new ArrayList<>();
    ArrayList<String> qtyList = new ArrayList<>();


    //NO ARGS CONSTRUCTOR
    public Prescription() {
    }

    //CONSTRUCTOR
    public Prescription(String patientName, String presName, String description, String expDate,
        String quantity) {
        this.patientName = patientName;
        this.presName = presName;
        this.description = description;
        this.expDate = expDate;
        this.quantity = quantity;
    }


    //GETTERS
    public String getPatientName() {
        return patientName;
    }

    public String getPresName() {
        return presName;
    }

    public String getDescription() {
        return description;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getQuantity() {
        return quantity;
    }


    //SETTERS
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPresName(String presName) {
        this.presName = presName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }


    //LIST GETTERS
    public ArrayList<String> getPatientList() {
        return patientList;
    }

    public ArrayList<String> getPrescripList() {
        return prescripList;
    }

    public ArrayList<String> getDescList() {
        return descList;
    }

    public ArrayList<String> getExpList() {
        return expList;
    }

    public ArrayList<String> getQtyList() {
        return qtyList;
    }

    //LIST SETTERS
    public void setPatientList(ArrayList<String> patientList) {
        this.patientList = patientList;
    }

    public void setPrescripList(ArrayList<String> prescripList) {
        this.prescripList = prescripList;
    }

    public void setDescList(ArrayList<String> descList) {
        this.descList = descList;
    }

    public void setExpList(ArrayList<String> expList) {
        this.expList = expList;
    }

    public void setQtyList(ArrayList<String> qtyList) {
        this.qtyList = qtyList;
    }


    //random number generator
    private static Random random = new Random();


    //Adds patients to list and returns a random patient.
    public String randPatient(){
        patientList.add("Carolina");
        patientList.add("Justin");
        patientList.add("Amanda");
        patientList.add("Richard");
        patientList.add("James");

        int index = random.nextInt(5);
        return patientList.get(index);
    }

    //Add prescriptions to list and returns a random prescription.
    public String randPres(){
        prescripList.add("Atorvastatin (Lipitor)");
        prescripList.add("Levothyroxine (Synthroid)");
        prescripList.add("Lisinopril (Prinivil, Zestril)");
        prescripList.add("Gabapentin (Neurontin)");
        prescripList.add("Amlodipine (Norvasc)");

        int index = random.nextInt(5);
        return prescripList.get(index);
    }

    //Add description to list and return a random prescription.
    public String randDesc(){
        descList.add("1 a day.");
        descList.add("1 every 6 hours.");
        descList.add("2 a day.");
        descList.add("Take one if symptoms occur.");
        descList.add("1 after each meal.");

        int index = random.nextInt(5);
        return descList.get(index);
    }

    //Add expiration date to list and return random date.
    public String randExp(){
        expList.add("09/02/2019");
        expList.add("10/27/2011");
        expList.add("11/10/2020");
        expList.add("12/15/2021");
        expList.add("03/30/2022");

        int index = random.nextInt(5);
        return expList.get(index);
    }

    //Add quantities to list and return random quantity.
    public String randQty(){
        qtyList.add("30");
        qtyList.add("40");
        qtyList.add("60");
        qtyList.add("20");
        qtyList.add("50");

        int index = random.nextInt(5);
        return qtyList.get(index);
    }


    @Override
    public String toString() {
        return  "Prescription{\n"
            + "Patient Name: " + patientName
            + "\nPrescription Name: " + presName
            + "\nDescription: " + description
            + "\nExpires: " + expDate
            + "\nQuantity: " + quantity
            + "\n}";
    }
}
