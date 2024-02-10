/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yayın_yap;

/**
 *
 * @author user
 */
public class Yayın_Yap {

   
    public static void main(String[] args) {
       TV tv = new TV("samsung",  17800, "3840x2160");
       LCD lcd = new LCD("LG", 22456, "1980x1080");
       Projector projector = new Projector("IQ", 9865, "4096x2160");
       tv.goster();
       lcd.goster();
       projector.goster();
    }
    
}
