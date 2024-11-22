import java.util.Scanner;

public class Kafe01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeluruh = 0;
        String lanjut;
        while (true) {
            Menu("Andi", true);
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            System.out.print("Masukkan kode promo: ");
            String kodePromo = sc.next();
            int totalHarga = hitungTotalHarga01(pilihanMenu, banyakItem, kodePromo);
            totalSeluruh += totalHarga;

            System.out.println("=====================================================");
            System.out.println("Total Harga untuk pesanan anda: Rp" + totalHarga);
            System.out.println("Total Keseluruhan Harga untuk pesanan anda: Rp" + totalSeluruh);
            System.out.println("=====================================================");

            System.out.print("Apakah ingin memesan lagi? (ya/tidak): ");
            lanjut = sc.next();
            if (lanjut.equalsIgnoreCase("ya")) {
                continue;
            } else {
                break;
            }
        }
    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang" + namaPelanggan);
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("1. Latte - Rp 22,000");
        System.out.println("1. Teh Tarik - Rp 12,000");
        System.out.println("1. Roti Bakar - Rp 10,000");
        System.out.println("1. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static int hitungTotalHarga01(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7;
        } else {
            System.out.println("Kode promo invalid. Tidak ada pengurangan total harga.");
        }
        return hargaTotal;
    }

}