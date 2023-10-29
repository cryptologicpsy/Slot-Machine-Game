public class SlotMachineGame {
    public static void main(String[] args) {
        // Δημιουργία ενός πίνακα 3x3 με τυχαίους αριθμούς από 1 έως 5
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (int) (Math.random() * 5) + 1;
            }
        }

        // Εμφάνιση των αριθμών του πίνακα
        System.out.println("Αριθμοί Slot Machine:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Έλεγχος για τρεις ίδιους αριθμούς στην ίδια γραμμή
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
                System.out.println("Κερδίσατε! Έχετε βρει τρεις ίδιους αριθμούς στη γραμμή " + (i + 1) + "!");
                return;
            }
        }

        // Έλεγχος για τρεις ίδιους αριθμούς στην ίδια στήλη
        for (int j = 0; j < 3; j++) {
            if (matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j]) {
                System.out.println("Κερδίσατε! Έχετε βρει τρεις ίδιους αριθμούς στη στήλη " + (j + 1) + "!");
                return;
            }
        }

        // Έλεγχος για τρεις ίδιους αριθμούς στην κύρια διαγώνιο
        if (matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]) {
            System.out.println("Κερδίσατε! Έχετε βρει τρεις ίδιους αριθμούς στην κύρια διαγώνιο!");
            return;
        }

        // Έλεγχος για τρεις ίδιους αριθμούς στην δευτερεύουσα διαγώνιο
        if (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) {
            System.out.println("Κερδίσατε! Έχετε βρει τρεις ίδιους αριθμούς στην δευτερεύουσα διαγώνιο!");
            return;
        }

        System.out.println("Δυστυχώς, δεν κερδίσατε. Προσπαθήστε ξανά!");
    }
}