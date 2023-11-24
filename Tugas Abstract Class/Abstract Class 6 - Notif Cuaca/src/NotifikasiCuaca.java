public class NotifikasiCuaca extends CuacaNotifier {
    private int suhu;
    private int kelembapan;

    
    public NotifikasiCuaca(String lokasi, String kondisiCuaca, int suhu, int kelembapan) {
        super(lokasi, kondisiCuaca);
        this.suhu = suhu;
        this.kelembapan = kelembapan;
    }

    
    @Override
    protected void prosesNotifikasiCuaca() {
        
        System.out.println("Suhu: " + suhu + "°C");
        System.out.println("Kelembapan: " + kelembapan + "%");
        System.out.println("Notifikasi cuaca diterima.");
        System.out.println(); 
    }
}
