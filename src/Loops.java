import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main (String args[]) {
      System.out.println("for loop: ");
      printOneToTen();
      System.out.println("\nwhile loop: ");
      printOneToTenTwo();
      System.out.println("\nEx 3. ");
      loopThree(9);
      System.out.println("\nEx 4. ");
      loopFour(10);
      System.out.println("\nEx 5. ");
      loopFive();
      System.out.println("\nEx 6. ");
      loopSix(5);
      System.out.println("\nEx 7. ");
      loopSix(1000);
      System.out.println("\nEx 8. ");
      loopEight(3,"Cosmos");
      System.out.println("\nEx 9. ");
      loopNine(3, "Cosmos");
      System.out.println("\nEx 10. ");
      loopTen();
      System.out.println("\nEx 11. ");
      loopEleven();

      System.out.println("\nEx 12. ");
      loopTwelve(10);

      System.out.println("\nExercises++ 1: ");
      System.out.println(sumNumbers("7 11"));
      System.out.println(sumNumbers("aa11b33a"));
      System.out.println(sumNumbers("abc123xyz"));

      System.out.println("\nExercises++ 2: ");
      System.out.println(notReplace("is test"));
      System.out.println(notReplace("Is test"));
      System.out.println(notReplace("is-is"));
      System.out.println(notReplace("This is right"));

      System.out.println("\nExercises++ 3: ");
      System.out.println(wordEnds("abcXY123XYijk", "XY")); // "c13i"
      System.out.println(wordEnds("XY123XY", "XY"));// → "13"
      System.out.println(wordEnds("XY1XY", "XY")); //→ "11"

      System.out.println("\nExercises++ 4: ");
      numberPuzzle();

      System.out.println("\nExercises++ 5: ");
      digits();


  }

    // 1. Write a method that prints the numbers 1 through 10 using a loop.
    public static void printOneToTen(){
        for(int i=1; i<11; i++){
            System.out.print(i + ", ");
        }
    }

    // 2. Write a method that prints the numbers 1 through 10 using a different kind of loop.
    public static void printOneToTenTwo(){
        int i=0;
        while(i<10){
            i++;
            System.out.print(i +", ");
        }
    }

    //3. Write a method that takes in an int n and prints the numbers 1 through n.
    public static void loopThree(int n){
        int i=0;
        while(i<n){
            i++;
            System.out.print(i+", ");
        }
    }

    //4. Write a method that takes in an int n and prints the even numbers 2 through n.
    public static void loopFour(int n){
       for(int i = 2; i<n;i++){
            if(i%2==0){
                System.out.print(i + ", ");
            }
        }
    }
    //5. Write a method that prints the sum of 1 through 10 using a loop.
    public static void loopFive(){
        int total=0;
        for(int i = 1; i<=10;i++){
            total = total+i;
            }
        System.out.println(total);
    }

    //6. Write a method that takes in an int n and prints the sum of the numbers 1 through n using a loop.
    public static void loopSix(int n){
        int total=0;
        for(int i = 1; i<=n;i++){
            total = total+i;
        }
        System.out.print(total);
    }
    //8.Write a method that takes in an int n and a String s and prints out s on its own line, n times.
    // If n is negative, print "".

    public static void loopEight(int n, String s){

        for  (int i =0;i<n; i++){
            System.out.println(s);
        }
    }

    //9. Modify the method to print out the string concatenated with itself n times.
    public static void loopNine(int n, String s){

        for  (int i =0;i<n; i++){
            System.out.print(s);
        }
    }

    //10. Write a method that prints the first ten Fibonnaci numbers.
    public static void loopTen(){
        long f1 = 0;
        long f2=1;
        long fn;
        System.out.println(f1+", "+f2);
        for (int i = 2; i < 10; i++){
            fn=f1+f2;
            f1=f2;
            f2=fn;
            System.out.println(fn);
        }
    }

    // 11.Modify the method to sum the first ten Fibonnaci numbers.
    public static void loopEleven(){
        long f1 = 0;
        long f2=1;
        long fn;
        long total = f1+f2;
        for (int i = 2; i < 10; i++){
            fn=f1+f2;
            f1=f2;
            f2=fn;
            total =total +fn;
        }
        System.out.println(total);
    }

    //12. Modify the method to take in an int n and sum the first n Fibonnaci numbers.
    public static void loopTwelve(int n){
        long f1 = 0;
        long f2=1;
        long fn;
        long total = f1+f2;
        for (int i = 2; i <n; i++){
            fn=f1+f2;
            f1=f2;
            f2=fn;
            total =total +fn;
        }
        System.out.println(total);
    }

