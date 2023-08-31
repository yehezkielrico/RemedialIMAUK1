import java.util.ArrayList;
import java.util.Scanner;

public class PairwiseSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arrayList.add(scanner.next());
        }

        swapPairwise(arrayList);

        for (String element : arrayList) {
            System.out.print(element + " ");
        }
    }

    public static void swapPairwise(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i += 2) {
            String temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(i + 1));
            arrayList.set(i + 1, temp);
        }
    }
}