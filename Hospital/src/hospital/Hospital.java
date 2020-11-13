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
public class Hospital {

    
    public ArrayList<String> getSchedules() {
        return schedules;
    }

    /**
     * @param args the command line arguments
     */
    public void setSchedules(ArrayList<String> schedules) {    
        this.schedules = schedules;
    }

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    
 private String name;
 private String location;
 private ArrayList<String> schedules=new ArrayList<String>();

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
         
 
 public void showAllSchedules(){
     for (int i = 0; i < schedules.size(); i++) {
         System.out.println(schedules.get(i)+" ");
     }
 }
    
    
}
