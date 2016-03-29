import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 29.3.2016 г..
 */
public class Pr7_CombineListsofLetters {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String txt1 = scanner.nextLine();
        String result = "";
        char[] first = txt1.replace(" ", "").toCharArray();

        String txt2 = scanner.nextLine();

        char[] second = txt2.replace(" ", "").toCharArray();


        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for (char currChar : first) {
            list1.add(currChar);
            list2.add(currChar);
        }

        for (char currChar :
                second
                ) {

            if (!list2.contains(currChar)) {
                list1.add(currChar);
            }
        }

        for (char currChar :
                list1
                ) {
            result += currChar + " ";

        }
        System.out.println(result.trim());
    }
}
