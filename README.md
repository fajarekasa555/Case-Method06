
==============================
PENJELASAN KODE JAVA AKADEMIK
=============================

1. CLASS: Mahasiswa

---

Atribut:

- String nim: Nomor induk mahasiswa.
- String nama: Nama mahasiswa.
- String prodi: Program studi mahasiswa.

Constructor:

- Mahasiswa(String nim, String nama, String prodi): Inisialisasi data mahasiswa.

Method:

- void tampilMahasiswa(): Menampilkan data mahasiswa ke layar.

Relasi:

- Digunakan dalam class Penilaian dan DataPenilaian.

---

2. CLASS: MataKuliah

---

Atribut:

- String kode: Kode mata kuliah.
- String nama: Nama mata kuliah.
- int sks: Jumlah SKS mata kuliah.

Constructor:

- MataKuliah(String kode, String nama, int sks): Inisialisasi data matkul.

Method:

- void tampilMataKuliah(): Menampilkan data matkul ke layar.

Relasi:

- Digunakan dalam class Penilaian dan DataPenilaian.

---

3. CLASS: Penilaian

---

Atribut:

- Mahasiswa mahasiswa: Objek mahasiswa yang dinilai.
- MataKuliah matkul: Objek matkul yang diikuti.
- double tugas: Nilai tugas.
- double uts: Nilai UTS.
- double uas: Nilai UAS.
- double nilaiAkhir: Rata-rata dari tugas, uts, dan uas.

Constructor:

- Penilaian(Mahasiswa, MataKuliah, tugas, uts, uas): Inisialisasi dan hitung nilai akhir.

Method:

- void tampilData(): Menampilkan semua data penilaian.

Relasi:

- Menggabungkan data dari Mahasiswa dan MataKuliah.

---

4. CLASS: DataPenilaian

---

Atribut:

- Mahasiswa[] dataMhs: Array objek Mahasiswa.
- MataKuliah[] dataMatkul: Array objek MataKuliah.
- Penilaian[] dataPenilaian: Array objek Penilaian.

Method:

- void tampilMhs(): Menampilkan seluruh data mahasiswa.
- void tampilMatkul(): Menampilkan seluruh data matkul.
- void tampilPenilaian(): Menampilkan seluruh data penilaian.
- void SortingDSC(): Mengurutkan data penilaian berdasarkan nilaiAkhir dari besar ke kecil.
- void PencarianData(String nim): Mencari data mahasiswa berdasarkan NIM (linear search).

Relasi:

- Memegang semua data mahasiswa, matkul, dan penilaian untuk dikelola dan ditampilkan.


Class ini kaya gudang data. Di dalamnya:

* Ada array `Mahasiswa`, `MataKuliah`, dan `Penilaian`,
* Ada fungsi buat nampilin daftar mahasiswa, matkul, dan penilaian,
* Ada juga **sorting** (pakai selection sort) berdasarkan nilai akhir,
* Sama **searching** (pakai linear search) buat cari mahasiswa berdasarkan NIM.

---

5. CLASS: Main

---

Fungsi:

- Menjadi titik awal program (method main).
- Membuat objek-objek Mahasiswa, MataKuliah, dan Penilaian.
- Menampilkan menu interaktif ke user menggunakan Scanner.
- Menangani pilihan user dan memanggil fungsi dari class DataPenilaian.

Relasi:

- Menghubungkan semua class dan menjalankan logika program secara keseluruhan.

---

RELASI ANTAR FILE:
------------------

- Mahasiswa dan MataKuliah adalah entitas data utama.
- Penilaian menggunakan Mahasiswa dan MataKuliah sebagai relasi.
- DataPenilaian menyimpan dan memanipulasi semua objek data.
- Main menjalankan semuanya dan menjadi interface pengguna.
