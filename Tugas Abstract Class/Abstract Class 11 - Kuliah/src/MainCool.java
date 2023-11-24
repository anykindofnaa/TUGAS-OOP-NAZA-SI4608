public class MainCool {
    public static void main(String[] args) {
        JadwalMataKuliah jadwal = new JadwalMataKuliah();

        Tekkom mk1 = new Tekkom("Pemrograman Java", "Ruang 101", "Senin 08:00 - 10:00");
        Tekkom mk2 = new Tekkom("Struktur Data", "Ruang 102", "Rabu 10:00 - 12:00");

        Sisfo sisfo1 = new Sisfo("Basis Data", "Ruang 201", "Selasa 08:00 - 10:00");
        Sisfo sisfo2 = new Sisfo("Analisis Sistem", "Ruang 202", "Kamis 14:00 - 16:00");

        jadwal.tambahMataKuliah(mk1);
        jadwal.tambahMataKuliah(mk2);
        jadwal.tambahMataKuliah(sisfo1);
        jadwal.tambahMataKuliah(sisfo2);

        System.out.println("Jadwal Mata Kuliah:");
        System.out.println("-------------------------");
        jadwal.tampilkanJadwal();
    }
}
