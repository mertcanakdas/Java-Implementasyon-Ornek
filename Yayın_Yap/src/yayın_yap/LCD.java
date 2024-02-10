/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yayın_yap;

/**
 *
 * @author user
 */
public class LCD implements Cihaz {

    public String marka;
    public int fiyat;
    public String cozunurluk;

    public LCD(String marka, int fiyat, String cozunurluk) {
        this.cozunurluk = cozunurluk;
        this.fiyat = fiyat;
        this.marka = marka;
        System.out.println("LCD cihaz oluşturuldu");
    }

    @Override
    public void ac() {
        System.out.println("LCD açılıyor...");
    }

    @Override
    public void kapat() {
        System.out.println("LCD kapanıyor...");
    }

    @Override
    public void goster() {
        System.out.println("--------------------------------");
        System.out.println("LCD markası : " + marka + "\nÇözünürlük : " + cozunurluk + "\nFiyatı : " + fiyat);
        System.out.println("--------------------------------");
    }
}
