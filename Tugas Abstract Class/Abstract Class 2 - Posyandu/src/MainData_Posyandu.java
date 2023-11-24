public class MainData_Posyandu {
    public static void main(String[] args) {
        Data_TumbuhKembangAnak data001 = new Data_TumbuhKembangAnak();
        data001.namaAnak = "Naza";
        data001.usiaAnak = "3 Tahun";
        data001.riwayatkesehatanAnak = "Baik";
        data001.DataAnak();
        data001.TampilInfoDataAnak();

        Data_PolaAsuhAnak data002 = new Data_PolaAsuhAnak();
        data002.namaOrangtuaAnak = "Rudi";
        data002.usiaOrangtuaAnak = "46 Tahun";
        data002.caraPolaAsuhAnak = "Baik";
        data002.DataAnak();
        data002.TampilInfoDataAnak();
    }
}
