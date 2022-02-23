/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.Store;

/**
 *
 * @author user
 */
public class Header {
   static Store store = new Store();
   
    
    public void showHeader(){
        store.setNameStore("Cafe Ceria");
        store.setAddress("Jl . Ahmad Yani 12");
        
        System.out.println("-----------------");
        System.out.println(store.getNameStore());
        System.out.println(store.getAddress());
        System.out.println("-----------------");
      
    }
    public void showCloser(){
         System.out.println("-----------------");
         System.out.println(store.getNameStore());
         System.out.println(store.getAddress());
    }
    
    
    
}
