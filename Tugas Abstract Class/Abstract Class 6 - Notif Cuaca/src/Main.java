public class Main {
    public static void main(String[] args) {
        
        CuacaNotifier notifikasi1 = new NotifikasiCuaca("Jakarta", "Cerah", 28, 80);
        CuacaNotifier notifikasi2 = new NotifikasiCuaca("Bandung", "Hujan", 22, 90);
        CuacaNotifier notifikasi3 = new NotifikasiCuaca("Surabaya", "Berawan", 30, 75);
        
        notifikasi1.notifikasiCuaca();
        notifikasi2.notifikasiCuaca();
        notifikasi3.notifikasiCuaca();
    }
}
