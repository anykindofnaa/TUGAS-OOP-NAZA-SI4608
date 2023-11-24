import java.util.Scanner;

public class KampusApp {
    public static void main(String[] args) {
        KampusApp kampusApp = new KampusApp();
        kampusApp.showMenu();
    }

    private Scanner scanner;
    private Database database;

    public KampusApp() {
        scanner = new Scanner(System.in);
        database = new Database();
    }

    public void showMenu() {
        System.out.println("_________________________________");
        System.out.println("Selamat Datang di Aplikasi Kampus");
        System.out.println("Pilihan Menu:");
        System.out.println("1 -> Tambah Data Mahasiswa");
        System.out.println("2 -> Ubah Data Mahasiswa");
        System.out.println("3 -> Hapus Data Mahasiswa");
        System.out.println("4 -> Cari Data Mahasiswa");
        System.out.println("0 -> Keluar Aplikasi");
        System.out.print("Silahkan masukan menu yang dipilih: ");
        int menuYangDipilih = scanner.nextInt();
        scanner.nextLine();
        switch(menuYangDipilih) {
            case 1:
            menuTambah();
            case 2:
            menuUbah();
            case 3:
            menuHapus();
            case 4:
            menuCari();
            case 0: {
                System.out.print("* Terimakasih sudah menggunakan Aplikasi Kampus*");
                System.exit(0);
            }
        }
        scanner.close();
    }

    public void menuTambah() {
        System.out.println("----- Menu Tambah Mahasiswa ----");
        System.out.print("Masukan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        String jenisKelamin = "";
        while (true) {
            System.out.print("Masukkan Jenis Kelamin (laki-laki/perempuan): ");
            jenisKelamin = scanner.nextLine().toLowerCase();
            if (jenisKelamin.equals("laki-laki") || jenisKelamin.equals("perempuan")) {
                break;
            } else {
                System.out.println("Jenis kelamin tidak valid. Harap masukkan 'laki-laki' atau 'perempuan'.");
            }
        }
        
        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();
        
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, jenisKelamin, kelas, alamat);
        database.create(mahasiswa);
        System.out.println("* Data berhasil ditambahkan *");
        System.out.println(" Tekan Enter untuk melanjutkan... ");
        scanner.nextLine();
        showMenu();
    }    

    public void menuUbah() {
        System.out.println("------ Menu Ubah Data Mahasiswa ------");
        System.out.print("Masukan NIM Sebelumnya: ");
        String nimLama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nimBaru = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin: ");
        String jenisKelamin = scanner.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();
        
        Mahasiswa mahasiswa = new Mahasiswa(nimBaru, nama, jenisKelamin, kelas, alamat);
        database.update(mahasiswa, nimLama);
        
        // Tampilkan data mahasiswa yang telah diubah
        System.out.println("* Data berhasil diubah *");
        System.out.println("Data Mahasiswa yang Diubah:");
        System.out.println("* NIM: " + mahasiswa.getNim() + " *");
        System.out.println("* Nama: " + mahasiswa.getNama() + " *");
        System.out.println("* Jenis Kelamin: " + mahasiswa.getJenisKelamin() + " *");
        System.out.println("* Kelas: " + mahasiswa.getKelas() + " *");
        System.out.println("* Alamat: " + mahasiswa.getAlamat() + " *");
        
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }        

    public void menuCari() {
        System.out.println("---- Menu Cari Data Mahasiswa ------");
        System.out.print("Masukan Nim: ");
        String nim = scanner.nextLine();
        Mahasiswa mahasiswa = database.read(nim);
        if (mahasiswa == null) {
            System.out.println("* Nim tidak ditemukan *");
        } else {
            System.out.println("* NIM: " + mahasiswa.getNim() + " *");
            System.out.println("* Nama: " + mahasiswa.getNama() + " *");
            System.out.println("* Jenis Kelamin: " + mahasiswa.getJenisKelamin() + " *");
            System.out.println("* Kelas: " + mahasiswa.getKelas() + " *");
            System.out.println("* Alamat: " + mahasiswa.getAlamat() + " *");
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }    

    public void menuHapus() {
        System.out.println("---- Menu Cari Dara Mahasiswa -----");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        database.delete(nim);
        System.out.println("Tekan Enter untuk menlanjutkan...");
        scanner.nextLine();
        showMenu();
    }
}