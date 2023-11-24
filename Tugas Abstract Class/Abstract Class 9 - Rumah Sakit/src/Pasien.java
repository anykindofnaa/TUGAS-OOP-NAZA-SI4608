public abstract class Pasien {
    protected String nama;
    protected int umur;
    protected String riwayatPenyakit;

    public Pasien(String nama, int umur, String riwayatPenyakit) {
        this.nama = nama;
        this.umur = umur;
        this.riwayatPenyakit = riwayatPenyakit;
    }

    public abstract void tampilkanInfoPasien();

    public abstract void tambahRiwayat(String riwayat);

    public abstract boolean cekDiagnosa(String diagnosa);
}
