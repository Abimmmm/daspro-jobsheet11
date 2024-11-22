public class PengunjungCafe01 {
    public static void main(String[] args) {
        daftarPengunjung01("Ali", "Budi", "Citra");
    }

    public static void daftarPengunjung01(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung: ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
        System.out.println();
        System.out.println("Daftar nama pengunjung: ");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
}
