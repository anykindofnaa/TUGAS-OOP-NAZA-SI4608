import java.util.ArrayList;

public class JadwalMataKuliah {
    ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();

    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    public void tampilkanJadwal() {
        for (MataKuliah mataKuliah : daftarMataKuliah) {
            mataKuliah.tampilkanInfo();
        }
    }
}
