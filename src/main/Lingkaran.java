package main;
import java.util.Scanner;
public class Lingkaran {
    //membuat method void hitung
    void hitung(){
        //membuat Scanner
        Scanner a = new Scanner(System.in);
        //deklarasi variabel
        double jarijari, hitung;
        //membuat judul
        System.out.println("|        LUAS LINGKARAN        |");
        System.out.println("===============================");
        //menerima inputan user
        System.out.print("Masukkan Jari Jari Lingkaran : ");
        jarijari = a.nextDouble();
        //operasi hitung
        hitung = Math.PI * jarijari *jarijari;
        System.out.println("Hasil Luas Lingkaran         : "+hitung);
    }
}