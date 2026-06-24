# Project-Manajemen-Perpustakaan-Java
Aplikasi manajemen tumpukan buku berbasis CLI menggunakan Java yang mengimplementasikan struktur data Stack, algoritma Bubble Sort untuk pengurutan A-Z, dan Linear Search untuk pencarian data.

# 📚 TreeLibrary — Library Stack Management System

Sistem manajemen perpustakaan sederhana berbasis konsol yang dibangun menggunakan **Java**. Program ini mengimplementasikan struktur data **Stack (Tumpukan)** untuk menyimpan dan mengelola koleksi buku, dilengkapi dengan fitur pengurutan dan pencarian buku.

---

## ✨ Fitur

| Fitur | Deskripsi |
|-------|-----------|
| 📖 **Daftar Buku** | Menambahkan satu atau beberapa buku ke dalam tumpukan |
| 📋 **Tampilkan Buku** | Menampilkan buku dari atas ke bawah tumpukan + daftar A–Z |
| 🔍 **Cari Buku** | Mencari buku berdasarkan kata kunci (*case-insensitive*) |
| 🚪 **Keluar** | Keluar dari program |

---

## 🛠️ Teknologi & Konsep

- **Bahasa:** Java (SE)
- **Struktur Data:** Stack berbasis Array
- **Algoritma Pengurutan:** Bubble Sort (A–Z)
- **Algoritma Pencarian:** Linear Search (*case-insensitive*)

---

## 📁 Struktur File

```
TreeLibrary/
└── Main.java       # File utama program
```

---

## 🚀 Cara Menjalankan

### Prasyarat
- Java Development Kit (JDK) versi 8 atau lebih baru
- Terminal / Command Prompt

### Langkah-langkah

**1. Clone repository ini**
```bash
git clone https://github.com/username/TreeLibrary.git
cd TreeLibrary
```

**2. Kompilasi program**
```bash
javac Main.java
```

**3. Jalankan program**
```bash
java Main
```

---

## 🖥️ Contoh Penggunaan

```
== Selamat Datang di TreeLibrary ==
1. Daftar Buku
2. Tampilkan Buku
3. Cari Buku
4. Keluar
Pilih menu: 1

Masukkan Jumlah Buku: 3
Masukkan Judul Buku ke-1: Harry Potter
Masukkan Judul Buku ke-2: Clean Code
Masukkan Judul Buku ke-3: Algoritma dan Pemrograman
Buku Berhasil Ditambahkan

Pilih menu: 2

-- Tumpukan Buku Saat Ini (Paling Atas ke Bawah) --
- Algoritma dan Pemrograman
- Clean Code
- Harry Potter

-- Daftar Buku Terurut (A-Z) --
1. Algoritma dan Pemrograman
2. Clean Code
3. Harry Potter
```

---

## ⚙️ Cara Kerja Program

```
Input Buku ──► [Push ke Stack] ──► tumpukanBuku[]
                                         │
              ┌──────────────────────────┤
              │                          │
         Tampilkan                    Cari Buku
    (Top ──► Bottom)            (Linear Search)
    + Bubble Sort (A-Z)
```

1. **Stack** disimulasikan menggunakan array `tumpukanBuku[]` dengan pointer `tumpukanAtas`.
2. Setiap buku baru di-*push* ke atas tumpukan.
3. Menu **Tampilkan** mencetak buku dari indeks tertinggi ke terendah, lalu mengurutkannya dengan **Bubble Sort**.
4. Menu **Cari** menelusuri seluruh tumpukan dengan **Linear Search** dan menampilkan posisi buku dari atas.

---

## 📌 Batasan Program

- Kapasitas maksimum tumpukan: **100 buku**
- Input berupa teks (judul buku) dan angka (pilihan menu)
- Data tidak tersimpan secara permanen (hilang saat program ditutup)

---

## 👨‍💻 Author

> Dibuat sebagai proyek pembelajaran **Struktur Data** — implementasi Stack, Bubble Sort, dan Linear Search menggunakan Java.

---

## 📄 Lisensi

Proyek ini dibuat untuk keperluan edukasi. Bebas digunakan dan dimodifikasi.
