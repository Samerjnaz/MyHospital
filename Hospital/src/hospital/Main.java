/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author faisa
 */
public class Main {
    public static void main(String[] args) {
        
        Patient patientAccount;
        Doctor doctorAccount;
        Administrator administratorAccount;
        
        
        boolean success=false;
        while(success==false){
            System.out.println("---- Create An Account ----");
       
        System.out.println("Enter username: ");
        Scanner usernamein = new Scanner(System.in);
        String username=usernamein.next();
        
        
        System.out.println("Enter password: ");
        Scanner passwordin = new Scanner(System.in);
        String password=passwordin.next();
       
        
        System.out.println("Enter ID: ");
        Scanner IDin = new Scanner(System.in);
        String ID=IDin.next();
        
        System.out.println("Enter email: ");
        Scanner emailin = new Scanner(System.in);
        String email=emailin.next();
        
        System.out.println("Enter name: ");
        Scanner namein = new Scanner(System.in);
        String name=namein.next();
        
       
         System.out.println("---- Choose Account Type ----");
        System.out.println("(Doctor, Patient, Administrator)");
        Scanner input = new Scanner(System.in);
        String accountType=input.next();
        
        String d=new String("doctor") ;
        String p=new String("patient") ;
        String a=new String("administrator") ;
        if(accountType.equalsIgnoreCase(p)){
                 //public Patient(String gender, int age, medicalHistory medicalState,
                //public medicalHistory(String sickness) {
        System.out.println("Enter gender: ");
        Scanner genderin = new Scanner(System.in);
        String gender=genderin.next();
        
        System.out.println("Enter age: ");
        Scanner agein = new Scanner(System.in);
        int age=agein.nextInt();
        
        System.out.println("Any sickness ? ");
        Scanner sickin = new Scanner(System.in);
        String sick=sickin.next();
        medicalHistory medicalState=new medicalHistory(sick);
        
        patientAccount=new Patient(gender,age,medicalState,name,ID,email,username,password);
        
        success= true;
    
                System.out.println("username :");
        Scanner in = new Scanner(System.in);
        String attemptusername=in.next();
        System.out.println("password :");
        String attemptpassword=in.next();
        
        if(patientAccount.login(attemptusername, attemptpassword)==true)
        System.out.println("Logged in");
        
        else System.out.println("Password or Username is incorrect");
        
        }
        
        else if(accountType.equalsIgnoreCase(d)){
            //  public Hospital(String name, String location) {
            System.out.println("Enter Hospital name:");
            Scanner hospitalnamein = new Scanner(System.in);
            String hospitalname=hospitalnamein.next();
            
            System.out.println("Enter Hospital location:");
            Scanner hospitallocationin = new Scanner(System.in);
            String hospitallocation=hospitallocationin.next();
            Hospital hospital= new Hospital(hospitalname,hospitallocation);
           
           System.out.println("Clinic: ");
            Scanner clinicin = new Scanner(System.in);
            String clinic=clinicin.next();
            
           doctorAccount=new Doctor(hospital,clinic,name,ID,email,username,password);
            
            success=true;
            
            
                    System.out.println("username :");
        Scanner in = new Scanner(System.in);
        String attemptusername=in.next();
        System.out.println("password :");
        String attemptpassword=in.next();
        
        if(doctorAccount.login(attemptusername, attemptpassword)==true)
        System.out.println("Logged in");
        
        else System.out.println("Password or Username is incorrect");
            
        }
        
        else if(accountType.equalsIgnoreCase(a)){
                    
            System.out.println("VerificationCode: ");
            Scanner verificationCodein = new Scanner(System.in);
            String verificationCode=verificationCodein.next();
            
            administratorAccount=new Administrator(verificationCode,name,ID,email,username,password);
             
             success=true;
             
                     System.out.println("---- Login ----");
        
        System.out.println("username :");
        Scanner in = new Scanner(System.in);
        String attemptusername=in.next();
        System.out.println("password :");
        String attemptpassword=in.next();
        
        if(administratorAccount.login(attemptusername, attemptpassword)==true)
        System.out.println("Logged in");
        
        else System.out.println("Password or Username is incorrect");
        }
        
        else System.out.println("Account type is not valid, try again");
        
        }
        
  
        
        
    }
    
    
}
