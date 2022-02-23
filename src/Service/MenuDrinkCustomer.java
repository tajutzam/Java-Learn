/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.Customer;
import Repository.Drink;
import Util.InputInt;
import Util.InputString;
import View.KasirApp;

/**
 *
 * @author user
 */
public class MenuDrinkCustomer {
    static InputString in = new InputString();
    static InputInt an = new InputInt();
    Customer customer = new Customer();

    
    
    
    public void inputMenuCustomer(MenuDrink drink){
        int indek=an.an("Input Your menu ");
        String name =in.in("Input Name Customer ");
        customer.setName(name);
        System.out.println("-----------------");
        System.out.println("Hi ..."+customer.getName());
        System.out.println("Your menu is :"+drink.getMenuContent(indek-1));
        System.out.println("your order to your table ");
        System.out.println("Thank You for your order");
        Header hd = new Header();
        hd.showCloser();
    }
    
}
