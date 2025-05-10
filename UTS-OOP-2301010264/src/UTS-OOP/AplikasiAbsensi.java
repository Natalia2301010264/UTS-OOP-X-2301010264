package UTS;

/**
 *
 * @author Dominica Natalia Metan
 * NIM: 2301010264
 * Tgl 7/05/2025
 */
import java.util.Scanner;

public class AplikasiAbsensi {
    private static Absensi[] AbsensiArray = new Absensi[10];
    private static int arrayIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Aplikasi Absesni");
            System.out.println("==============================");
            
            System.out.println("Menu:");
            System.out.println("1. Input Data Absensi");
            System.out.println("2. Menampilkan Data Absensi");
            System.out.println("3. Mengubah Data Absensi");
            System.out.println("4. Menghapus Data Absensi");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputDataAbsensi(scanner);
                    break;
                case 2:
                    menampilkanData();
                    break;
                case 3:
                    mengubahData(scanner);
                    break;
                case 4:
                    menghapusData(scanner);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        }
    }

    private static void inputDataAbsensi(Scanner scanner) {
        System.out.print("Masukkan kode Absensi: ");
        String kode = scanner.next();
        System.out.print("Masukkan nama Absensi: ");
        String nama = scanner.next();

        Absensi Absensi = new Absensi(kode, nama);
        AbsensiArray[arrayIndex] = Absensi;
        arrayIndex++;

        System.out.println("Data berhasil disimpan");
    }

    private static void menampilkanData() {
        for (int i = 0; i < arrayIndex; i++) {
            Absensi matakuliah = AbsensiArray[i];
            System.out.println("Kode Absensi: " + Absensi.getKode() + ", Nama Absensi: " + Absensi.getNama());
        }
    }

    private static void mengubahData(Scanner scanner) {
        System.out.print("Masukkan kode Absensi yang ingin diubah: ");
        String kode = scanner.next();

        for (int i = 0; i < arrayIndex; i++) {
            Absensi Absensi = AbsensiArray[i];
            if (Absensi.getKode().equals(kode)) {
                System.out.print("Masukkan nama Absensi baru: ");
                String nama = scanner.next();
                Absensi.setNama(nama);
                System.out.println("Data Absensi berhasil diubah");
                return;
            }
        }

        System.out.println("Data tidak ditemukan");
    }

    private static void menghapusData(Scanner scanner) {
        System.out.print("Masukkan kode Absensi yang ingin dihapus: ");
        String kode = scanner.next();

        for (int i = 0; i < arrayIndex; i++) {
            Absensi Absensi = AbsensiArray[i];
            if (Absensi.getKode().equals(kode)) {
                for (int j = i; j < arrayIndex - 1; j++) {
                   AbsensiArray[j] = AbsensiArray[j + 1];
                }
                arrayIndex--;
                System.out.println("Data Absensi berhasil dihapus");
                return;
            }
        }

        System.out.println("Data tidak ditemukan");
    }
}