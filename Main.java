
import java.util.Scanner;

import com.model.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pegawai[] daftarPegawai = new Pegawai[2]; //ubah
        
        System.out.println("=== SISTEM PENGGAJIAN ===");
        // --- INPUT MANAJER ---
        System.out.print("Masukkan Nama Manajer: ");
        String namaMan = scanner.nextLine();
        System.out.print("Masukkan Gaji Pokok: ");
        double gapok = scanner.nextDouble();
        System.out.print("Masukkan Tunjangan: ");
        double tunj = scanner.nextDouble();
        
        daftarPegawai[0] = new Manajer(namaMan, gapok, tunj);
        
        
        // --- INPUT FREELANCER ---

        scanner.nextLine(); //menambahkan
        
        System.out.print("\nMasukkan Nama Freelancer: ");
        String namaFree = scanner.nextLine(); 

        System.out.print("Masukkan Jam Kerja: ");
        int jam = scanner.nextInt();

        System.out.print("Masukkan Tarif per Jam: ");
        double tarif = scanner.nextDouble();
        daftarPegawai[1] = new Freelancer(namaFree, jam, tarif); //menambahkan
             
        // --- OUTPUT ---
        System.out.println("\n=== REKAP DATA PEGAWAI ===");
        for (Pegawai p : daftarPegawai) {   //Tambahkan rekapan data yang di input
            p.tampilkanInfo();
            System.out.println("---");
        }
        System.out.println("--- Program Selesai ---");
        scanner.close();
    }
}
