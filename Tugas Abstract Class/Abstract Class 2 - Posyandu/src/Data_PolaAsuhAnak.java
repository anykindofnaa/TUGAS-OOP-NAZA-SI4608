public class Data_PolaAsuhAnak extends Database_Posyandu{
    public String namaOrangtuaAnak;
    public String usiaOrangtuaAnak;
    public String caraPolaAsuhAnak;

    @Override
    void DataAnak() {
        System.out.println("\nData Pola Asuh Anak-anak yang terdaftar : ");
        System.out.println("Nama Orang Tua Anak: "+namaOrangtuaAnak);
        System.out.println("Usia Orang Tua Anak: "+usiaOrangtuaAnak);
        System.out.println("Cara Pola Asuh Anak: " +caraPolaAsuhAnak);
    }

    @Override
    void TampilInfoDataAnak() {
        System.out.println("\nInformasi Data Pola Asuh Anak : ");
        System.out.println("Bapak/Ibu "+namaOrangtuaAnak+" Mengasuh anaknya dengan cara "+caraPolaAsuhAnak);
    }
}
