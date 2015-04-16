
import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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

}
