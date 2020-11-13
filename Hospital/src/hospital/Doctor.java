/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author faisa
 */
public class Doctor extends Account {
    private Hospital hospital;
    private String clinic;
    

    public Doctor(Hospital hospital, String clinic, String name, String ID, String email, String username, String password) {
        super(name, ID, email, username, password);
        this.hospital = hospital;
        this.clinic = clinic;
    }

    public Doctor(String name, String ID, String email, String username, String password) {
        super(name, ID, email, username, password);
    }

 

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }
    
    public void writeNotesForPatient(Patient patient, String note){
        patient.viewNotes().add(note);
    }
    
     public void writePrescreptionsForPatient(Patient patient, String precreption){
        patient.viewPrescriptions().add(precreption);
    }
}
