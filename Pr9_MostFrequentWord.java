import java.util.*;

/**
 * Created by Iliana on 29.03.2016.
 */
public class Pr9_MostFrequentWord {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\W+");


        Map<String, Integer> wordsCount = new TreeMap<String, Integer>();

        for (String word :
                input) {

            Integer count = wordsCount.get(word);

            if (count == null){
                count = 0;
            }

            wordsCount.put(word, count + 1);
        }
        System.out.println(wordsCount);
    }
}
