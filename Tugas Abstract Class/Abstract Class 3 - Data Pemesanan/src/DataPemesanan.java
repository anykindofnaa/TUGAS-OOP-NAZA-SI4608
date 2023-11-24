public abstract class DataPemesanan {
    public String nomorPesanan = "1201";
    public String nomorKasir = "009";
    public String namaKasir = "Pratiwi";

    void pesanan(){
        System.out.println("\nPesanan barang dengan nama Kasir: "+namaKasir+" dengan nomor "+nomorKasir);
        System.out.println("Mempunyai 1 pesanan dengan nomor : "+nomorPesanan);
    }

     abstract void waktupemesanan();
}
