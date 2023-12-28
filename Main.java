import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManajemenAnggota manajemenAnggota = new ManajemenAnggota();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah anggota");
            System.out.println("2. Hapus anggota");
            System.out.println("3. Edit anggota");
            System.out.println("4. Tampilkan anggota");
            System.out.println("Pilih opsi:");

            int opsi = scanner.nextInt();
            scanner.nextLine();

            switch (opsi) {
                case 1:
                    System.out.println("Masukkan nama:");
                    String nama = scanner.nextLine();
                    System.out.println("Masukkan kode anggota:");
                    String kodeAnggota = scanner.nextLine();
                    System.out.println("Masukkan level keahlian:");
                    String levelKeahlian = scanner.nextLine();
                    manajemenAnggota.tambahAnggota(new Anggota(nama, kodeAnggota, levelKeahlian));
                    break;
                case 2:
                    System.out.println("Masukkan kode anggota yang ingin dihapus:");
                    String kodeAnggotaHapus = scanner.nextLine();
                    manajemenAnggota.hapusAnggota(kodeAnggotaHapus);
                    break;
                case 3:
                    System.out.println("Masukkan kode anggota yang ingin diedit:");
                    String kodeAnggotaEdit = scanner.nextLine();
                    System.out.println("Masukkan nama baru:");
                    String namaBaru = scanner.nextLine();
                    System.out.println("Masukkan level keahlian baru:");
                    String levelKeahlianBaru = scanner.nextLine();
                    manajemenAnggota.editAnggota(kodeAnggotaEdit, namaBaru, levelKeahlianBaru);
                    break;
                case 4:
                    manajemenAnggota.tampilkanAnggota();
                    break;
                default:
                    System.out.println("Opsi tidak valid");
            }
        }
    }
}
