public class Data_Resto extends Daftar_Resto {
    public String namaResto;
    public int predikat;
    public String sertif;

    @Override
    void Tampilkan() {
        System.out.println("Rekomendasi restoran di " + daerahSebar + " dengan rating " + labelResto++);
        System.out.println("\nData Restoran di Bandung Raya menurut Blog Ngeunaheun : ");
        System.out.println("Nama Resto: " + namaResto);
        System.out.println("Rating Nilai: " + predikat);
        System.out.println("Restoran " + namaResto + " dengan nilai " + predikat + "sudah tersertifikasi " + sertif);
    }
}
