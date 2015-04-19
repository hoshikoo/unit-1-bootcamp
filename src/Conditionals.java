import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

      System.out.println("Cigar party was successful: "+ cigarParty(70, true));
      System.out.println("Cigar party was successful: "+ cigarParty(30, true));
      System.out.println("Cigar party was successful: "+ cigarParty(39, false));
      System.out.println("Cigar party was successful: "+ cigarParty(65, false));
      System.out.println("Cigar party was successful: "+ cigarParty(55, false));


      System.out.println(caughtSpeeding(60, false));// 0
      System.out.println(caughtSpeeding(65, false)); // → 1
      System.out.println(caughtSpeeding(65, true)); //→ 0

      System.out.println(caughtSpeeding(80, true));
      System.out.println(caughtSpeeding(85, true));
      System.out.println(caughtSpeeding(86, true));
      System.out.println(caughtSpeeding(85, false));
      System.out.println(caughtSpeeding(65, true));
      System.out.println(caughtSpeeding(65, false));


      //    alarmClock(1, false) → "7:00"
      //    alarmClock(5, false) → "7:00"
      //    alarmClock(0, false) → "10:00"
      System.out.println(alarmClock(1, false));
      System.out.println(alarmClock(5, false));
      System.out.println(alarmClock(0, false));
      System.out.println(alarmClock(6, true));


      System.out.println(lotteryTicket(3,3,3));
      System.out.println(lotteryTicket(1,2,3));
      System.out.println(lotteryTicket(1,3,3));
      System.out.println(lotteryTicket(3,3,1));
      System.out.println(lotteryTicket(3,1,3));


      System.out.println(blackjack(19, 21));// → 21
      System.out.println(blackjack(21, 19));// → 21
      System.out.println(blackjack(19, 22));// → 19
      System.out.println(blackjack(33, 22));// → 0
      System.out.println(blackjack(19, 22));// → 22
      System.out.println(blackjack(25, 21));// → 22

//      evenlySpaced(2, 4, 6) → true
//      evenlySpaced(4, 6, 2) → true
//      evenlySpaced(4, 6, 3) → false

      System.out.println(evenlySpaced(2, 4, 6));
      System.out.println(evenlySpaced(4, 6, 2));
      System.out.println(evenlySpaced(4, 6, 3));
      System.out.println(evenlySpaced(2, 6, 4));
      System.out.println(evenlySpaced(1, 6, 4));

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


//    1. Cigar Party
//    When squirrels get together for a party, they like to have cigars.
// A squirrel party is successful when the number of cigars is between 40 and 60,
// inclusive. Unless it is the weekend, in which case there is no upper bound on
// the number of cigars. Write a method called cigarParty that takes an int
// (the number of cigars) and boolean (whether or not it is the weekend) as parameters,
// and returns true if the party with the given values is successful, or false otherwise.


    public static boolean cigarParty (int cigarNum, boolean weekend){
        if(weekend && cigarNum >=40){
            return true;
        }else if(!weekend && cigarNum>=40 && cigarNum<=60){
            return true;
        }else{return false;}
    }


//    2. Caught Speeding
//    You are driving a little too fast, and a police officer stops you.
// Write code to compute the result, encoded as an int value: 0=no ticket,
// 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
// If speed is between 61 and 80 inclusive, the result is 1.
// If speed is 81 or more, the result is 2. Unless it is your birthday
// -- on that day, your speed can be 5 higher in all cases.
//
//    caughtSpeeding(60, false) → 0
//    caughtSpeeding(65, false) → 1
//    caughtSpeeding(65, true) → 0

    public static int caughtSpeeding (int speed, boolean birthday){
        int noTicket = 0;
        int smallTicket = 1;
        int bigTicket=2;

        if((speed <= 60 && !birthday) || (speed<=65 && birthday)){
            return noTicket;
        }else if ((speed >=61 && speed<=80 && !birthday )||(speed >=66 && speed<=85 && birthday)){
            return smallTicket;
        }else{
            return bigTicket;
        }
    }


// 3. Alarm Clock
//    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
// and a boolean indicating if we are on vacation, return a string of the form "7:00"
// indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
// and on the weekend it should be "10:00". Unless we are on vacation --
// then on weekdays it should be "10:00" and weekends it should be "off".
//
//    alarmClock(1, false) → "7:00"
//    alarmClock(5, false) → "7:00"
//    alarmClock(0, false) → "10:00"


    public static String alarmClock (int dayOfWeek, boolean vacation){
        if (dayOfWeek>=1 && dayOfWeek<=5 && !vacation){
            return "7:00";
        } else if(dayOfWeek==0 || dayOfWeek == 6 && !vacation){
            return "10:00";
        }else if (dayOfWeek>=1 && dayOfWeek<=5 && vacation){
            return "10:00";
        }else{
            return "off";
        }
    }


//4. Lottery Ticket
//    You have a green lottery ticket, with ints a, b, and c on it.
// If the numbers are all different from each other, the result is 0.
// If all of the numbers are the same, the result is 20. If two of the
// numbers are the same, the result is 10. Write a method that takes 3 ints
// as parameters and returns the correct result.
  public static int lotteryTicket (int a, int b, int c){
      if(a==b && b==c){
          return 20;
      }else if (a==b || b==c || c==a){
          return 10;
      }else{
          return 0;
      }
  }


//5. Blackjack
//    Given 2 int values greater than 0, return whichever value is nearest to
//    21 without going over. Return 0 if they both go over.
//    blackjack(19, 21) → 21
//    blackjack(21, 19) → 21
//    blackjack(19, 22) → 19

    public static int blackjack(int a, int b){

        if(a>21 && b>21){
            return 0;
        }else if((21-a)<(21-b)|| (a>21&&b<=21&& (a-21)<(21-b))|| ((b>21 && a<=21 &&(b-21)>(21-a)))){
            return a;
        }else{
            return b;
        }
    }

//  6. Evenly Spaced
//    Given three ints, a b c, one of them is small, one is medium and one is large.
//   Return true if the three values are evenly spaced, so the difference between small
//   and medium is the same as the difference between medium and large.
//    evenlySpaced(2, 4, 6) → true
//    evenlySpaced(4, 6, 2) → true
//    evenlySpaced(4, 6, 3) → false

    public static boolean evenlySpaced(int a, int b, int c){
        //compare 3 int first and sort it as small, medium, large.
        // retrun true or false depending on the difference between 3 ints.

        ArrayList <Integer> numList = new ArrayList<Integer>();
        numList.add(a);
        numList.add(b);
        numList.add(c);

        Collections.sort(numList);

        int large = numList.get(2);
        int medium = numList.get(1);
        int small = numList.get(0);

        if((large - medium) == (medium - small)){
            return true;
        }

        return false;

    }


}
