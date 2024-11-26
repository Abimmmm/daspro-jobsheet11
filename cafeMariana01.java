import java.util.Scanner;

public class cafeMariana01 {
    static int[][] dataPenjualan = {
            { 20, 20, 25, 20, 10, 60, 10 },
            { 30, 80, 40, 10, 15, 20, 25 },
            { 5, 9, 20, 25, 10, 5, 45 },
            { 50, 8, 17, 18, 10, 30, 6 },
            { 15, 10, 16, 15, 10, 10, 55 }
    };
    static String[] menu = { "Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan" };
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String lanjut;
        while (true) {
            System.out.println("1. Input Data Penjualan");
            System.out.println("2. Tampilkan Semua Data Penjualan");
            System.out.println("3. Tampilkan Menu dengan Penjualan Tertinggi");
            System.out.println("4. Tampilkan Rata-rata Penjualan per Menu");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                inputdatapenjualan();
            } else if (choice == 2) {
                displaydataterjual();
            } else if (choice == 3) {
                displayMenubanyak();
            } else if (choice == 4) {
                displayrata();
            } else {
                System.out.println("Pilihan tidak valid.");
            }
            System.out.print("Lanjut melihat? (ya/tidak): ");
            lanjut = scanner.next();
            if (lanjut.equalsIgnoreCase("ya")) {
                continue;
            } else {
                break;
            }
        }

    }

    public static void inputdatapenjualan() {
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Masukkan penjualan " + menu[i] + " untuk hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = scanner.nextInt();
            }
        }
    }

    public static void displaydataterjual() {
        System.out.println("\nData Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(dataPenjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void displayMenubanyak() {
        int maxTerjual = 0;
        String topMenu = "";
        for (int i = 0; i < menu.length; i++) {
            int totalTerjual = 0;
            for (int j = 0; j < 7; j++) {
                totalTerjual += dataPenjualan[i][j];
            }
            if (totalTerjual > maxTerjual) {
                maxTerjual = totalTerjual;
                topMenu = menu[i];
            }
        }
        System.out.println(
                "\nMenu dengan penjualan tertinggi adalah " + topMenu + " dengan total penjualan " + maxTerjual);
    }

    public static void displayrata() {
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalTerjual = 0;
            for (int j = 0; j < 7; j++) {
                totalTerjual += dataPenjualan[i][j];
            }
            System.out.println(menu[i] + ": " + (double) totalTerjual / 7);
        }
    }
}
