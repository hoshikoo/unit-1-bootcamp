import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {

  public static void main (String args[]) throws FileNotFoundException
  {
    //Use a HashSet to figure out how many unique words are
    // in A Tale of Two Cities and Moby Dick, respectively.


      File mobyDick = new File("/Users/Hoshiko/Desktop/accesscode/unit-1-bootcamp/resources/MobyDick.txt");
      File aTaleOfTwoCities = new File("/Users/Hoshiko/Desktop/accesscode/unit-1-bootcamp/resources/A_Tale_of_Two_Cities.txt");

      try
      {
          System.out.println(wordCountCal(mobyDick));
          System.out.println(wordCountCal(aTaleOfTwoCities));
      }
      catch(FileNotFoundException e)
      {
          e.printStackTrace();
      }

  }

    public static int wordCountCal(File file) throws FileNotFoundException
    {
        HashSet <String> hs = new HashSet();
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String words = sc.next();

                //Clean up the code - your HashSet currently thinks "the." and "the" and "The" are all different words!
                words=words.toLowerCase();
                int wordLength = words.length();
                char lastChar = words.charAt(wordLength - 1);
                if (lastChar=='.'){
                    words = words.substring(0, words.length()-1);
                }

                hs.add(words);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        return hs.size();

    }
}
