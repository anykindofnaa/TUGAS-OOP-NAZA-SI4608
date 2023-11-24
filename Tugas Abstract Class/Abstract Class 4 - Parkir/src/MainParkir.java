public class MainParkir {
    public static void main(String[] args) {
        DataMotor motor = new DataMotor();
        motor.jenisMotor = "Motor Bebek";
        motor.merekMotor = "Yamaha";
        motor.hargaParkirMotor = "2000";
        motor.jumlahParkirMotor = "110";
        motor.InformasiParkir();
        motor.jumlahparkir();

        DataMobil mobil = new DataMobil();
        mobil.jenisMobil = "Mobil Offroad";
        mobil.merekMobil = "Pajero";
        mobil.hargaParkirMobil = "3000";
        mobil.jumlahParkirMobil = "30";
        mobil.InformasiParkir();
        mobil.jumlahparkir();
    }
}
