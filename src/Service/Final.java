/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Util.InputString;

/**
 *
 * @author user
 */
public class Final {
    static InputString in = new InputString();
    
    public void headerService(){
        Header hd = new Header();
        hd.showHeader();
 
    }
    public void showLogin(){
        MenuLoginPeople kasir = new MenuLoginPeople();
        String username =in.in("Input Username ");
        String password= in.in("Input Password ");
        kasir.simpanUserLogin(username, password);
    }
    public static void main(String[] args) {
      
    }
    
}
