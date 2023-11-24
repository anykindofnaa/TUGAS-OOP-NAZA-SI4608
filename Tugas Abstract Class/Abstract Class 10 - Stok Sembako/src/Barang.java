public abstract class Barang {
    protected String nama;
    protected int stok;
    protected double harga;

    public Barang(String nama, int stok, double harga) {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public abstract void tampilkanInfoBarang();

    public abstract void tambahStok(int jumlah);

    public abstract boolean cekStokMinimum(int stokMinimum);
}
