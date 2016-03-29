import java.util.Scanner;

/**
 * Created by User on 29.3.2016 г..
 */
public class Pr5_CountAllWords {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\W+");
        System.out.println(text.length);
    }
}
