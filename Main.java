import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

            if(menu == 1){
                continue;
            }else if(menu == 2){
                continue;
            }else if(menu == 3){
                continue;
            }else if(menu == 4){
                continue;
            }else if(menu == 5){
                continue;
            }else if(menu == 0){
                break;
            }else{
                continue;
            }
        }


        
        sc.close();
    }
}
