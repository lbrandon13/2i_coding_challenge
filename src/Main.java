public class Main {

    // Iterate multiples of 7
    static int iterativesOf7(int n){
        return n * 7;
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
        
    }
}
