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
}
