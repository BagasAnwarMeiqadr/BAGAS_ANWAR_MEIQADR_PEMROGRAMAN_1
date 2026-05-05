package pertemuandelapan;

import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sks = 0;
        int totalpertemuan = 0;
        int kehadiran = 0;
        boolean sksvalid = false;

        System.out.println("===== SISTEM PRESENSI MAHASISWA =====");
        while (!sksvalid){
            System.out.print("Masukanan SKS (2 atau 3): ");
            sks = input.nextInt();

            if (sks == 2 || sks == 3) {
                sksvalid = true;
            } else {
                System.out.println("SKS tidak valid. Pilih 2 atau 3.\n");
            }
        }
        if (sks == 3){
            totalpertemuan = 21;
        } else if (sks == 2) {
            totalpertemuan = 14;
        }
        System.out.println("Total Pertemuan Wajib: " + totalpertemuan);

        boolean kehadiranselesai = false;
        
        while (!kehadiranselesai){
            System.out.print("\nMasukan jumlah kehadiran (0 - " + totalpertemuan + "): ");
            kehadiran = input.nextInt();
            
            if (kehadiran >= 0 && kehadiran <= totalpertemuan){
                double persentase = ((double) kehadiran / totalpertemuan) * 100;
                if(persentase >= 75.0){
                    System.out.print("Kehadiran memenuhi syarat.");
                    System.out.printf("Persentase kehadiran Anda: %.2f%%\n",persentase);
                    kehadiranselesai = true;
                } else {
                    System.out.printf("kehadiran kurang dari 75%% (%.2f%%). Silakan input ulang.\n", persentase);
                }
            } else {
                System.out.println("Input tidak valid. coba lagi.");
            }
        }
        System.out.println("\n===== PROGRAM SELESAI =====");
        input.close();
    }    
}
