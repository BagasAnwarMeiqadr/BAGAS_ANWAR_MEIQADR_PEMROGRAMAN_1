package pertemuandua;

import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)){

            System.out.println("Nama : Bagas Anwar MeiQadr");
            System.out.println("NIM  : 241011400223");
            System.out.println("===========================");

            String namaMhs, nimMhs, prodiMhs;
            String jenisKelamin, kelas;

            System.out.print("Masukkan Nama         : ");
            namaMhs = sc.nextLine();

            System.out.print("Masukkan NIM          : ");
            nimMhs = sc.nextLine();

            System.out.print("Masukkan Program Studi: ");
            prodiMhs = sc.nextLine();

            System.out.println("\nPilih Jenis Kelamin:");
            System.out.println("1. Laki-laki");
            System.out.println("2. Perempuan");
            System.out.print("Pilih (1/2): ");
            int pilihJK = sc.nextInt();

            if (pilihJK == 1) {
                jenisKelamin = "Laki-laki";
            } else if (pilihJK == 2) {
                jenisKelamin = "Perempuan";
            } else {
                jenisKelamin = "Tidak diketahui";
            }

            System.out.println("\nPilih Kelas:");
            System.out.println("1. Reguler A");
            System.out.println("2. Reguler B");
            System.out.println("3. Karyawan CK");
            System.out.println("4. Karyawan CS");
            System.out.print("Pilih (1-4): ");
            int pilihKelas = sc.nextInt();

            switch (pilihKelas) {
                case 1:
                    kelas = "Reguler A";
                    break;
                case 2:
                    kelas = "Reguler B";
                    break;
                case 3:
                    kelas = "Karyawan CK";
                    break;
                case 4:
                    kelas = "Karyawan CS";
                    break;
                default:
                    kelas = "Tidak diketahui";
            }

            System.out.println("\n=== HASIL DATA ===");
            System.out.println("Nama           : " + namaMhs);
            System.out.println("NIM            : " + nimMhs);
            System.out.println("Program Studi  : " + prodiMhs);
            System.out.println("Jenis Kelamin  : " + jenisKelamin);
            System.out.println("Kelas          : " + kelas);

            sc.close();
        }
    }
}
