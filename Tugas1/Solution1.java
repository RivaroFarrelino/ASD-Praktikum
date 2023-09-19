package Tugas1;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        double pilih = input.nextInt();

        if(pilih == 1){
            double sisiAtas = input.nextDouble();
            double sisiBawah = input.nextDouble();
            double tinggi = input.nextDouble();
            Trapesium trapesium1 = new Trapesium(sisiAtas, sisiBawah, tinggi);
            trapesium1.hitungLuas();
        } else if(pilih == 2){
            double diagonal1 = input.nextDouble();
            double diagonal2 = input.nextDouble();
            LayangLayang layangLayang1 = new LayangLayang(diagonal1, diagonal2);
            layangLayang1.hitungLuas();
        } else if(pilih == 3){
            double jariJari = input.nextDouble();
            Lingkaran lingkaran1 = new Lingkaran(jariJari);
            lingkaran1.hitungLuas();
        } else{
            System.out.println("Input yang Anda masukkan tidak sesuai");
        }

        input.close();
    }
}
interface BangunDatar{
    void hitungLuas();
}

class Trapesium implements BangunDatar{
    double sisiAtas, sisiBawah, tinggi;

    Trapesium(double sisiAtas, double sisiBawah, double tinggi){
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
    }

    public void hitungLuas(){
        double luas = 0.5 * (sisiAtas + sisiBawah) * tinggi;
        System.out.printf("%.2f", luas);
    }
}

class LayangLayang implements BangunDatar{
    double diagonal1, diagonal2;

    LayangLayang(double diagonal1, double diagonal2){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public void hitungLuas(){
        double luas = diagonal1 * diagonal2 * 0.5;
        System.out.printf("%.2f", luas);
    }
}

class Lingkaran implements BangunDatar{
    double jariJari, phi;

    Lingkaran(double jariJari){
        this.jariJari = jariJari;
        if(this.jariJari % 7 == 0){
            this.phi = 22.0/7.0;
        } else {
            this.phi = 3.14;
        }
    }

    public void hitungLuas(){
        double luas = phi * jariJari * jariJari;
        System.out.printf("%.2f", luas);
    }
}
