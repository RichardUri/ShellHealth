package com.company.Transactions;

public class Prescription {

    private String patientName; //might remove
    private String presName;
    private String description;
    private String expDate;
    private String quantity;

    public Prescription() {
    }

    public Prescription(String patientName, String presName, String description, String expDate,
        String quantity) {
        this.patientName = patientName;
        this.presName = presName;
        this.description = description;
        this.expDate = expDate;
        this.quantity = quantity;
    }

    //getters
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

    //setters
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
//        return "Prescription{" +
//            "Patient Name='" + patientName + '\'' +
//            ", presName='" + presName + '\'' +
//            ", description='" + description + '\'' +
//            ", expDate=" + expDate +
//            ", quantity=" + quantity +
//            '}';

        return  "Prescription{\n"
            + "Patient Name: " + patientName
            + "\nPrescription Name: " + presName
            + "\nDescription: " + description
            + "\nExpires: " + expDate
            + "\nQuantity: " + quantity
            + "\n}";
    }
}
