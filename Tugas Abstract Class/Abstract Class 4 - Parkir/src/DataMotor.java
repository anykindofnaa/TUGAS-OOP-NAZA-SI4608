public class DataMotor extends DataParkir{
    public String jenisMotor;
    public String merekMotor;
    public String hargaParkirMotor;
    public String jumlahParkirMotor;

    @Override
    void InformasiParkir() {
        super.InformasiParkir();
        System.out.println("\nParkir Motor: ");
        System.out.println("Jenis Motor: "+jenisMotor);
        System.out.println("Merek Motor: "+merekMotor);
        System.out.println("Harga Parkir Motor: "+hargaParkirMotor);
        System.out.println("Jumlah Parkir Motor: "+jumlahParkirMotor);
    }

    @Override
    void jumlahparkir() {
        System.out.println("Jumlah parkir Motor di area "+tempatparkir+" adalah "+jumlahParkirMotor);
    }
}
