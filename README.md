Nama : Muhammad Ilham Zaini
<br>
Kelas : Sistem Informasi C'25
<br>
Nim : 2509116091
<br>

# Sistem Manajemen Jasa Service AC

## <b>1. Deskripsi Singkat Program</b>

Sistem Manajemen Jasa Service AC merupakan program berbasis Java yang digunakan untuk mengelola data pelanggan, mengelola data service, serta menampilkan informasi mengenai jenis service AC. Program dijalankan melalui console dan menggunakan <b>ArrayList</b> sebagai tempat penyimpanan data selama program berjalan.

Program ini dibuat dengan menerapkan konsep dasar Pemrograman Berorientasi Objek (PBO), yaitu <b>encapsulation</b>, <b>inheritance</b>, <b>polymorphism</b>, penggunaan <b>ArrayList</b>, percabangan <b>if-else</b>, serta perulangan.
Program ini memiliki tiga menu utama, yaitu:

<b>1. Kelola Data Pelanggan </b>, digunakan untuk mengelola data teknisi yang melakukan service AC.

<b>2. Kelola Data Service</b>, digunakan untuk mengelola data pelanggan yang menggunakan jasa service AC.

<b>3. Informasi Jenis Service</b>, digunakan untuk menampilkan informasi mengenai jenis service AC dengan menerapkan konsep inheritance dan polymorphism.

Selain itu, terdapat menu <b>4. Keluar</b> untuk menghentikan program.

Setiap menu dari sistem manajemen jasa service AC ini memiliki fitur <b> CRUD (Create, Read, Update, Delete)</b>, yaitu menambah, melihat, mengubah, dan menghapus data.

---
## <b>2. Struktur Class Program</b>

Program terdiri dari beberapa class yang berada pada package <b>Main</b> dan <b>Model</b>.

<b>Struktur Project</b>
SistemManajemenJasaServiceAc
│
├── Main
│   └── Main.java
│
└── Model
    ├── Pelanggan.java
    ├── DetailService.java
    ├── ServiceAC.java
    ├── ServiceCuciAC.java
    └── ServicePerbaikanAC.java
<b>Penjelasan Class</b>

<b>1. Main.java</b>

Class utama yang digunakan untuk menjalankan program. Class ini mengatur menu utama, submenu pelanggan, submenu service, input pengguna, serta perulangan program.

<b>2. Pelanggan.java</b>

Class yang digunakan untuk menyimpan dan mengelola data pelanggan. Class ini memiliki atribut:

ID Pelanggan
Nama
No. Telepon
Alamat

Class ini juga menyediakan method CRUD untuk mengelola data pelanggan pada <b>ArrayList<Pelanggan></b>.

<b>3. DetailService.java</b>

Class yang digunakan untuk menyimpan dan mengelola data service. Atribut yang digunakan yaitu:

ID Service
Tanggal Service
Keluhan
Status

Data service disimpan menggunakan <b>ArrayList<DetailService></b>.

<b>4. ServiceAC.java</b>

Merupakan <b>superclass</b> yang menjadi induk dari jenis service AC. Class ini memiliki atribut:

Jenis Service
Harga Service

Class ini memiliki method <b>hitungBiaya()</b> dan <b>tampilkanService()</b> yang kemudian dapat dioverride oleh subclass.

<b>5. ServiceCuciAC.java</b>

Merupakan subclass dari <b>ServiceAC</b> yang digunakan untuk jenis service cuci AC.

Class ini melakukan <b>method overriding</b> pada method:

hitungBiaya()

dan:

tampilkanService()

<b>6. ServicePerbaikanAC.java</b>

Merupakan subclass dari <b>ServiceAC</b> yang digunakan untuk jenis service perbaikan AC.

Class ini juga melakukan <b>method overriding</b> pada:

hitungBiaya()

dan:

tampilkanService()

---

<b>3. Konsep PBO yang Diterapkan</b>
<b>3.1 Encapsulation</b>

