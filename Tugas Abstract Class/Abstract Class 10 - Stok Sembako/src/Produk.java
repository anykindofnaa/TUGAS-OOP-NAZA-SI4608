public class Produk extends Barang {
    public Produk(String nama, int stok, double harga) {
        super(nama, stok, harga);
    }

    @Override
    public void tampilkanInfoBarang() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: Rp" + harga);
        System.out.println();
    }

    @Override
    public void tambahStok(int jumlah) {
        stok += jumlah;
        System.out.println("Stok barang " + nama + " ditambahkan sebanyak " + jumlah);
        tampilkanInfoBarang();
    }

    @Override
    public boolean cekStokMinimum(int stokMinimum) {
        return stok < stokMinimum;
    }
}
