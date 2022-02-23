/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class InputInt {
    Scanner sc = new Scanner(System.in);
    public int an(String info){
        System.out.print(info+" :");
        int result=sc.nextInt();
        return result;
    }
}
