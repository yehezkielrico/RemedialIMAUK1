import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi diamond (angka ganjil): ");
        int height = scanner.nextInt();

        if (height % 2 == 0) {
            System.out.println("Tinggi harus angka ganjil.");
            return;
        }

        int space = height / 2;
        int stars = 1;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < (height + 1) / 2) {
                space--;
                stars += 2;
            } else {
                space++;
                stars -= 2;
            }
        }
    }
}