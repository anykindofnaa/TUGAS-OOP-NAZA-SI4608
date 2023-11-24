public class Main {
    public static void main(String[] args) {
        Mahasiswa wisuda001 = new Mahasiswa();
        wisuda001.namaMahasiswa = "Naza Sapinath";
        wisuda001.gelarMahasiswa = "S.Kom";
        wisuda001.ipkakhirMahasiswa = "3.71";
        wisuda001.SelamatWisuda();
        wisuda001.InfoWisuda();

        OrangTua ortu001 = new OrangTua("Naza Sapinath");
        ortu001.namaOrangtua = "Supardi";
        ortu001.usiaOrangtua = "56 Tahun";
        ortu001.pesanOrangtua = "Tetap Semangat Meraih Mimpi!";
        ortu001.InfoWisuda();
    }
}