Encapsulation diterapkan dengan membuat atribut pada class menggunakan access modifier <b>private</b>.

Contohnya pada class <b>Pelanggan</b>:

private String idPelanggan;
private String nama;
private int noTelepon;
private String alamat;

Akses terhadap data dilakukan melalui method getter dan setter, contohnya:

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

Dengan demikian, atribut tidak dapat diakses secara langsung dari luar class.

<b>3.2 Inheritance</b>

Inheritance diterapkan pada class <b>ServiceAC</b> sebagai superclass dan dua subclass yaitu:

             ServiceAC
             /       \
            /         \
 ServiceCuciAC   ServicePerbaikanAC

Class <b>ServiceCuciAC</b> dan <b>ServicePerbaikanAC</b> menggunakan:

extends ServiceAC

Sehingga kedua subclass dapat menggunakan atribut dan method yang dimiliki oleh superclass.

<b>3.2 Polymorphism</b>

Polymorphism diterapkan melalui <b>method overriding</b>.

Superclass <b>ServiceAC</b> memiliki method:

public double hitungBiaya() {
    return hargaService;
}

Kemudian method tersebut dioverride pada subclass <b>ServiceCuciAC</b>:

@Override
public double hitungBiaya() {
    return hargaService * jumlahAC;
}

Pada subclass <b>ServicePerbaikanAC</b>, method tersebut juga dioverride dengan perhitungan biaya berdasarkan jenis kerusakan:

@Override
public double hitungBiaya() {

    if (jenisKerusakan.equalsIgnoreCase("Ringan")) {
        return hargaService;
    } else if (jenisKerusakan.equalsIgnoreCase("Sedang")) {
        return hargaService + 50000.0;
    } else {
        return hargaService + 100000.0;
    }
}

Dengan demikian, method dengan nama yang sama dapat memberikan hasil yang berbeda sesuai dengan object subclass yang digunakan.

<b>3.3 ArrayList</b>

Program menggunakan <b>ArrayList</b> untuk menyimpan data selama program berjalan.

Contohnya:

ArrayList<Pelanggan> daftarPelanggan =
        new ArrayList<>();

ArrayList<DetailService> daftarService =
        new ArrayList<>();

ArrayList pelanggan digunakan untuk menyimpan objek <b>Pelanggan</b>, sedangkan ArrayList service digunakan untuk menyimpan objek <b>DetailService</b>.

<b>3.4 Percabangan</b>

Percabangan <b>if-else</b> digunakan untuk menentukan kondisi tertentu dalam program.

Contohnya pada perhitungan biaya service perbaikan AC:

if (jenisKerusakan.equalsIgnoreCase("Ringan")) {
    return hargaService;
} else if (jenisKerusakan.equalsIgnoreCase("Sedang")) {
    return hargaService + 50000.0;
} else {
    return hargaService + 100000.0;
}
<b>3.5 Perulangan</b>

Perulangan <b>do-while</b> digunakan untuk menjaga agar menu tetap berjalan sampai pengguna memilih menu keluar.

Contohnya:

do {
    // menu program
} while (pilihan != 4);

## <b>5. Penjelasan Alur Program</b>

Ketika program dijalankan, sistem akan menampilkan <b>Menu Utama</b> yang terdiri dari menu Kelola Data Pelanggan, Kelola Data Service, Informasi Jenis Service, dan Keluar.

Pengguna dapat memilih menu dengan memasukkan angka sesuai dengan pilihan yang tersedia. Setelah memilih salah satu menu, sistem akan menampilkan submenu yang berisi fitur tambah, lihat, ubah, hapus, dan kembali ke menu utama.

<b>A. Menu Kelola Data Pelanggan</b>

Menu Kelola Data Pelanggan digunakan untuk mengelola informasi pelanggan yang menggunakan jasa servis AC.

Terdapat beberapa pilihan:

<b>1. Tambah Pelanggan</b>, Pengguna memasukkan id pelanggan, nama pelanggan, no telepon dan alamat. Data tersebut kemudian dibuat menjadi objek Pelanggan dan disimpan ke dalam ArrayList <b>ArrayList<Pelanggan></b>.

