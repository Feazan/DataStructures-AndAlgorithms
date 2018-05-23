import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution for Data Structures and Algorithms 6th edition --
 * Creativity P-1.28
 *
 * A common punishment for school children is to write out a sentence multiple
 * times. Write a Java stand-alone program that will write out the following sentence
 * one hundred times: “I will never spam my friends again.” Your program
 * should number each of the sentences and it should make eight different random looking typos.
 *
 * @author Feazan Yaseen
 */
public class P28
{
    public static void main (String[] args)
    {
        String typo1 = "IWill never spam my friends again.";
        String typo2 = "I will never sapm my friends again.";
        String typo3 = "I will never spam my frien again.";
        String typo4 = "I will neverspam y friends again.";
        String typo5 = "I will neer spam my friends again.";
        String typo6 = "I ill never spam my friends again.";
        String typo7 = "I will spam my friends again.";
        String typo8 = "I will never spam my ends again.";

        List<String> sentences = new ArrayList<>();
        sentences.add(typo1);
        sentences.add(typo2);
        sentences.add(typo3);
        sentences.add(typo4);
        sentences.add(typo5);
        sentences.add(typo6);
        sentences.add(typo7);
        sentences.add(typo8);

        for (int i = 0; i < 92; i++)
        {
            sentences.add("I will never spam my friends again.");
        }

        Collections.shuffle(sentences);

        int i = 1;
        for (String s : sentences)
        {
            System.out.println(i + " " + s);
            i++;
        }

    }
}
