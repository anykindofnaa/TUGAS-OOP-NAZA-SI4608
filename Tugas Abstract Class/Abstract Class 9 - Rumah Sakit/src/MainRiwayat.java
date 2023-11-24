public class MainRiwayat {
    public static void main(String[] args) {
        Pasien pasien1 = new PasienUmum("Budi", 30, "Demam");
        Pasien pasien2 = new PasienUmum("Siti", 25, "Flu");

        tampilkanInfoPasien(pasien1);
        tampilkanInfoPasien(pasien2);

        tambahRiwayat(pasien1, "Batuk");
        tambahRiwayat(pasien2, "Pusing");

        tampilkanInfoPasien(pasien1);
        tampilkanInfoPasien(pasien2);

        cekDiagnosa(pasien1, "Demam");
        cekDiagnosa(pasien2, "Pusing");
    }

    public static void tampilkanInfoPasien(Pasien pasien) {
        pasien.tampilkanInfoPasien();
    }

    public static void tambahRiwayat(Pasien pasien, String riwayat) {
        pasien.tambahRiwayat(riwayat);
    }

    public static void cekDiagnosa(Pasien pasien, String diagnosa) {
        boolean hasil = pasien.cekDiagnosa(diagnosa);
        String status = hasil ? "pernah" : "tidak pernah";
        System.out.println("Pasien " + pasien.nama + " " + status + " didiagnosa dengan " + diagnosa);
        System.out.println();
    }
}
