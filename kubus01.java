import java.util.Scanner;

public class kubus01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        double sisi = sc.nextInt();

        System.out.println("Volume kubus: " + hitungVolume(sisi));
        System.out.println("Luas Permukaan kubus: " + hitungLuasPermukaan(sisi));
    }

    

    public static double hitungVolume(double sisi) {
        double volume = sisi * sisi * sisi;
        return volume;
    }

    public static double hitungLuasPermukaan(double sisi) {
        double luasPer = sisi * sisi * 6;
        return luasPer;
    }

}
