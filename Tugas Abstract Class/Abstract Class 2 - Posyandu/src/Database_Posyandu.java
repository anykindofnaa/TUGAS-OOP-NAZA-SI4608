public abstract class Database_Posyandu {
    public String nomorPosyandu = "12345"; 
    public String namaPosyandu = "Bani Salam";
    public String alamatPosyandu = "Bojongsoang";

    void DataAnak(){
        System.out.println("Data Anak di Posyandu" +namaPosyandu+" yang beralamat di "+alamatPosyandu+" dengan nomor Posyandu "+nomorPosyandu);
    }

    abstract void TampilInfoDataAnak();
}