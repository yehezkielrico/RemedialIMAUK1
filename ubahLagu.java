import java.util.Scanner;

public class ubahLagu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lirikInput = scanner.nextLine();
        String lirikHasil = ubahLagu(lirikInput);
        System.out.println(lirikHasil);
    }

    public static String ubahLagu(String lirik) {
        char[] hurufPengganti = {'A', 'E', 'I', 'O', 'U'};
        lirik = lirik.toUpperCase(); 
        StringBuilder hasil = new StringBuilder();

        int hurufVokalIndex = 0;
        for (int i = 0; i < lirik.length(); i++) {
            char charAtI = lirik.charAt(i);
            if (Character.isLetter(charAtI)) {  
                char hurufBaru = charAtI;
                if ("AEIOU".contains(String.valueOf(charAtI))) {
                    int sisaBagi = hurufVokalIndex % 5;
                    hurufBaru = hurufPengganti[sisaBagi];
                    // hurufVokalIndex++;
                // }else if("Potong bebek angsa masak di kuali".contains(String.valueOf(charAtI))){
                //     int sisaBagi = hurufVokalIndex % 5;
                //     hurufBaru = hurufPengganti[sisaBagi];
                //     // hurufVokalIndex++;
                 }
                if (Character.isLowerCase(lirik.charAt(i))) {
                    hurufBaru = Character.toLowerCase(hurufBaru);
                }
                hasil.append(hurufBaru);
            } else {
                hasil.append(charAtI);
            }
        }

        return hasil.toString();
    }
}