/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author ozlem
 */
public class Shampoo_hair_product extends Hair implements javacosmetic.Applying{
    
    public Shampoo_hair_product(String brand, double price, String name,String ID) {
        super(brand, price, name,ID);
    }

    
    
    @Override
    public void apply() {
        this.setApply("This product is rubbed into the hair to clean the hair.");
    }

    
    
}
