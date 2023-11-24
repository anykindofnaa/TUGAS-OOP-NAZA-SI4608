public class Data_TumbuhKembangAnak extends Database_Posyandu {
    public String namaAnak;
    public String usiaAnak;
    public String riwayatkesehatanAnak;

    @Override
    void DataAnak() {
        super.DataAnak();
        System.out.println("\nData Tumbuh Kembang Anak-anak yang terdaftar : ");
        System.out.println("Nama Anak: " + namaAnak);
        System.out.println("Usia Anak: " + usiaAnak);
        System.out.println("Riwayat Kesehatan Anak: " + riwayatkesehatanAnak);
    }

    @Override
    void TampilInfoDataAnak() {
        System.out.println("\nInformasi Data Tumbuh Kembang Anak : ");
        System.out.println("Anak " +namaAnak+ " Tumbuh dengan "+riwayatkesehatanAnak+" diusianya");
    }

    
    
}
