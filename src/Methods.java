import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {
      System.out.println(calculateSquare(9));
      System.out.println(calculateSquare(4));

      System.out.println(calculateSquareRoot(81));
      System.out.println(calculateSquareRoot(200));

      System.out.println(toLowerCase("Hello World!"));

      System.out.println(isMultiple(5, 100));
      System.out.println(isMultiple(5, 101));

      prettyInteger(10);
      System.out.println();

      System.out.println(random(3,5));
  }

//    1. Calculate Square
//
//    Write a method called calculateSquare that takes an int as a parameter and returns the square of that integer.
//
//    ex: calculateSquare(2) returns 4
//    calculateSquare(3) returns 9
//    calculateSquare(4) returns 16

    public static int calculateSquare(int n){
        int square = n*n;
        return square;
    }


//
//    2. Calculate Square Root
//
//    Write a method called calculateSquareRoot that takes an int as a parameter and returns the square root of that integer.
//
//    ex: calculateSquareRoot(4) returns 2
//    calculateSquareRoot(9) returns 3
//    calculateSquareRoot(16) returns 4
//    How to calculate a square root

    public static double calculateSquareRoot (int n){

        double sqr = (double) n;
        double squareRoot = Math.sqrt(sqr);
        return squareRoot;
    }
//
//    3. toLowerCase
//    Write a method called toLowerCase that takes a String as a parameter and returns the String in lower case.
//    ex: toLowerCase("Hello, World!") returns "hello, world!"

    public static String toLowerCase(String str){
        return str.toLowerCase();
    }
//
//     4. isMultiple
//
//    Write a method called isMultiple that takes 2 int parameters and determines if the second is a multiple of the first.
//
//    ex: isMultiple(2, 3) returns false
//    isMultiple(2, 4) returns true
//    isMultiple(5, 100) returns true
//    isMultiple(5, 101) returns false

    public static boolean isMultiple(int i, int j){
        if(j%i==0){
            return true;
        }else{
            return false;
        }
    }

//
//    5. Pretty Integer
//    Write a method called prettyInteger that takes an int as a parameter and prints the integer
//    surrounded by asterisks with the length of each side equal to the given integer.
//
//    ex: prettyInteger(4) prints "**** 4 ****"
//    prettyInteger(10) prints "********** 10 **********"
//    Hint: this method does not return anything!


    public static void prettyInteger(int n){

        for (int i=0; i<n;i++){
            System.out.print("*");
        }
        System.out.print(n);

        for (int i=0; i<n;i++){
            System.out.print("*");
        }
    }
//
//    6. Random
//    Write a method called random that takes 2 ints as parameters and returns
//    a random int within that range.
//    ex: random(1, 100) returns a random int between 1 and 100


    public static int random(int i, int j){

        int number;
        if(i>=j){
            number = new Random().nextInt(i-j+1)+j;
        }else {
            number = new Random().nextInt(j-i+1)+i;
        }
        return number;
    }
}