<b>2. Lihat Pelanggan</b>, Sistem menampilkan seluruh data pelanggan yang telah tersimpan. Data yang ditampilkan meliputi id pelanggan, nama pelanggan, no telepon dan alamat.

<b>3. Ubah Pelanggan</b>, Pengguna memilih nomor pelanggan yang ingin diubah. Setelah itu, pengguna dapat memasukkan id pelanggan, nama pelanggan, no telepon dan alamat. Setelah diubah, data akan diperbarui menggunakan method setter..

<b>4. Hapus Pelanggan</b>, Pengguna memasukkan ID pelanggan yang ingin dihapus. Sistem mencari ID tersebut di dalam <b>ArrayList</b>. Jika ditemukan, data akan dihapus. Jika ID tidak ditemukan, sistem akan memberikan pesan:

"Data pelanggan tidak ditemukan."

<b>5. Kembali</b>, Pengguna kembali ke Menu Utama.


<b>B. Menu Kelola Data Service</b>

Menu Data Kelola Data Service digunakan untuk mengelola data Service dari pelanggan.

Terdapat beberapa pilihan:

<b>1. Tambah Service</b>, Pengguna memasukkan id service, Tanggal Service, Keluhan, Status. Data kemudian dibuat menjadi object <b>DetailService</b> dan disimpan ke dalam <b>ArrayList<DetailService></b>. Sistem juga melakukan pengecekan agar ID Service tidak digunakan oleh data lain.

<b>2. Lihat Service</b>, Sistem menampilkan seluruh data service yang telah tersimpan. Informasi yang ditampilkan berupa antrian service, id service, tanggal, keluhan, status. Program juga memiliki dummy data service sehingga data dapat langsung ditampilkan tanpa harus melakukan input terlebih dahulu.

<b>3. Ubah Service</b>, Pengguna memilih id servuce yang ingin diubah, kemudian memasukkan id service. Setelah itu, Data service akan diperbarui di dalam ArrayList

<b>4. Hapus Teknisi</b>, Pengguna memasukkan ID Service yang ingin dihapus. Sistem akan mencari ID tersebut. Jika ditemukan, data service akan dihapus dari ArrayList.

<b>5. Kembali</b>, Pengguna kembali ke Menu Utama.


<b>C. Informasi Jenis Service</b>

Menu Informasi Jenis Service digunakan untuk menampilkan data service yang telah di input ke dalam sistem / data service yang sedang dikerjakan.

<b>D. Keluar</b>, Jika pengguna memilih menu <b>0. Keluar</b> pada Menu Utama, sistem akan menampilkan pesan:

<b>"Terima kasih telah menggunakan sistem manajemen jasa service ac."</b>

Setelah itu, perulangan program akan berhenti.


<b>D. Menu Keluar</b>

Jika pengguna memilih:

4. Keluar

maka sistem akan menampilkan pesan:

Terima kasih telah menggunakan Sistem Manajemen Jasa Service AC. Setelah itu, kondisi perulangan menjadi salah sehingga program berhenti.

---

## <b>6. Dokumentasi Program</b>

### <b>A. Menu Kelola Data Pelanggan</b>

Berikut merupakan dokumentasi tampilan Menu Data Pelanggan yang digunakan untuk mengelola data pelanggan. Menu ini menyediakan fitur tambah, lihat, ubah, dan hapus data pelanggan.

<img width="477" height="457" alt="Screenshot 2026-09-21 220955" src="https://github.com/user-attachments/assets/dd18d906-6fc4-4d01-9a7d-a99f3f3b60c1" />

### <b>B. Menu Kelola Data Service</b>

Berikut merupakan dokumentasi tampilan Menu Kelola Data Service yang digunakan untuk mengelola data service. Menu ini menyediakan fitur tambah, lihat, ubah, dan hapus data teknisi.

