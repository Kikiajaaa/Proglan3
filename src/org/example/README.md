Kode ini adalah program sederhana dalam bahasa Java yang terkait dengan paket org.example. Kode ini berisi kelas SewaMobil yang digunakan untuk mengelola informasi penyewaan mobil, seperti nama penyewa, asal, tujuan, harga sewa, dan diskon. Berikut adalah penjelasan lebih detail:

Deskripsi Package
Package org.example biasanya digunakan sebagai struktur organisasi untuk mengelompokkan kelas atau komponen program di dalam ruang lingkup yang umum, misalnya untuk proyek atau perusahaan tertentu (dalam hal ini "org.example" adalah nama organisasi/proyek).

Penjelasan Kelas SewaMobil
Kelas ini memiliki beberapa atribut, konstruktor, dan metode yang bertujuan mengelola dan menampilkan informasi sewa mobil. Berikut rinciannya:

Atribut

nmP: Nama penyewa mobil.

asl: Asal lokasi penyewa.

tjn: Tujuan penyewa.

hargS: Harga sewa mobil.

dskn: Diskon dalam bentuk persentase.

Konstruktor

Konstruktor SewaMobil(String nmP, String asl, String tjn, double hs, double disk) digunakan untuk menginisialisasi atribut-atribut dari kelas SewaMobil.

Metode
hitungHargaSetelahDiskon(SewaMobil sewaMobil):

Metode static yang menghitung harga sewa setelah diskon diterapkan.
Formula: hargaSewa - (hargaSewa * (diskon / 100))
hitungJumlahDiskon(SewaMobil sewaMobil):

Metode static yang menghitung jumlah diskon berdasarkan harga sewa dan persentase diskon.
Formula: hargaSewa * (diskon / 100)
tampilkanInformasi():

Metode ini menampilkan informasi lengkap tentang penyewaan, termasuk harga sewa awal, besaran diskon, biaya sewa setelah diskon, dan jumlah diskon.
Kelas MainApp
Kelas ini kosong, dan mungkin akan digunakan untuk menjalankan program atau sebagai kelas utama (main) jika diimplementasikan lebih lanjut.

Contoh Penggunaan
Contoh kode dapat menambah kelas MainApp dengan fungsi main untuk membuat objek SewaMobil dan memanggil tampilkanInformasi() untuk menampilkan detail penyewaan.