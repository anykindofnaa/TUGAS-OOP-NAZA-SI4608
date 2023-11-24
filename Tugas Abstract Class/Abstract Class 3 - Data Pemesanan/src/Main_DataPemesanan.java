public class Main_DataPemesanan {
    public static void main(String[] args) {
        DataPesan_Regular regular = new DataPesan_Regular();
        regular.nomorPesananRegular = "001";
        regular.namaPesananRegular = "Pewangi Ruangan";
        regular.hargaPesananRegular = "Rp. 12.000";

        regular.pesanan();
        regular.waktupemesanan();

        DataPesan_Express express = new DataPesan_Express();
        express.nomorPesananExpress = "002";
        express.namaPesananExpress = "Sabun Mandi";
        express.hargaPesananExpress = "Rp. 3.000";

        express.pesanan();
        express.waktupemesanan();
    }
}
