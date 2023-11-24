public class OrangTua extends Mahasiswa{
    public String namaOrangtua;
    public String usiaOrangtua;
    public String pesanOrangtua;
    
    public OrangTua(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    @Override
    void InfoWisuda() {
        System.out.println("\nSelamat juga dengan bangga untuk : ");
        System.out.println("Nama : "+namaOrangtua);
        System.out.println("Usia : "+usiaOrangtua);
        System.out.println("Selaku orang tua dari "+namaMahasiswa);
        System.out.println("Juga mempunyai pesan yaitu: "+pesanOrangtua);
    }
    
}
