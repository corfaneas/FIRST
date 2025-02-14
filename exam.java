public class exam {
    public static void main(String[] args) {
        // Δείγμα εισόδου
        String input = "hello 12 you are b=-=eautiful";

        // Κλήση της συνάρτησης και εμφάνιση του αποτελέσματος
        System.out.println(cleanAndFormat(input));
    }

    public static String cleanAndFormat(String input) {
        // Αφαιρούμε όλα τα σύμβολα και αριθμούς, κρατώντας μόνο γράμματα και κενά
        String cleaned = input.replaceAll("[^a-zA-Z ]", "");
        cleaned.trim();
        // Μετατρέπουμε σε πεζά και αντικαθιστούμε τα κενά με παύλες
        return cleaned.toLowerCase().replace(" ", "_");
    }
}