public class MahasiswaData {
    String nim, nama, prodi;

    MahasiswaData(String nim, String nama, String prodi){
        this.nim =nim;
        this.nama =nama;
        this.prodi =prodi;
    }
    void tampilInfo(){
        System.out.println("NIM   :"+this.nim);
        System.out.println("Nama  :"+this.nama);
        System.out.println("Prodi :"+this.prodi);
    }    
}
