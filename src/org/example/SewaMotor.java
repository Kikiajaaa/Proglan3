package org.example;

/**
 * ini class sewa motor
 */
public class SewaMotor {
    private static SewaMotor sewaMotor;
    public String namaPenyewa;
    public String asal;
    public String tujuan;
    public double hargaSewa;
    public double diskon;

    /**
     * methode sewa motor
     * @param namaPenyewa untuk nama penyewa
     * @param asal untuk asal
     * @param tujuan untuk tujuan
     * @param hargaSewa untuk harga sewa
     * @param diskon untuk diskon
     */
    public SewaMotor(String namaPenyewa, String asal, String tujuan, double hargaSewa, double diskon) {
        this.namaPenyewa = namaPenyewa;
        this.asal = asal;
        this.tujuan = tujuan;
        this.hargaSewa = hargaSewa;
        this.diskon = diskon;  // Menggunakan parameter diskon
    }

    /**
     * methode hitung harga diskon
     *
     * @param sewaMotor untuk hitung harga sewa setelah diskon
     * @param diskon
     * @return
     */
    public static double hitungHargaSetelahDiskon(SewaMotor sewaMotor, double diskon) {
        return sewaMotor.hargaSewa - (sewaMotor.hargaSewa * diskon);  // Menghitung harga sewa setelah diskon
    }

    /**
     * methode hitung jumlah diskon````````````````````````````````````````
     * @param sewaMotor untuk hitung jumlah diskon
     * @param diskon
     * @return
     */
    public static double hitungJumlahDiskon(SewaMotor sewaMotor, double diskon) {
        return sewaMotor.hargaSewa * (diskon / 100);  // Menghitung jumlah diskon
    }

    /**
     * methode menampilkan informasi
     */
    public void tampilkanInformasi() {
        System.out.println("Nama Penyewa: " + namaPenyewa);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga Sewa Motor: Rp " + hargaSewa);
        System.out.println("Diskon: " + diskon + "%");
        System.out.printf("Biaya Sewa Setelah Diskon: Rp %.2f%n", hitungHargaSetelahDiskon(this, this.diskon / 100));
        System.out.printf("Jumlah Diskon: Rp %.2f%n", hitungJumlahDiskon(this, this.diskon));
    }
}

class MainApp {
}