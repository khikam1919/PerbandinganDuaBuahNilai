/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176014.latihan24.perbandinganduabuahnilai;

/**
 *
 * @author User
 * NAMA     : Muhammad Nur Khikam
 * KELAS    : Sistem Informasi
 * NIM      : 23176014
 * Deskripsi Program : Program ini membandingkan dua nilai yang dimasukkan oleh pengguna 
 * dan menampilkan apakah nilai pertama lebih besar, lebih kecil, 
 * atau sama dengan nilai kedua.
 */
import java.util.Scanner;

public class SI23176014Latihan24PerbandinganDuaBuahNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulangi;

        do {
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = scanner.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println(nilaiPertama + " lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println(nilaiPertama + " lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println(nilaiPertama + " sama dengan " + nilaiKedua);
            }

            // Tanya pengguna apakah ingin mengulang
            System.out.print("Apakah Anda ingin membandingkan lagi? (ya/tidak): ");
            String jawab = scanner.next();
            ulangi = jawab.equalsIgnoreCase("ya");

        } while (ulangi);

        scanner.close();
    }
}
