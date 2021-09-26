package com.company.Transactions;

/*
* Insert Desc
*/
public class Prescription {

    private String patientName; //might remove
    private String presName;
    private String description;
    private String expDate;
    private String quantity;


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
