public class Main {

    // Iterate multiples of 7
    static int iterativesOf7(int n) {
        return n * 7;
    }

    // Iterate multiples of 8
    static int iterativesOf8(int n) {
        return n * 8;
    }

    //Iterate multiples of 9
    static int iterativesOf9(int n) {
        return n * 9;
    }

    public static void main(String[] args) {
        
        /* Coding challenge: 
         *
         * Create 3 functions:
         * 1. Iterate multiples of 7 
         * 2. Iterate multiples of 8
         * 3. Iterate multiples of 9
         * 
         * Then output respective functions up to and including 100, 200, 300.
        */

        int n = 1;
        while (iterativesOf7(n) <= 100) {
            System.out.println(iterativesOf7(n));
            n++;
        }

        int i = 1;
        while (iterativesOf8(i) <= 200) {
            System.out.println(iterativesOf8(i));
            i++;
        }

        int j = 1;
        while (iterativesOf9(j) <= 300) {
            System.out.println(iterativesOf9(j));
            j++;
        }
        
    }
}
