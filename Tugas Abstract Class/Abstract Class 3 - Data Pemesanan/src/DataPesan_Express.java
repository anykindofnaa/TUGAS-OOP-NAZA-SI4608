public class DataPesan_Express extends DataPemesanan{
    public String nomorPesananExpress;
    public String namaPesananExpress;
    public String hargaPesananExpress;

    @Override
    void pesanan() {
        super.pesanan();
        System.out.println("\nPesanan Barang Express: ");
        System.out.println("Nomor Pesanan : "+nomorPesananExpress);
        System.out.println("Nama Pesanan : "+namaPesananExpress);
        System.out.println("Harga Pesanan : "+hargaPesananExpress);
    }

    @Override
    void waktupemesanan() {
        System.out.println("Pesanan "+namaPesananExpress+" akan sampai dalam waktu 2 jam!");
    }
}
