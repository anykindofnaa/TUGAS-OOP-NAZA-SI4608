public abstract class AcaraWisuda {
    public String temaWisuda;
    public String waktuWisuda;
    public String tempatWisuda;

    void SelamatWisuda(){
        tempatWisuda = "Telkom University";
        waktuWisuda = "24 - 25 November 2023";
        temaWisuda = "Generasi Unggul";
        System.out.println("\nSelamat Wisuda Mahasiswa dan Mahasiswi"+tempatWisuda+" dengan tema "+temaWisuda);
    }

    abstract void InfoWisuda();
}