//    1. sumNumbers
//
//    Given a string, return the sum of the numbers appearing in the string,
//    ignoring all other characters. A number is a series of 1 or more digit chars in a row.
//    (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
//    Integer.parseInt(string) converts a string to an int.)
//
//    sumNumbers("abc123xyz") → 123
//    sumNumbers("aa11b33") → 44
//    sumNumbers("7 11") → 18

    public static int sumNumbers(String str){
        ArrayList <Integer> numList = new ArrayList<Integer>();
        String eachNum ="";


        for (int i=0 ; i<str.length() ; i++){
            char eachChara = str.charAt(i);

            if (Character.isDigit(eachChara)) {
                eachNum = eachNum + eachChara;
            }
             else{
               if(!eachNum.equals("")){
                   int num = Integer.parseInt(eachNum);
                   numList.add(num);
                   eachNum="";
               }
             }
        }

        if(!eachNum.equals("")){
            int num = Integer.parseInt(eachNum);
            numList.add(num);

        }
        //System.out.println(numList);
        int total=0;
        for(int number : numList){
            total = total+number;
            //System.out.println("found number: " +number);
        }
        return total;

    }


//    2. Is Not
//    Given a string, return a string where every appearance of the lowercase word
//      "is" has been replaced with "is not". The word "is" should not be immediately
//      preceeded or followed by a letter -- so for example the "is" in "this" does
//      not count. (Note: Character.isLetter(char) tests if a char is a letter.)
//
//    notReplace("is test") → "is not test"
//    notReplace("is-is") → "is not-is not"
//    notReplace("This is right") → "This is not right"

    public static String notReplace(String str){

        StringBuilder sb = new StringBuilder().append(' ').append(str).append(' ');

        for (int i=0 ; i<sb.length()-2 ; i++) {

            if(!Character.isLetter(sb.charAt(i)) && sb.charAt(i+1)=='i' && sb.charAt(i+2)=='s' &&!Character.isLetter(sb.charAt(i+3))){
                sb.insert(i + 3, " not");
                i += 5;
            }


//
        }

            return sb.substring(1, sb.length() - 1);
    }


//    3. Between Words
//
//    Given a string and a non-empty word string, return a string made of each char
//    just before and just after every appearance of the word in the string. Ignore cases
//    where there is no char before or after the word, and a char may be included twice
//    if it is between two words.
//
//    wordEnds("abcXY123XYijk", "XY") → "c13i"
//    wordEnds("XY123XY", "XY") → "13"
//    wordEnds("XY1XY", "XY") → "11"
        public static String wordEnds(String str, String word){
            int strlen = str.length();
            int wordLen = word.length();
            int position = str.indexOf(word);
            int endPosition =0;

            StringBuilder newString = new StringBuilder(strlen);

            // should Add something to check if all letters are the same as word with loop.

            while(position!=-1){
                endPosition=position+wordLen;

                if(position>=1){
                    newString.append(str.charAt(position-1));
                }
                if(endPosition<strlen){
                    newString.append(str.charAt(endPosition));
                }
                position = str.indexOf(word,endPosition);
            }
            return newString.toString();
        }



//    4. Number Puzzle
//
//    Use nested for loops to generate a list of all the pairs of positive two digit numbers
//    whose sum is 60, and whose difference is 14.

        public static void numberPuzzle() {
            for(int i = 10; i < 100; i++) {
                for(int j = 10; j < 100; j++) {
                    if(i + j == 60) {
                        if(i - j == 14 || j - i == 14) {
                            System.out.println(i + ", " + j);
                        }
                    }
                }
            }

        }

//
//    5. Digits
//
//    Use nested for loops to generate a list of all the positive two digit numbers.
//    Display the numbers, and the sums of their digits.

    public static void digits() {

        for(int i = 10; i < 100; i++) {
            String num = Integer.toString(i);
            char numC1 = num.charAt(0);
            char numC2 = num.charAt(1);

            int num1 = Character.getNumericValue(numC1);
            int num2 = Character.getNumericValue(numC2);

            int sum = num1+num2;

            System.out.println(i+", "+ num1+"+"+num2+" = "+sum);

        }
    }


}
