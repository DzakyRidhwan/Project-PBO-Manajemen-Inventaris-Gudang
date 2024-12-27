/**
 * Kelas untuk transaksi keluar yang mewarisi dari kelas Transaksi.
 * Konsep OOP:
 * - Inheritance: Kelas ini mewarisi dari kelas Transaksi.
 * - Overriding: Metode prosesTransaksi() di-override untuk implementasi spesifik.
 */
public class TransaksiKeluar extends Transaksi {
    private String kodeBarang;
    private int jumlah;

    public TransaksiKeluar(String idTransaksi, String tanggal, String kodeBarang, int jumlah) {
        super(idTransaksi, tanggal);
        this.kodeBarang = kodeBarang;
        this.jumlah = jumlah;
    }

    @Override
    public void prosesTransaksi() {
        System.out.println("Barang keluar: " + kodeBarang + ", Jumlah: " + jumlah);
    }
}