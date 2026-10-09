# Qolbina_ArrayList
Proyek Aplikasi Bank (PBO - Java)

Aplikasi berbasis konsol untuk mengelola rekening nasabah bank menggunakan konsep Object-Oriented Programming (OOP) dan struktur data dinamik ArrayList.

📁 Struktur File Proyek

Proyek ini terdiri dari 3 file kelas utama (Separation of Concerns):

Account.java:

Kelas entitas yang merepresentasikan satu rekening nasabah.

Menyimpan informasi nama nasabah dan saldo (balance).

Menyediakan method untuk setor tunai (deposit), tarik tunai (withdraw), dan pemeriksaan saldo.

Bank.java:

Kelas pengelola utama yang menyimpan daftar banyak rekening menggunakan ArrayList<Account>.

Menyediakan fungsi untuk menambah rekening baru, mencari rekening nasabah, serta menampilkan seluruh daftar nasabah.

BankDemo.java:

Kelas program utama (Main Class) yang menjalankan skenario transaksi simulasi perbankan.

💡 Konsep OOP & Fitur Utama

ArrayList Integration: Memungkinkan bank menyimpan jumlah rekening nasabah secara fleksibel tanpa batasan ukuran array konvensional.

Encapsulation: Seluruh variabel seperti saldo dan nama nasabah dibungkus rapi dengan akses kontrol private dan diakses melalui getter/setter.

Single Responsibility Principle: Setiap kelas memiliki tugas khusus (Model Rekening, Pengelola Bank, dan Pembawa Eksekusi Program Utama).

🚀 Cara Menjalankan Program (PowerShell / Terminal)

1. Buka PowerShell di Folder Proyek

Buka folder proyek di File Explorer, lalu ketik powershell pada Address Bar bagian atas dan tekan Enter.

2. Kompilasi Seluruh File Java

Ketik perintah berikut di PowerShell untuk mengompilasi semua file .java:

javac *.java


3. Jalankan Program Utama

Eksekusi kelas BankDemo menggunakan perintah:

java BankDemo


🖥️ Contoh Output Program

=== DAFTAR NASABAH BANK ===
1. Nasabah: Budi | Saldo: Rp 1500000.0
2. Nasabah: Siti | Saldo: Rp 2000000.0

--- Transaksi ---
Setor tunai Budi: Rp 500.000... Sukses!
Tarik tunai Siti: Rp 300.000... Sukses!

=== DAFTAR NASABAH TERKINI ===
1. Nasabah: Budi | Saldo: Rp 2000000.0
2. Nasabah: Siti | Saldo: Rp 1700000.0

