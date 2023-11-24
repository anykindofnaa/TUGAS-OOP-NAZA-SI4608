public class DataKirim extends DataPenjualan {
    public String nomorKirimBarang;
    public String namaKirimBarang;
    public String hargaKirimBarang;

    @Override
    void caraPesan() {
        System.out.println("\nCara Pesan Kirim Barang");
        System.out.println("Nomor Kirim Barang : "+ nomorKirimBarang);
        System.out.println("Nama Kirim Barang : "+ namaKirimBarang);
        System.out.println("Harga Kirim Barang: "+ hargaKirimBarang);
    }
    
    @Override
    void caraBayar() {
        System.out.println("\nCara Bayar Kirim Barang");
        System.out.println("Pembayaran dilakukan setelah barang diterima melalui transfer");
    }
}
