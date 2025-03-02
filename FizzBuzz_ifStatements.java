/**
 * Holds all of the methods for FizzBuzz
 */
public class FizzBuzz_ifStatements {
    /**
     * This method prints out all of number 1 - 100 except in cases of multiples of 3's and 5's
     * Prints out Fizz for mulitples of 3
     * Prints out Buzz for multiples of 5
     * Prints out FizzBuzz for multiples of 3 and 5
     */
    public static void writeOutFizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } 
            else if (i % 5 ==0) {
                System.out.println("Buzz " + i);
            } else {
                System.out.println(i);
            }
        }
    }

    // Run code in terminal with: javac FizzBuzz_ifStatements.java && java FizzBuzz_ifStatements
    public static void main(String[] args) {
        FizzBuzz_ifStatements.writeOutFizzBuzz();
    }
}
