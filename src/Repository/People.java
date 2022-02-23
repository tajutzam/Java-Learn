/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

/**
 *
 * @author user
 */
public class People {
    private String dataLogin[][]=new String[1][2];
    
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
    
    public String getDataLogin(int baris , int kolom){
        return dataLogin[baris][kolom];
    }
    
    
   
    
    public void setDataLoginusername(int baris,int kolom,String username){
        this.dataLogin[baris][kolom]=username;
      
        
    }
    public void setDataLoginPassword(int baris , int kolom , String password){
          this.dataLogin[baris][kolom]=password;
    }
    
    
    
    
}
