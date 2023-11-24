public class Main{
    public static void main(String[] args) {

        Sewa barang1 = new BarangSewaan("Kamera", 50.0);
        Sewa barang2 = new BarangSewaan("Laptop", 100.0);

        barang1.sewa();
        barang2.kembalikan();
    }
}
