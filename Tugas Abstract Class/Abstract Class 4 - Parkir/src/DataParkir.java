public abstract class DataParkir {
    public String tempatparkir;
    public String nomorparkir;
    public String penjagaparkir;

    void InformasiParkir(){
        tempatparkir = "Braga, Bandung";
        nomorparkir = "D-123";
        penjagaparkir = "Joko";
        
        System.out.println("\nInformasi Parkir");
        System.out.println("Tempat Parkir : "+tempatparkir);
        System.out.println("Nomor Area Parkir: "+nomorparkir);
        System.out.println("Nama Penjaga Parkir: "+penjagaparkir);
    }

    abstract void jumlahparkir();
}
