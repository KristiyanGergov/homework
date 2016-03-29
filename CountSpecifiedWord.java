import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by User on 29.3.2016 г..
 */
public class CountSpecifiedWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\W+");

        Set<String> list = new TreeSet<>();

     //   list.addAll(text);

        for (int i = 1; i < text.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (text[i].equals(text[i - 1])) {
                    System.out.println(text[i]);
                }
            }
        }
    }

}
