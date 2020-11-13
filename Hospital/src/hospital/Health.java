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
public class Health {
    
    private boolean sick;
    private boolean needsurgery;
    private int temprature;
    private int height;
    private double weight;

    public Health(boolean sick, boolean needsurgery, int temprature, int height, double weight) {
        this.sick = sick;
        this.needsurgery = needsurgery;
        this.temprature = temprature;
        this.height = height;
        this.weight = weight;
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    public boolean isNeedsurgery() {
        return needsurgery;
    }

    public void setNeedsurgery(boolean needsurgery) {
        this.needsurgery = needsurgery;
    }

    public int getTemprature() {
        return temprature;
    }

    public void setTemprature(int temprature) {
        this.temprature = temprature;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
}
