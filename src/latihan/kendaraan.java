package latihan;

// ==============================
// JAWABAN NOMOR 1 (Kelas & Atribut)
// ==============================
class Kendaraan {
    String nomorPlat;
    String merk;
    boolean status; // true jika disewa, false jika tersedia
    String tanggalPenyewaan;

    public Kendaraan(String nomorPlat, String merk) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.status = false;
    }

    // ==============================
    // JAWABAN NOMOR 2 (Metode/Fungsi)
    // ==============================
    public void sewaKendaraan(String tgl) {
        status = true;
        tanggalPenyewaan = tgl;
    }

    public void kembalikanKendaraan() {
        status = false;
        tanggalPenyewaan = null;
    }

    public void tampilkanInfoKendaraan() {
        System.out.println("Plat: " + nomorPlat);
        System.out.println("Merk: " + merk);
        if (status) {
            System.out.println("Status: Disewa (" + tanggalPenyewaan + ")");
        } else {
            System.out.println("Status: Tersedia");
        }
        System.out.println("-----------------");
    }
}

// ==============================
// JAWABAN NOMOR 3 (Kelas Main)
// ==============================
class Main {
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

