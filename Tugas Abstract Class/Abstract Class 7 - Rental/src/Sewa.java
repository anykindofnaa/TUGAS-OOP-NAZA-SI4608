public abstract class Sewa {
    private String namaBarang;
    private double biayaSewa;

    // Constructor
    public Sewa(String namaBarang, double biayaSewa) {
        this.namaBarang = namaBarang;
        this.biayaSewa = biayaSewa;
    }

    public void sewa() {
        System.out.println("Menyewa barang: " + namaBarang);
        System.out.println("Biaya sewa: " + biayaSewa);
        prosesSewa();
    }

    public void kembalikan() {
        System.out.println("Mengembalikan barang: " + namaBarang);
        prosesPengembalian();
    }

    protected abstract void prosesSewa();

    protected abstract void prosesPengembalian();
}
