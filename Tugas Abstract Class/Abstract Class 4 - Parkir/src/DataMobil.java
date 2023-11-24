public class DataMobil extends DataParkir{
    public String jenisMobil;
    public String merekMobil;
    public String hargaParkirMobil;
    public String jumlahParkirMobil;

    @Override
    void InformasiParkir() {
        super.InformasiParkir();
        System.out.println("\nParkir Mobil: ");
        System.out.println("Jenis Mobil: "+jenisMobil);
        System.out.println("Merek Mobil: "+merekMobil);
        System.out.println("Harga Parkir Mobil: "+hargaParkirMobil);
        System.out.println("Jumlah Parkir Mobil: "+jumlahParkirMobil);
    }

    @Override
    void jumlahparkir() {
        System.out.println("Jumlah parkir Mobil di area "+tempatparkir+" adalah "+jumlahParkirMobil);
    }
}
