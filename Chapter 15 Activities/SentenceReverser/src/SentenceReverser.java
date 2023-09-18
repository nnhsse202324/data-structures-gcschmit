import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
    	
        // Complete this method. Use a Stack.
        Stack<String> words = new Stack<>();

        while(scanner.hasNext())
        {
            String word = scanner.next();
            words.push(word);
        }

        System.out.println(words);

        String reverseSentence = "";
        while(words.size() > 0)
        {
            reverseSentence += words.pop();
        }
        
        return reverseSentence;






    }
}
