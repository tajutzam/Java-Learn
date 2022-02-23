/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author user
 */
import Repository.*;
import Util.InputInt;
import Util.InputString;
import java.util.Scanner;
public class MenuDrink {
    static InputInt in = new InputInt();
    static InputString an = new InputString();
    static Drink drink = new Drink();
    static Scanner sc = new Scanner(System.in);
    static int indek;
    static String result;
    
    public void setLength(){
         indek= in.an("how many menus do you want to sell? ");
         drink.setLengt(indek);
    }
    
    
     public void menuContent(){
         drink.getMenu();
         setLength();
       
        for(int i=0; i<drink.getMenu().length; i++){
             result= an.in("input drink menu ");
             
           
            drink.setConten(i, result);
            System.out.println("Suces add : "+drink.getContent(i)); 
                    

         }
        System.out.println("-----------------");
    }
     public void showMenuInlist(){
         
         for(int i =0; i<drink.getMenu().length;i++){
             System.out.println((i+1)+ "."+drink.getContent(i));
         }
     }
     public String getMenuContent(int indek){
         return drink.getContent(indek);
     }
     public static void main(String[] args) {
        MenuDrink mn = new MenuDrink();
        mn.menuContent();
        mn.showMenuInlist();
    }
}
