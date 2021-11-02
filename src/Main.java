public class Main {

    // Iterate multiples of 7
    static int iterativesOf7(int n){
        return n * 7;
    }

    // Iterate multipls of 8
    static int iterativesOf8(int n){
        return n * 8;
    }
    public static void main(String[] args){
        
        /* Create 3 functions:
         * 1. Iterate multiples of 7 up to 100 
         * 2. Iterate multiples of 8 up to 200
         * 3. Iterate multiples of 9 up to 300
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
        
    }
}
