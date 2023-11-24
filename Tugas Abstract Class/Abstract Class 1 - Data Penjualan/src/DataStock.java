public class DataStock extends DataPenjualan {
    public String nomorStockbarang;
    public String namaStockbarang;
    public String hargaStockbarang;
    
    @Override
    void caraPesan() {
        System.out.println("\nCara Pesan Stock Penjualan");
        System.out.println("Nomor Stock Barang : "+nomorStockbarang);
        System.out.println("Nama Stock Barang : "+namaStockbarang);
        System.out.println("Harga Stock Barang: "+hargaStockbarang);
    }
    
    @Override
    void caraBayar() {
        System.out.println("\nCara Bayar Stock Penjualan");
        System.out.println("Pembayaran dilakukan setelah tanda tangan perjanjian stock barang!");
    }
}