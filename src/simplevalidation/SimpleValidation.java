/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplevalidation;

/**
 *
 * @author user
 */
public class SimpleValidation {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void login(String username , String password){
        
        if(username.equalsIgnoreCase(getUsername())&&password.equalsIgnoreCase(getPassword())){
            System.out.println("Welcome !!!");
        }else{
            System.out.println("wrong password or username re-login");
        }
    }
    public static void main(String[] args) {
        SimpleValidation log = new SimpleValidation();//create new object on SimpleValidation
        log.setUsername("secreet");//set username
        log.setPassword("secreet");//set password
        log.login(log.getUsername(), log.getPassword());//validation
        
        
    }
}
