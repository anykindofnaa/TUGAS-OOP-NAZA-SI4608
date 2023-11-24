public abstract class MataKuliah {
    String nama;
    String ruangan;
    String waktu;

    public MataKuliah(String nama, String ruangan, String waktu) {
        this.nama = nama;
        this.ruangan = ruangan;
        this.waktu = waktu;
    }

    abstract void tampilkanInfo();
}
