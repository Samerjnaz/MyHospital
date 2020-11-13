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
public class Administrator extends Account {

 private String verificationCode;

    public Administrator(String verificationCode, String name, String ID, String email, String username, String password) {
        super(name, ID, email, username, password);
        this.verificationCode = verificationCode;
    }
 
    
}
