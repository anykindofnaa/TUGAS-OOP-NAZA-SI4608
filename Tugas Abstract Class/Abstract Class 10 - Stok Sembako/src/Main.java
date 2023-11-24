public class Main {
    public static void main(String[] args) {
        Barang produk1 = new Produk("Sabun", 20, 5000);
        Barang produk2 = new Produk("Shampoo", 15, 10000);
        Barang produk3 = new Produk("Pasta Gigi", 25, 7000);

        tampilkanInfoStok(produk1);
        tampilkanInfoStok(produk2);
        tampilkanInfoStok(produk3);

        tambahStok(produk1, 5);
        tambahStok(produk2, 10);

        tampilkanInfoStok(produk1);
        tampilkanInfoStok(produk2);
        tampilkanInfoStok(produk3);
    }

    public static void tampilkanInfoStok(Barang barang) {
        barang.tampilkanInfoBarang();
    }

    public static void tambahStok(Barang barang, int jumlah) {
        barang.tambahStok(jumlah);
    }
}