<img width="481" height="457" alt="image" src="https://github.com/user-attachments/assets/d674c69a-4193-4599-9871-c105f41a2beb" />

### <b>C. Menu Data Informasi Jenis Service AC</b>

Berikut merupakan dokumentasi tampilan Menu Informasi Jenis Service yang digunakan untuk menampilkan data servis AC. Menu ini menyediakan fitur tambah, lihat, ubah, dan hapus data servis.

<img width="507" height="442" alt="image" src="https://github.com/user-attachments/assets/b63840d8-2f1d-4c36-924c-dae03a6d15d4" />

## <b>7. Implementasi Program</b>

### <b>7.1 Implementasi Menu Kelola Data Pelanggan</b>

<p> Menu Kelola Data Pelanggan digunakan untuk mengelola data pelanggan yang menggunakan jasa servis AC. Pada menu ini terdapat fitur <b>Tambah Pelanggan</b>, <b>Lihat Pelanggan</b>, <b>Ubah Pelanggan</b>, dan <b>Hapus Pelanggan</b>. </p>

<img width="398" height="821" alt="image" src="https://github.com/user-attachments/assets/62349d33-9a50-41a1-8b79-7bfc4f9ad2e9" />
  <img width="395" height="787" alt="image" src="https://github.com/user-attachments/assets/b1220c22-d804-4bfe-b091-d83764fc7e58" />
    <img width="422" height="537" alt="image" src="https://github.com/user-attachments/assets/95b34967-ce39-430d-8edf-d96e96bb28fd" />

<p align="center">
  <b>Gambar 1. Implementasi Menu Data Pelanggan</b>
</p>

### <b>7.2 Implementasi Menu Kelola Data Service</b>

<p> Menu Data Service digunakan untuk mengelola data Service yang telah di input ke sistem/yang sedang diproses. Pengguna dapat menambahkan, melihat, mengubah, dan menghapus data service yang tersimpan dalam sistem. </p>

<p align="center">
<img width="395" height="742" alt="image" src="https://github.com/user-attachments/assets/fed2990d-f33c-4f65-a126-3fd7d346a28c" />
<img width="516" height="773" alt="image" src="https://github.com/user-attachments/assets/96fdc955-750e-4ed0-a9fe-b675c9bc7bd4" />
<img width="362" height="730" alt="image" src="https://github.com/user-attachments/assets/17d98048-de80-4ac9-bad5-18a075650eb3" />
    <img width="328" height="353" alt="image" src="https://github.com/user-attachments/assets/bd69e775-99ca-4adf-a623-db6d2c082056" />
</p>

<p align="center">
  <b>Gambar 2. Implementasi Menu Data Teknisi</b>
</p>

### <b>7.3 Implementasi Menu Informasi Jenis Service </b>

<p> Menu Informasi Jenis Service digunakan untuk menampilkan data servis AC yang telah terinput ke dalam sistem / data service yang sedang di proses. Pada menu ini pengguna dapat meilhat seluruh isi dari informasi jenis service ac. </p>

<p align="center">
<img width="413" height="507" alt="image" src="https://github.com/user-attachments/assets/2047b4bc-3c2a-4a59-ba14-4d3c39e4b672" />
</p>

<p align="center">
  <b>Gambar 3. Implementasi Menu Data Service AC</b>
</p>

---

## <b>8. Kesimpulan</b>

Sistem Manajemen Jasa Service AC merupakan program console berbasis Java yang digunakan untuk mengelola data pelanggan dan data service AC.

Program menerapkan beberapa konsep Pemrograman Berorientasi Objek, yaitu <b>encapsulation</b>, <b>inheritance</b>, dan <b>polymorphism</b>. Selain itu, program juga menerapkan <b>ArrayList</b> untuk penyimpanan data, <b>if-else</b> untuk percabangan, <b>do-while</b> dan <b>while</b> untuk perulangan.

Dengan adanya fitur CRUD, pengguna dapat menambah, melihat, mengubah, dan menghapus data pelanggan maupun data service selama program sedang berjalan.
