
import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by alexandraqin on 4/14/15.
 */

public class DataStructures
{

    public static void main(String args[])
    {
        ArrayList<Cat> cats = new ArrayList();
        Cat garfield = new Cat("Garfield");
        Cat pinkPanther = new Cat("Pink Panther");
        Cat catwoman = new Cat("Catwoman");
        Cat yamato = new Cat("Yamato");
        Cat tama = new Cat("Tama");

        cats.add(garfield);
        cats.add(pinkPanther);
        cats.add(catwoman);
        cats.add(yamato);
        cats.add(tama);

        for(Cat cat : cats)
        {
            System.out.println(cat.getName());
        }


        ArrayList<Integer> numTest = new ArrayList<Integer>();
        numTest.add(1);
        numTest.add(2);
        numTest.add(3);
        numTest.add(4);
        numTest.add(1);
        numTest.add(2);
        numTest.add(0);
        numTest.add(1);

        System.out.println(mostFrequentElement(numTest));


        ArrayList<String> wordTest = new ArrayList<String>();
        wordTest.add("tomato");
        wordTest.add("apple");
        wordTest.add("tomato");
        wordTest.add("apple");
        wordTest.add("tomato");
        wordTest.add("apple");
        wordTest.add("orange");
        wordTest.add("grapes");

        System.out.println(mostFrequentElementString(wordTest));


        HashMap<String, Integer> podMap = new HashMap<String, Integer>();
        podMap.put("Anthony", 20);
        podMap.put("Luke", 21);
        podMap.put("Joshelyn", 22);
        podMap.put("Raynaldie", 23);
        podMap.put("Vanice", 24);
        podMap.put("Hoshiko", 25);


        for(String name : podMap.keySet())
        {
            System.out.println(name + ", " + podMap.get(name));
        }

        System.out.println(canRentACar(podMap));

        //    wordsWithoutList({"a", "bb", "b", "ccc"}, 1) → {"bb", "ccc"}
        ArrayList <String> testAl = new ArrayList<String>();
        testAl.add("a");
        testAl.add("bb");
        testAl.add("b");
        testAl.add("ccc");

        System.out.println(wordsWithoutList(testAl, 1));

        //    wordsWithoutList({"a", "bb", "b", "ccc"}, 3) → {"a", "bb", "b"}
        System.out.println(wordsWithoutList(testAl, 3));

        //    wordsWithoutList({"a", "bb", "b", "ccc"}, 4) → {"a", "bb", "b", "ccc"}

        System.out.println(wordsWithoutList(testAl, 4));


        //    countClumps({1, 2, 2, 3, 4, 4}) → 2
        ArrayList <Integer> testAlTwo = new ArrayList<Integer>();
        testAlTwo.add(1);
        testAlTwo.add(2);
        testAlTwo.add(2);
        testAlTwo.add(3);
        testAlTwo.add(4);
        testAlTwo.add(4);

        System.out.println("countClumps: "+ countClumps(testAlTwo));

        //    countClumps({1, 1, 2, 1, 1}) → 2
        ArrayList <Integer> testAlThree = new ArrayList<Integer>();
        testAlThree.add(1);
        testAlThree.add(1);
        testAlThree.add(2);
        testAlThree.add(1);
        testAlThree.add(1);

        System.out.println("countClumps 2: "+ countClumps(testAlThree));

        //    countClumps({1, 1, 1, 1, 1}) → 1

        ArrayList <Integer> testAlFour= new ArrayList<Integer>();
        testAlFour.add(1);
        testAlFour.add(1);
        testAlFour.add(1);
        testAlFour.add(1);
        testAlFour.add(1);

        System.out.println("countClumps 2: "+ countClumps(testAlFour));


        sortingSentences("my name is hoshiko oki");
        sortingSentences("How to sort an arraylist of objects java?");
    }

    public static boolean canRentACar(HashMap<String, Integer> hm){
        for (String name : hm.keySet()) {
            if(hm.get(name)>=25){
                break;
            }else{
                return false;
            }
        }
        return true;
    }

