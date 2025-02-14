
public class exame {
    public static void main(String[] args) {
        // Δείγμα εισόδου
        String input = "hello bitch!@ yayayaya1";

        // Κλήση της συνάρτησης και εμφάνιση του αποτελέσματος
        System.out.println("Αντεστραμμένη μεγαλύτερη λέξη: " + getLargestReversedWord(input));
    }

    public static String getLargestReversedWord(String input) {
        // Αφαιρούμε όλα τα σύμβολα κρατώντας μόνο γράμματα και κενά
        String cleaned = input.replaceAll("[^a-zA-Zα-ωΑ-Ω1-9 ]", "");

        // Διαχωρίζουμε τις λέξεις
        String[] words = cleaned.split("\\s+");

        // Βρίσκουμε τη μεγαλύτερη λέξη
        String largestWord = "";
        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        String reversed = "";

        // Χρησιμοποιούμε for loop για να πάρουμε τους χαρακτήρες από το τέλος προς την αρχή
        for (int i = largestWord.length() - 1; i >= 0; i--) {
            reversed += largestWord.charAt(i);
        }

        // Αντιστροφή της λέξης
        return reversed;
    }
}