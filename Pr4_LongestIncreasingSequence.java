import java.util.Scanner;

/**
 * Created by User on 29.3.2016 г..
 */
public class Pr4_LongestIncreasingSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] parameteres = scanner.nextLine().split(" ");
        int counter = 1;
        int maxCounter = 1;
        int index = 0;

        for (int i = 1; i < parameteres.length; i++) {

            if (Integer.parseInt(parameteres[i]) == Integer.parseInt(parameteres[i - 1] + 1)) {
                counter++;

            } else {
                counter = 1;
            }

            if (counter > maxCounter) {
                maxCounter = counter;
                index = i;
            }


        }

        for (int i = 0; i < maxCounter; i++) {
            if (i < maxCounter - 1) {
                System.out.print(parameteres[index] + " ");
            } else {
                System.out.print(parameteres[index]);
            }

        }
    }
}

