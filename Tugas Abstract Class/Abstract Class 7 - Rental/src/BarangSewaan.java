public class BarangSewaan extends Sewa {

    public BarangSewaan(String namaBarang, double biayaSewa) {
        super(namaBarang, biayaSewa);
    }

    @Override
    protected void prosesSewa() {
        System.out.println("Barang disewa dengan sukses.");
    }

    @Override
    protected void prosesPengembalian() {
        System.out.println("Barang dikembalikan dengan sukses.");
    }
}
