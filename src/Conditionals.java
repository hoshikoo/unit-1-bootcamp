/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {
      System.out.println(isOdd(3));
      System.out.println(isOdd(4));

      System.out.println(isMultipleOfThree(9));
      System.out.println(isMultipleOfThree(11));

      System.out.println(isOddAndIsMultipleOfThree(12));
      System.out.println(isOddAndIsMultipleOfThree(9));

      System.out.println(isOddAndIsMultipleOfThree2(12));
      System.out.println(isOddAndIsMultipleOfThree2(9));


      fizzMultipleofThree(9);
      fizzMultipleofThree(40);
  }

    // 1.   Write a method isOdd that takes in an int n.
    // Returns a true if n is odd, and false otherwise.
    public static boolean isOdd(int n){
        if (n%2!= 0){
            return true;
        }else {
            return false;
        }
    }


    // 2.   Write a method isMultipleOfThree that takes in an int n.
    // Returns true if n is a multiple of three, and false otherwise.
    public static boolean isMultipleOfThree(int n){
        if (n%3!= 0){
            return false;
        }else {
            return true;
        }
    }


    // 3.   Write a method isOddAndIsMultipleOfThree that takes in an int n.
    // Returns true if n is both odd and a multiple of three, and false otherwise.

    public static boolean isOddAndIsMultipleOfThree(int n){
        if (n%3== 0 && n%2!=0){
            return true;
        }else {
            return false;
        }
    }

    // 4.   Write a method isOddAndIsMultipleOfThree2 - if you used isOdd and isMultipleofThree
    // in your last solution, don't use it this time.
    // If you did not, write this method building on your last methods.
    public static boolean isOddAndIsMultipleOfThree2(int n){
        if (n%6!= 0){
            return true;
        }else {
            return false;
        }
    }



    // 5.   Write a method fizzMultipleofThree that takes in an int n and
    // prints "Fizz" if n is a multiple of three, and prints n otherwise.
    public static void fizzMultipleofThree(int n){
        if (n%3== 0){
            System.out.println("Fizz");
        }else {
            System.out.println(n);
        }
    }
}
