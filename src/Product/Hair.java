/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author ozlem
 */
public class Hair extends Product  {
    public String apply=" ";
    public Hair(String brand, double price, String name,String ID) {
        super(brand, price, name,ID);
    }

   public void discountRateonOrder() {//%20
        this.setPrice(this.getPrice()*80/100);
    }

    /**
     * @return the apply
     */
    public String getApply() {
        return apply;
    }

    /**
     * @param apply the apply to set
     */
    public void setApply(String apply) {
        this.apply = apply;
    }

   
   

   
    
    
    
}
