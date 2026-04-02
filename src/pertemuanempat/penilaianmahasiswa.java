package pertemuanempat;

import java.util.Scanner;

public class penilaianmahasiswa {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)){

        int hadir;
        double tugas, uts, uas, total;
        String grade;

        System.out.println("===== DATA MAHASISWA =====");
        System.out.println("Nama : Bagas Anwar");
        System.out.println("NIM  : 241011400223");

        System.out.print("\nJumlah Kehadiran (max 21): ");
        hadir = input.nextInt();

        System.out.print("Nilai Tugas : ");
        tugas = input.nextDouble();

        System.out.print("Nilai UTS   : ");
        uts = input.nextDouble();

        System.out.print("Nilai UAS   : ");
        uas = input.nextDouble();

        // Konversi kehadiran ke persen
        double nilaiKehadiran = (hadir / 21.0) * 100;

        // Hitung total nilai
        total = (nilaiKehadiran * 0.1) +
                (tugas * 0.2) +
                (uts * 0.3) +
                (uas * 0.4);

        // 🔥 Aturan kehadiran khusus
        if (hadir < 17) {
            if (hadir >= 14) {
                grade = "D";
            } else {
                grade = "E";
            }
        } else {
            // Penilaian normal
            if (total >= 85) {
                grade = "A";
            } else if (total >= 70) {
                grade = "B";
            } else if (total >= 60) {
                grade = "C";
            } else if (total >= 50) {
                grade = "D";
            } else {
                grade = "E";
            }
        }

        System.out.println("\n===== HASIL =====");
        System.out.println("Total Nilai : " + total);
        System.out.println("Grade       : " + grade);

        input.close();
    }
    }
}