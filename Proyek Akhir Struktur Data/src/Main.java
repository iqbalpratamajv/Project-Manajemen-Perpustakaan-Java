import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String[] tumpukanBuku = new String[100]; 
    static int tumpukanAtas = -1;

    public static void menuPerpustakaan() {
        System.out.println("== Selamat Datang di TreeLibrary ==");
        System.out.println("1. Daftar Buku");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Cari Buku");
        System.out.println("4. Keluar");
    }

    public static void menuSatu() {
        System.out.print("Masukkan Jumlah Buku: ");
        int jumlahBukuBaru = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahBukuBaru; i++) {
            if (tumpukanAtas >= 99) {
                System.out.println("Tumpukan sudah penuh!");
                break;
            }
            System.out.print("Masukkan Judul Buku ke-" + (tumpukanAtas + 2) + ": ");
            String judul = input.nextLine();
            tumpukanAtas++;
            tumpukanBuku[tumpukanAtas] = judul;
        }
        System.out.println("Buku Berhasil Ditambahkan");
    }

    public static void menuDua() {
        if (tumpukanAtas == -1) {
            System.out.println("Tumpukan kosong! Belum ada buku.");
            return;
        }
        
        System.out.println();
        System.out.println("-- Tumpukan Buku Saat Ini (Paling Atas ke Bawah) --");
        for (int i = tumpukanAtas; i >= 0; i--) {
            System.out.println("- " + tumpukanBuku[i]);
        }

        int totalBuku = tumpukanAtas + 1;
        String[] bukuUrut = new String[totalBuku];
        for (int i = 0; i < totalBuku; i++) {
            bukuUrut[i] = tumpukanBuku[i];
        }

        for (int i = 0; i < totalBuku - 1; i++) {
            for (int j = 0; j < totalBuku - i - 1; j++) {
                if (bukuUrut[j].compareToIgnoreCase(bukuUrut[j+1]) > 0) {
                    String wadahSementara = bukuUrut[j];
                    bukuUrut[j] = bukuUrut[j+1];
                    bukuUrut[j+1] = wadahSementara;
                }
            }
        }

        System.out.println();
        System.out.println("-- Daftar Buku Terurut (A-Z) --");
        for (int i = 0; i < totalBuku; i++) {
            System.out.println((i + 1) + ". " + bukuUrut[i]);
        }
    }

    public static void menuTiga() {
        if (tumpukanAtas == -1) {
            System.out.println("Tumpukan kosong! Tidak ada data untuk dicari.");
            return;
        }

        System.out.print("Masukkan judul buku yang dicari: ");
        String kataKunci = input.nextLine();
        boolean ditemukan = false;

        System.out.println();
        System.out.println("-- Hasil Pencarian Buku --");
        for (int i = tumpukanAtas; i >= 0; i--) {
            if (tumpukanBuku[i].toLowerCase().contains(kataKunci.toLowerCase())) {
                System.out.println("-> " + tumpukanBuku[i] + " (Ada di urutan ke-" + (tumpukanAtas - i + 1) + " dari atas)");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Buku \"" + kataKunci + "\" tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        int pilihMenu;
        do {
            System.out.println();
            menuPerpustakaan();
            System.out.print("Pilih menu: ");
            pilihMenu = input.nextInt();
            input.nextLine();

            switch (pilihMenu) {
                case 1:
                    menuSatu();
                    break;
                case 2:
                    menuDua();
                    break;
                case 3:
                    menuTiga();
                    break;
                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
                    break;
            }
        } while (pilihMenu != 4);
    }
}