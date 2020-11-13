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
public class Surgeon extends Doctor{
    private int successfulSurgeries;
    private int failedSurgeries;

    public Surgeon(Hospital hospital, String clinic, String name, String ID, String email, String username, String password) {
        super(hospital, clinic, name, ID, email, username, password);
    }

    public Surgeon(int successfulSurgeries, int failedSurgeries, Hospital hospital, String clinic, String name, String ID, String email, String username, String password) {
        super(hospital, clinic, name, ID, email, username, password);
        this.successfulSurgeries = successfulSurgeries;
        this.failedSurgeries = failedSurgeries;
    }

    public Surgeon(int successfulSurgeries, int failedSurgeries, String name, String ID, String email, String username, String password) {
        super(name, ID, email, username, password);
        this.successfulSurgeries = successfulSurgeries;
        this.failedSurgeries = failedSurgeries;
    }

    public int getSuccessfulSurgeries() {
        return successfulSurgeries;
    }

    public void setSuccessfulSurgeries(int successfulSurgeries) {
        this.successfulSurgeries = successfulSurgeries;
    }

    public int getFailedSurgeries() {
        return failedSurgeries;
    }

    public void setFailedSurgeries(int failedSurgeries) {
        this.failedSurgeries = failedSurgeries;
    }
    
}
