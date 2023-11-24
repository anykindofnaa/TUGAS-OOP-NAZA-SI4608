public abstract class CuacaNotifier {
    private String lokasi;
    private String kondisiCuaca;

    
    public CuacaNotifier(String lokasi, String kondisiCuaca) {
        this.lokasi = lokasi;
        this.kondisiCuaca = kondisiCuaca;
    }

    
    public void notifikasiCuaca() {
        System.out.println("Notifikasi cuaca di " + lokasi + ": " + kondisiCuaca);
        prosesNotifikasiCuaca();
    }

    
    protected abstract void prosesNotifikasiCuaca();
}
