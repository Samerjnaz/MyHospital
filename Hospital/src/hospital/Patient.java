/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author faisa
 */
public class Patient extends Account{
    
    private String gender;
    private int age;
    private medicalHistory medicalState;
    private ArrayList<appointment> appointments=new ArrayList<appointment>(); 
    private ArrayList<String> notes=new ArrayList<String>(); 
    private ArrayList<String> prescriptions=new ArrayList<String>(); 

    public Patient(String gender, int age, medicalHistory medicalState, String name, String ID, String email, String username, String password) {
        super(name, ID, email, username, password);
        this.gender = gender;
        this.age = age;
        this.medicalState = medicalState;
    }

    public void setNotes(ArrayList<String> notes) {
        this.notes = notes;
    }

    public void setPrescriptions(ArrayList<String> prescriptions) {
        this.prescriptions = prescriptions;
    }



    public ArrayList<String> viewNotes() {
        return notes;
    }

    public ArrayList<String> viewPrescriptions() {
        return prescriptions;
    }

    public ArrayList<appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<appointment> appointments) {
        this.appointments = appointments;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public medicalHistory getMedicalState() {
        return medicalState;
    }

    public void setMedicalState(medicalHistory medicalState) {
        this.medicalState = medicalState;
    }
    public void bookAppointment(appointment appointment){
        if(appointment.isAvailability()==false){
            this.appointments.add(appointment);}
        else System.out.println("appointment is not available");
    }
    
        public void cancelAppointment(appointment appointment){
            
            for (int i = 0; i < appointments.size(); i++) {
                if(appointments.get(i).equals(appointment)){
                  appointments.get(i).setAvailability(true);
                }
            }
       
    
        }
}
