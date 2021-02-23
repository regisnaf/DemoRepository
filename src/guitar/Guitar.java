/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitar;

/**
 *
 * @author Regis Andrade
 * Jan 21, 2021
 * Exercise from book Head First Object
 */
public class Guitar {

    private String serialNumber, builder, model, type, backWood, topWood;
    private double price;
    private String teste;
    private int pricetwo;
    
    public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice(float newPrice) {
        this.price = newPrice;
    }
    
    public String getBuilder() {
        return builder;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getType() {
        return type;
    }
    
    public String getBackWood() {
        return backWood;
    }
    
    public String getTopWood() {
        return topWood;
    }
}
