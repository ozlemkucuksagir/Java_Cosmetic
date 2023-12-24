/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacosmetic;

import Product.Makeup;
import Product.Hair;
import Product.Product;
import Product.SkinCare;
import java.util.ArrayList;


/**
 *
 * @author ozlem
 */
public class SystemClass {
       public static ArrayList<Product> products= new ArrayList<Product>();
       
        //public static ArrayList<Product> productinFavorite= new ArrayList<Product>();
        //public static ArrayList<Product> productinOrder= new ArrayList<Product>();
   
    public static void Add(Product p,ArrayList<Product> arr){
        arr.add(p);
        Product.AddNumberProduct();
    }
    public static String getAllProduct(ArrayList<Product> arr){
        String str=new String();
        for (Product p: arr){
            str+=p+"\n";           
        }
        return str;
    }
    public static String getMakeupProductin(ArrayList<Product> arr){
        String str=new String();
        for (Product p: arr){
            if(p instanceof Makeup)
            str+=p+"\n";           
        }
        return str;
    }
    
    public static String getHairProductin(ArrayList<Product> arr){
        String str=new String();
        for (Product p: arr){
            if(p instanceof Hair)
            str+=p+"\n";           
        }
        return str;
    }
    
    public static String getSkincareProductin(ArrayList<Product> arr){
        String str=new String();
        for (Product p: arr){
            if(p instanceof SkinCare)
            str+=p+"\n";           
        }
        return str;
    }
    
    public static Product searchProductin(String id,ArrayList<Product> arr){
        Product result = null; 
        for(Product p : arr){
            if(p.getID().equals(id) ){
                 result=p;
            } 
        }
        
        return result;
   }
   /* public static Product searchProductinORDER(String id){
        Product result = null; 
        for(Product p : productinOrder){
            if(p.getID().equals(id) ){
                 result=p;
            } 
        }
        
        return result;
   }
    */
    
    
    public static String display(ArrayList<Product> arrlist){
        String s="";
        for(Product p: arrlist){
            s+=p.toString();
            s+="\n";
        }
        return s;
    }
    
    
    public static boolean delete(String ID,ArrayList<Product> arr){
        
            if(searchProductin(ID,arr)!=null){
                for (int i =0; i<arr.size(); i++){
                    if(arr.get(i).getID().equals(ID)){
                        arr.remove(i);
                        Product.MinusNumberProduct();
                        //String str=products.get(i).getName() +" "+ products.get(i).getBrand()+"is removed.";
                        return true;
                    }
                }
           }
        return false;
    }
    
    /*public static <E extends Product> void AddOrder(Product p,E[] e){
        e.getClass().
        Product.ShowNumberProduct();
    }*/
        /*
    public static void AddFav(Product p){
        productinFavorite.add(p);
        Product.ShowNumberProduct();
    }
    public static void AddOrder(Product p){
        productinOrder.add(p);
        Product.ShowNumberProduct();
    }
    public static String getAllProductFav(){
        String str=new String();
        for (Product p: productinFavorite){
            str+=p+"\n";           
        }
        return str;
    }
    public static String getAllProductOrder(){
        String str=new String();
        for (Product p: productinOrder){
            str+=p+"\n";           
        }
        return str;
    }
    
    
    public static String getMakeupProductinORDER(){
        String str=new String();
        for (Product p: productinOrder){
            if(p instanceof Makeup)
            str+=p+"\n";           
        }
        return str;
    }
    
    public static String getHairProductinORDER(){
        String str=new String();
        for (Product p: productinOrder){
            if(p instanceof Hair)
            str+=p+"\n";           
        }
        return str;
    }
    
    public static String getSkincareProductinORDER(){
        String str=new String();
        for (Product p: productinOrder){
            if(p instanceof SkinCare)
            str+=p+"\n";           
        }
        return str;
    }
    
    public static Product searchProductinFAV(String id){
        Product result = null; 
        for(Product p : productinFavorite){
            if(p.getID().equals(id) ){
                 result=p;
            } 
        }
        
        return result;
   }
    public static Product searchProductinORDER(String id){
        Product result = null; 
        for(Product p : productinOrder){
            if(p.getID().equals(id) ){
                 result=p;
            } 
        }
        
        return result;
   }
    
    
    
    public static String display(ArrayList<Product> arrlist){
        String s="";
        for(Product p: arrlist){
            s+=p.toString();
        }
        return s;
    }
    
    
    public boolean deleteFAV(String name){
        
            if(search(name)){
                for (int i =0; i<products.size(); i++){
                    if(products.get(i).getName().equals(name)){
                        products.remove(i);
                        String str=products.get(i).getName() +"   "+ products.get(i).getBrand()+"is removed.";
                        return true;
                    }
                }   
           }
        return false;
    }
     public boolean deleteORDER(String name){
        
            if(search(name)){
                for (int i =0; i<products.size(); i++){
                    if(products.get(i).getName().equals(name)){
                        products.remove(i);
                        String str=products.get(i).getName() +"   "+ products.get(i).getBrand()+"is removed.";
                        return true;
                    }
                }   
           }
        return false;
    }
     *//*
    public static void AddToFav(Product p){
        productinFavorite.add(p);
        Product.ShowNumberProduct();
    }
    
    public static void AddToOrder(Product p){
        productinOrder.add(p);
        Product.ShowNumberProduct();
    }
    */
   /* public boolean search(String name){
        for (int i =0; i<products.size(); i++){
            if(products.get(i).getName().equals(name)){
                return true;  
            }
        }
      return false;
    }
    */
}
