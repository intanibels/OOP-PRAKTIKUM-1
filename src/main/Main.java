package main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //membuat Scanner
        Scanner b = new Scanner(System.in);
        //membuat judul
        System.out.println("| MENGHITUNG LUAS BANGUN DATAR |");
        System.out.println("===============================");
        //deklarasi variabel
        boolean a = true;
        String jawab;
        //membuat perulangan
        while(a){
            //menerima inputan [ilihan user
            System.out.print("Pilihan Anda (lingkaran/persegi) : ");
            jawab = b.nextLine();
            //membuat percabangan
            if(jawab.equalsIgnoreCase("lingkaran")){ //jika menjawab lingkaran akan dilanjutkan ke method hitung pada class lingkaran
                Lingkaran c = new Lingkaran();
                c.hitung();
                a=false;
            }else if(jawab.equalsIgnoreCase("persegi")){ //jika menjawab persegi akan dilanjutkan ke method hitung pada class persegi
                Persegi d = new Persegi();
                d.hitung();
                a=false;
            }else{ //jika selain itu akan terus mengulang pertanyaan
                a=true;
            }
        }
    }
}