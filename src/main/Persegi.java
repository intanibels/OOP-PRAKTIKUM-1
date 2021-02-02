package main;
import java.util.Scanner;
public class Persegi {
    //membuat method void hitung
    void hitung(){
        //membuat Scanner
        Scanner a = new Scanner(System.in);
        //deklarasi variabel
        double sisi, hitung;
        //membuat judul
        System.out.println("|         LUAS PERSEGI         |");
        System.out.println("===============================");
        //menerima inputan user
        System.out.print("Masukkan Sisi Persegi : ");
        sisi = a.nextDouble();
        //operasi hitung
        hitung = sisi*sisi;
        System.out.println("Hasil Luas Persegi    : "+hitung);
    }
}