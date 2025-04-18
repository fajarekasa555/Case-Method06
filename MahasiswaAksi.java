public class MahasiswaAksi {
    int idx;
    MahasiswaData mhs1 = new MahasiswaData("22001", "Ali Rahman", "Teknik informatika");
    MahasiswaData mhs2 = new MahasiswaData("22002", "Budi Santoso", "Teknik informatika");
    MahasiswaData mhs3 = new MahasiswaData("22003", "Citra Dewi", "Teknik informatika");
    
    void tampil(){    
        System.out.println("--- DAFTAR MAHASISWA ---");
        System.out.println("NIM\t| Nama\t\t| Prodi");
        mhs1.tampilInfo();
        mhs2.tampilInfo();
        mhs3.tampilInfo();
        System.out.println("------------------------");
    }
}