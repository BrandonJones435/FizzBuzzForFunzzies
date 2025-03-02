/**
 * TODO: Create a class that holds the methods needed for FizzBuzz
 * TODO: Create a method that when called prints out numbers 1-100
 * with multiples of 3 printing out Fizz, multiples of 5 printing
 * out Buzz and multiples of both printing out FizzBuzz.
 * TODO: Create Driver class that calls my method
 */
public class SecondFizzBuzz {
    // Method prints out Fizz Buzz game up to 100
    public static void FizzBuzz() {
        int i = 0;
        while (i < 101) {
            // Checks if i is a multiple of 3 and 5. If so prints FizzBuzz.
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Checks if i is a multiple of 3 and if so prints Fizz.
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Checks if i is a multiple of 5 and if so prints Buzz
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else { // If not multiple of of 5 or 3 print i
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        SecondFizzBuzz.FizzBuzz();
    }
}