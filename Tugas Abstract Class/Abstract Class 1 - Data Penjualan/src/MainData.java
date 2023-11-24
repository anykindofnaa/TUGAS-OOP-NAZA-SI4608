public class MainData {
    public static void main(String[] args) {
        DataStock data01 = new DataStock();
        data01.nomorStockbarang = "1001";
        data01.namaStockbarang = "Beras 3 kg"; 
        data01.hargaStockbarang = "Rp. 36.000";
        data01.caraPesan();
        data01.caraBayar();

        DataKirim data02 = new DataKirim();
        data02.nomorKirimBarang = "076";
        data02.namaKirimBarang = "Gula 4 kg";
        data02.hargaKirimBarang = "Rp. 47.000";
        data02.caraPesan();
        data02.caraBayar();
    }
}
