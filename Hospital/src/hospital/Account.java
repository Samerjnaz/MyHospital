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
public class Account {
    private String name;
    private String ID;
    private String email;
    private String username;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account(String name, String ID, String email, String username, String password) {
        this.name = name;
        this.ID = ID;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    
    public void ViewProfile(){
        System.out.println("name: "+name+" ID: "+ID+" email: "+email+" username: "+username+" password: "+password);
    }
    
    public void resetPassword(String password){
        this.password=password;
    }
    
        public void editProfileName(String name) {
        this.name = name;
    }
        
        public boolean login(String username, String password){
            if((this.password.equals(password))&&(this.username.equals(username))){
                return true;
            }else{
                return false;
            }
        }
}
