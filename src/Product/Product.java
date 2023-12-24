/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author ozlem
 */
public abstract class Product {
    private String brand;
    double price;
    private String name;
    private String ID;
    
    public static int numberOf_product=0;

    
    public static void AddNumberProduct(){
        numberOf_product++;
    }
    public static void MinusNumberProduct(){
        numberOf_product--;
    }
    public static int ShowNumberProduct(){
        return numberOf_product;
    }
    
    public Product(String brand, double price, String name,String ID) {
        this.brand = brand;
        this.price = price;
        this.name = name;
        this.ID=ID;
        
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public abstract void discountRateonOrder();
    
    @Override
    public String toString() {
        return  "ID: "+ ID +"\nBrand: " + brand + "\nName: " + name  + "\nPrice: " + price+ " TL"  +"\n" ;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the apply
     */
    /*public String getApply() {
        return apply;
    }

    /**
     * @param apply the apply to set
     */
    /*public void setApply(String apply) {
        this.apply = apply;
    }
   */
    
    
    
}
