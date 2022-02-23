/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.People;
import Util.InputString;

/**
 *
 * @author user
 */
public class MenuLoginPeople {
    People kasir = new People();
    MenuDrink drink = new MenuDrink();
    static InputString in = new InputString();
    static MenuDrinkCustomer menu = new MenuDrinkCustomer();
    public void simpanUserLogin(String username, String password){
        
        if(kasir.getDataLogin(0, 0)==null&&kasir.getDataLogin(0, 1)==null){
            kasir.setDataLoginusername(0, 0, username);
            kasir.setDataLoginPassword(0, 1, password);
            System.out.println("Succes Create Account");
            Header hd = new Header();
            hd.showHeader();
            login();
        }else{
            System.out.println("You Have Alredy Account");
        }
    
    }
    public void login(){
        String username=in.in("Input Username ");
        String password = in.in("Input Password ");
    
        if(username.equals(kasir.getDataLogin(0, 0))&&password.equals(kasir.getDataLogin(0, 1))){
            System.out.println("Suces Login");
            System.out.println("-----------------");

            drink.menuContent();
            drink.showMenuInlist();
            menu.inputMenuCustomer(drink);
        }else if(username.equals(kasir.getDataLogin(0, 0))&&!password.equals(kasir.getDataLogin(0, 1))){
            System.out.println("Password Wrong !! Please Relogin");
            login();
        }else{
            System.out.println("Username and Password Wrong relogin");
            login();
        }
        
        
    }
    public static void main(String[] args) {
        
        
        
    }
    
}
