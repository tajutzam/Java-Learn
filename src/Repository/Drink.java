/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

/**
 *
 * @author user
 */
public class Drink {
    
    private String menu[];

    public String[] getMenu() {
        return menu;
    }

    public void setMenu(String[] menu) {
        this.menu = menu;
    }
    public void setLengt(int indek){
        this.menu=new String[indek];
    }
    public String getContent(int indek){
        return menu[indek];
    }
    public void setConten(int i,String result){
        menu[i]=result;
    }
    
    
}
