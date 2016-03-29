import java.util.Scanner;

/**
 * Created by User on 29.3.2016 г..
 */
public class Pr3_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] parameters = input.nextLine().split(" ");
        int counter = 1;
        int maxCounter = 1;
        int index = 0;
        for (int i = 1; i < parameters.length; i++) {
            if (parameters[i].equals(parameters[i - 1])) {
                counter++;

            }else {
                counter = 1;
            }
            if (counter > maxCounter){
                maxCounter = counter;
                index = i;
            }

        }
        for (int i = 0; i < maxCounter; i++) {
            if (i < maxCounter -1 ) {
                System.out.print(parameters[index] + " ");
            }else{
                System.out.print(parameters[index]);
            }

        }
    }
}
