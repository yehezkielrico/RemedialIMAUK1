import java.util.Scanner;

public class PenerjemahPesanRahasia {
    public static String terjemahkanPesanRahasia(String pesanRahasia) {
        String vokal = "AEIOU";
        String konsonan = "BCDFGHJKLMNPQRSTVWXYZ";
        StringBuilder terjemahan = new StringBuilder();

        String[] kataKata = pesanRahasia.split(" ");
        for (String kata : kataKata) {
            if (kata.length() >= 4) {
                char hurufPertama = kata.charAt(0);
                char hurufKedua = kata.charAt(1);
                String sisanya = kata.substring(2, kata.length() - 2);
                char hurufTerakhir = kata.charAt(kata.length() - 2);
                char hurufKeduaTerakhir = kata.charAt(kata.length() - 1);

                if (vokal.contains(String.valueOf(hurufPertama)) && konsonan.contains(String.valueOf(hurufKedua))) {
                    String kataTerjemahan = hurufPertama + sisanya + hurufTerakhir;
                    terjemahan.append(kataTerjemahan).append(" ");
                } else {
                    terjemahan.append(kata).append(" ");
                }
            } else {
                terjemahan.append(kata).append(" ");
            }
        }

        return terjemahan.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan pesan rahasia: ");
        String pesanRahasia = scanner.nextLine();
        String pesanTerjemahan = terjemahkanPesanRahasia(pesanRahasia);
        System.out.println("Pesan terjemahan: " + pesanTerjemahan);
    }
}