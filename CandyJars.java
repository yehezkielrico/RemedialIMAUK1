import java.util.Scanner;

public class CandyJars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numJars = scanner.nextInt();
        int target = scanner.nextInt();
        
        int[] candyCounts = new int[numJars];
        for (int i = 0; i < numJars; i++) {
            candyCounts[i] = scanner.nextInt();
        }

        findCandyJarPairs(candyCounts, target);
    }

    public static void findCandyJarPairs(int[] candyCounts, int target) {
        for (int i = 0; i < candyCounts.length; i++) {
            for (int j = i + 1; j < candyCounts.length; j++) {
                if (candyCounts[i] + candyCounts[j] == target) {
                    System.out.println((i + 1) + " " + (j + 1)); // Adding 1 to indexes to convert to 1-based indexing
                }
            }
        }
    }
}