import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by User on 29.3.2016 г..
 */
public class Pr8_ExtractAllUniqueWords {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\W+");
        Arrays.sort(line);
        System.out.println(Arrays.toString(line));
        Set<String> set = new TreeSet<>();

        for (int i = 0; i < line.length; i++) {
            set.add(line[i]);
        }
        set.stream().forEach(x -> System.out.print(x + " "));
    }

}
