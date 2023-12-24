/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author ozlem
 */
public class Facial_makeup_product extends Makeup implements javacosmetic.Applying {

    public Facial_makeup_product(String brand, double price, String name,String ID) {
        super(brand, price, name,ID);
    }

    @Override
    public void apply() {
        this.setApply("This product is applied by rubbing on the face.");
    }
    
    
}
