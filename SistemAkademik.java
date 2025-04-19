import java.util.Scanner;

public class SistemAkademik {

    static class MataKuliah {
        String kode;
        String nama;
        int sks;

        MataKuliah(String kode, String nama, int sks) {
            this.kode = kode;
            this.nama = nama;
            this.sks = sks;
        }

        void tampilkan() {
            System.out.println("Kode MK: " + kode + " | Nama: " + nama + " | SKS: " + sks);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MataKuliah[] mataKuliah = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 3)
        };

        int pilihan;
        do {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 2:
                    System.out.println("\nDaftar Mata Kuliah:");
                    for (MataKuliah mk : mataKuliah) {
                        mk.tampilkan();
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem akademik.");
                    break;
                default:
                    System.out.println("Menu belum tersedia atau tidak valid.\n");
            }

        } while (pilihan != 0);

        scanner.close();
    }
}
