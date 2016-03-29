import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User on 26.3.2016 г..
 */
public class Pr1_SortArrayofNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantityOfNumbers = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = new int[quantityOfNumbers];

        for (int i = 0; i < quantityOfNumbers; i++) {
           numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
