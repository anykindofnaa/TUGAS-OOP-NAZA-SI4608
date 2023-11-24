public class Tekkom extends MataKuliah {
    public Tekkom(String nama, String ruangan, String waktu) {
        super(nama, ruangan, waktu);
    }

    @Override
    void tampilkanInfo() {
        System.out.println("Mata Kuliah: " + nama);
        System.out.println("Ruangan: " + ruangan);
        System.out.println("Waktu: " + waktu);
        System.out.println("-------------------------");
    }
}
