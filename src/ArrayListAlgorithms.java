import java.util.ArrayList;
import java.util.Locale;

public class ArrayListAlgorithms {

    /** Returns true if any of the elements in stringList contain
     *  target as a substring; false otherwise.
     *
     *  Does NOT mutate (modify) elements of stringList.
     *  PRECONDITION: stringList.size() > 0
     *
     *  @param stringList  original arraylist of Strings
     *  @return  true if target is found in any of the strings, false otherwise
     */
    public static boolean containsTarget(ArrayList<String> stringList, String target)
    {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains(target)) {
                return true;
            }
        }
        return false;
    }

    /** Returns number of elements in intList that are less than the
     *  average of all elements.
     *
     *  Does NOT mutate (modify) elements of intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the number of ints in intList that are less than the average
     */
    public static int belowAverage(ArrayList<Integer> intList)
    {
        double average;
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < intList.size(); i++) {
            sum = sum + intList.get(i);
        }
        average = sum / intList.size();
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) < average) {
                counter++;
            }
        }
        return counter;
    }

    /** Replaces all words in wordList that end in "s" with the all-uppercase
     *  version of the word.  For example, "apples" should be replaced with "APPLES".
     *  Assume all letters of all words in wordList are lowercase initially (no need
     *  to worry about checking for case or converting first to lowercase)
     *
     *  DOES mutate (modify) elements of wordList.
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  original arraylist of words
     */
    public static void replaceWithCaps(ArrayList<String> wordList)
    {
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).indexOf("S") == wordList.get(i).length()-1) {
                String capitalWord = wordList.get(i).toUpperCase();
                wordList.remove(i);
                wordList.add(capitalWord);
            }
        }
    }



}
