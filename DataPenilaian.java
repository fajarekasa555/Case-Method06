public class DataPenilaian {
    Mahasiswa[] dataMhs = new Mahasiswa[3];
    MataKuliah[] dataMatkul = new MataKuliah[3];
    Penilaian[] dataPenilaian = new Penilaian[5];

    void tampilMhs() {
        for (Mahasiswa m : dataMhs) {
            m.tampilMahasiswa();
        }
    }

    void tampilMatkul() {
        for (MataKuliah m : dataMatkul) {
            m.tampilMataKuliah();
        }
    }

    void tampilPenilaian() {
        for (Penilaian p : dataPenilaian) {
            p.hitungNilaiAkhir();
            p.tampilData();
        }
    }

    void SortingDSC() {
        for (int i = 0; i < dataPenilaian.length - 1; i++) {
            if (dataPenilaian[i] == null) continue;
            int idxMax = i;
            for (int j = i + 1; j < dataPenilaian.length; j++) {
                if (dataPenilaian[j] != null && dataPenilaian[j].nilaiAkhir > dataPenilaian[idxMax].nilaiAkhir) {
                    idxMax = j;
                }
            }
            Penilaian tmp = dataPenilaian[idxMax];
            dataPenilaian[idxMax] = dataPenilaian[i];
            dataPenilaian[i] = tmp;
        }
    }

    void PencarianData(String nim) {
        boolean ketemu = false;
        for (Mahasiswa m : dataMhs) {
            if (m != null && m.nim.equalsIgnoreCase(nim)) {
                m.tampilMahasiswa();
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Peringatan: Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
}
