public class DataPesan_Regular extends DataPemesanan{
    public String nomorPesananRegular;
    public String namaPesananRegular;
    public String hargaPesananRegular;

    @Override
    void pesanan() {
        super.pesanan();
        System.out.println("\nPesanan Barang Regular: ");
        System.out.println("Nomor Pesanan : "+nomorPesananRegular);
        System.out.println("Nama Pesanan : "+namaPesananRegular);
        System.out.println("Harga Pesanan : "+hargaPesananRegular);
    }

    @Override
    void waktupemesanan() {
        System.out.println("Pesanan "+namaPesananRegular+" akan sampai pada 1-3 hari kedepan!");
    }
}
