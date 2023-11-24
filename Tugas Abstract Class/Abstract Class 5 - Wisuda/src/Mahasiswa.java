public class Mahasiswa extends AcaraWisuda{
    public String namaMahasiswa;
    public String gelarMahasiswa;
    public String ipkakhirMahasiswa;
    
    
    @Override
    void SelamatWisuda() {
        super.SelamatWisuda();
    }
    
    @Override
    void InfoWisuda() {
        System.out.println("\nSelamat kepada Mahasiswa/Mahasiswi : ");
        System.out.println("Nama : "+namaMahasiswa);
        System.out.println("Gelar : "+gelarMahasiswa);
        System.out.println("IPK : "+ipkakhirMahasiswa);
        System.out.println("Selamat "+namaMahasiswa+" dengan hasil yang baik dan berguna nanti di masa depan!");
    }
}
