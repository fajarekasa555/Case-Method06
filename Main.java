import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataPenilaian dp = new DataPenilaian();

        dp.dataMhs[0] = new Mahasiswa("22001", "Ali Rahman", "Teknik Informatika");
        dp.dataMhs[1] = new Mahasiswa("22002", "Budi Santoso", "Teknik Informatika");
        dp.dataMhs[2] = new Mahasiswa("22003", "Citra Dewi", "Teknik Informatika");

        dp.dataMatkul[0] = new MataKuliah("MK001", "Algoritma", 3);
        dp.dataMatkul[1] = new MataKuliah("MK002", "Pemrograman", 3);
        dp.dataMatkul[2] = new MataKuliah("MK003", "Desain Web", 3);

        dp.dataPenilaian[0] = new Penilaian(dp.dataMhs[0], dp.dataMatkul[0], 80, 85, 90);
        dp.dataPenilaian[1] = new Penilaian(dp.dataMhs[0], dp.dataMatkul[1], 60, 75, 70);
        dp.dataPenilaian[2] = new Penilaian(dp.dataMhs[1], dp.dataMatkul[0], 75, 70, 80);
        dp.dataPenilaian[3] = new Penilaian(dp.dataMhs[2], dp.dataMatkul[1], 85, 90, 95);
        dp.dataPenilaian[4] = new Penilaian(dp.dataMhs[2], dp.dataMatkul[2], 80, 90, 65);

        int menu;
        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("--- DAFTAR MAHASISWA ---");
                    System.out.println("NIM\t| Nama\t\t| Prodi");
                    dp.tampilMhs();
                    System.out.println("------------------------");
                    break;
                case 2:
                    System.out.println("--- DAFTAR MATA KULIAH ---");
                    System.out.println("Kode\t| Nama Mata Kuliah\t| SKS");
                    dp.tampilMatkul();
                    System.out.println("--------------------------");
                    break;
                case 3:
                    System.out.println("--- DATA PENILAIAN ---");
                    dp.tampilPenilaian();
                    System.out.println("----------------------");
                    break;
                case 4:
                    System.out.println("Mengurutkan berdasarkan nilai akhir (DESC)...");
                    dp.SortingDSC();
                    dp.tampilPenilaian();
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String cariNim = sc.nextLine();
                    dp.PencarianData(cariNim);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    sc.close();
                    return;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}
