public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String kelas;
    private String alamat;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String kelas, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.kelas = kelas;
        this.alamat = alamat;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getKelas() {
        return kelas;
    }

    public String getAlamat() {
        return alamat;
    }
}