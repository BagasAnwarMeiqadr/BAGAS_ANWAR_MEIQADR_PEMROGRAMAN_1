package pertemuandua;

public class latihan {
    public static void main(String[] args) {

        // Data diri
        String nim = "241011400223";
        String nama = "Bagas Anwar Meiqadr";
        int usia = 20;
        String jenisKelamin = "Laki-laki";
        String jurusan = "Informatika";
        String alamat = "Kota Tangerang";
        String Hobi = "Tidur";

        int tahunSekarang = 2026;
        int tahunLahir = tahunSekarang - usia;

        System.out.println("==============================");
        System.out.println("      DATA MAHASISWA");
        System.out.println("==============================");
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.println("Usia           : " + usia);
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Jurusan        : " + jurusan);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Tahun Lahir    : " + tahunLahir);
        System.out.println("Hobi           : " + Hobi);

    }
}