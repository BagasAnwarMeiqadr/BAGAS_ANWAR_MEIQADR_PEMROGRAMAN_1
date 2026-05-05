package latihan;

// ==============================
// JAWABAN NOMOR 3 (Kelas Main)
// ==============================
public class Main {
    public static void main(String[] args) {
        // Bikin 2 objek kendaraan
        Kendaraan mobil1 = new Kendaraan("B 1111 AA", "Avanza");
        Kendaraan mobil2 = new Kendaraan("D 2222 BB", "Brio");

        // Nampilin detail kendaraan pertama
        System.out.println("Info Awal Mobil 1:");
        mobil1.tampilkanInfoKendaraan();

        // Mengubah status kendaraan pertama jadi disewa
        System.out.println("Setelah Mobil 1 disewa:");
        mobil1.sewaKendaraan("10-05-2026");
        mobil1.tampilkanInfoKendaraan();

        // Mengubah status kendaraan kedua jadi disewa
        System.out.println("Setelah Mobil 2 disewa:");
        mobil2.sewaKendaraan("12-05-2026");
        mobil2.tampilkanInfoKendaraan();

        // Mengembalikan kendaraan pertama
        System.out.println("Setelah Mobil 1 dikembalikan:");
        mobil1.kembalikanKendaraan();
        mobil1.tampilkanInfoKendaraan();
    }
}