    public static String mostFrequentElement(ArrayList<Integer> numberList){
        //put each element to HashMap
        HashMap<Integer, Integer> numberCount= new HashMap<Integer, Integer>();

        for (int i=0; i<numberList.size();i++){

            Integer num = numberList.get(i);
            Integer count = numberCount.get(num);

            if(count ==null){
                //if the number count is 0 because it is the first time to add to HashMap
                // set the letterCount as 1 as value.
                count = 1;
            }else{
                //if there is the count for the number, just add 1 to the letterCount.
                count++;
            }
            numberCount.put(num,count);
         }

        int maxValue= Collections.max(numberCount.values());

        return "the most frequent element in ArrayList is "+ getKeysFromValue(numberCount,maxValue)+" : number of occurrences is "+maxValue;

    }

    public static Integer getKeysFromValue(HashMap <Integer, Integer>hm,Integer value){
        for (Integer o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }


    public static String mostFrequentElementString(ArrayList<String> wordList){
        //put each element to HashMap
        HashMap<String, Integer> wordCount= new HashMap<String, Integer>();

        for (int i=0; i<wordList.size();i++){

            String word = wordList.get(i);
            Integer count = wordCount.get(word);

            if(count ==null){
                //if the number count is 0 because it is the first time to add to HashMap
                // set the letterCount as 1 as value.
                count = 1;
            }else{
                //if there is the count for the number, just add 1 to the letterCount.
                count++;
            }
            wordCount.put(word,count);
        }

        int maxValue= Collections.max(wordCount.values());

        return "the most frequent element in ArrayList is "+ getKeysFromValueString(wordCount,
                                                                                    maxValue)+" : number of occurrences is "+maxValue;

    }

    public static String getKeysFromValueString(HashMap <String, Integer>hm,Integer value){
        for (String o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }


//    5. wordsWithoutList
//    Given an array of strings and an integer, write a method that return
//    a an ArrayList where all the strings of the given length are omitted.
//

    public static ArrayList <String> wordsWithoutList(ArrayList<String> al, int n){
            ArrayList<String> words = new ArrayList<String>();
            for (String word : al){
                if(word.length() == n) {
                }else{
                    words.add(word);
                }
            }
        return words;
    }



//    6. How many clumps?
//    Say that a "clump" in an ArrayList is a series of 2 or more adjacent elements of
//    the same value. Write a method that returns the number of clumps in the given ArrayList.
//    countClumps({1, 2, 2, 3, 4, 4}) → 2
//    countClumps({1, 1, 2, 1, 1}) → 2
//    countClumps({1, 1, 1, 1, 1}) → 1

    public static int countClumps(ArrayList<Integer> al){
       // HashMap<Integer, Integer>hm = new HashMap<Integer, Integer>();
        //ArrayList<Integer> keysOfHm = new ArrayList<Integer>(hm.keySet());

//        for (Integer n : al){
//            int count;
////            count = hm.get(n);
////            System.out.println(n);
//            if(count != null){
//                count++;
//
//            }else{
//                count=1;
//            }
//            hm.put(n, count+1);
//        }
//        System.out.println(hm);
//
//        int clumpCount=0;
//
//        for (int i = 0; i<hm.size();i++){
//            int n2 = hm.get(i);
//            if(n2>=2){
//                clumpCount++;
//            }
//        }
//
//        return clumpCount;

        int clumpCount=0;
        int currentNum;
        int nextNum;
        int pastNum;

            for(int i=0; i< (al.size())-1 ; i++){

                currentNum = al.get(i);
                nextNum = al.get(i+1);

                //System.out.println("currentNum: "+currentNum+" nextNum: "+nextNum);
                if(i>0){
                    pastNum = al.get(i-1);
                    if(pastNum!=currentNum && currentNum==nextNum){

                        if(clumpCount==0){
                            clumpCount =1;
                        }else{
                            clumpCount++;
                        }
                    }
                 }else if (currentNum==nextNum){

                    if(clumpCount==0){
                        clumpCount =1;
                    }else{
                        clumpCount++;
                    }
                }
            }
        return clumpCount;
    }


//    7. Sorting sentences
//    Write a method that takes a String sentence, breaks it up into
//    an ArrayList of Strings (one word per ArrayList element), and
//    prints out the words in alphabetical order.

    public static void sortingSentences(String str){
        ArrayList<String> stringList = new ArrayList<String>();
        Scanner scanner = new Scanner(str.toLowerCase());
        while(scanner.hasNext()) {
            String word = scanner.next();
            stringList.add(word);
        }

        Collections.sort(stringList);

        for(String word:stringList){
            System.out.println(word);
        }

    }
}
