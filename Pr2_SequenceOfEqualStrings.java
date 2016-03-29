import java.util.Scanner;

/**
 * Created by User on 26.3.2016 г..
 */
public class Pr2_SequenceOfEqualStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String[] split = input.nextLine().split(" ");

        for (int i = 0; i < split.length - 1; i++) {

            if (split[i].equals(split[i + 1])) {
                System.out.print(split[i] + " ");

            } else {
                System.out.println(split[i]);
            }



        }
        if (split[split.length - 2].equals(split[split.length - 1])) {
            System.out.print(split[split.length - 1]);
        } else {
            System.out.println(split[split.length - 1]);
        }
    }
}

