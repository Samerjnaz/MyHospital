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
public class medicalHistory {
    
    private String sickness;
    private ArrayList<String> allergies= new ArrayList<String>();
    private ArrayList<String> prescreption= new ArrayList<String>();

    public medicalHistory(String sickness) {
        this.sickness = sickness;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public ArrayList<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(ArrayList<String> allergies) {
        this.allergies = allergies;
    }

    public ArrayList<String> getPrescreption() {
        return prescreption;
    }

    public void setPrescreption(ArrayList<String> prescreption) {
        this.prescreption = prescreption;
    }
    
    

}
