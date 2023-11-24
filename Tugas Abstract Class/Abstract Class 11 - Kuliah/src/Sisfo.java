public class Sisfo extends MataKuliah {
    public Sisfo(String nama, String ruangan, String waktu) {
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
