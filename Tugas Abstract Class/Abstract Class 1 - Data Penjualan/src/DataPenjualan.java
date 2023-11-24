public abstract class DataPenjualan {
    public String nomorbarang;
    public String namapenjual;
    public String namapembeli;
    public String hargabarang;
    public String potonganhargabarang;

    void caraPesan(){
        System.out.println("Pesan Penjualan");
    }

    abstract void caraBayar();
}
