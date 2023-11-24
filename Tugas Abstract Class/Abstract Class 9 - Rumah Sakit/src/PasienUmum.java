public class PasienUmum extends Pasien {
    public PasienUmum(String nama, int umur, String riwayatPenyakit) {
        super(nama, umur, riwayatPenyakit);
    }

    @Override
    public void tampilkanInfoPasien() {
        System.out.println("Nama Pasien: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Riwayat Penyakit: " + riwayatPenyakit);
        System.out.println();
    }

    @Override
    public void tambahRiwayat(String riwayat) {
        riwayatPenyakit += ", " + riwayat;
        System.out.println("Riwayat penyakit pasien " + nama + " ditambahkan: " + riwayat);
        tampilkanInfoPasien();
    }

    @Override
    public boolean cekDiagnosa(String diagnosa) {
        return riwayatPenyakit.contains(diagnosa);
    }
}
