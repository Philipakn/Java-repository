import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    int[] arr = new int[15];

    public static void main(String[] args) {

        Main obj = new Main();
        int[] arr2 = new int[15];
        arr2 = obj.input();
        obj.randomize(arr2);

    }

    int[] input() {

        Scanner input = new Scanner(System.in);
        int num;

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter numbers:  ");
            num = input.nextInt();
            arr[i] = num;
        }

        for (int i = 0; i <= arr.length - 1; i++) {

            System.out.print(arr[i] + "     ");
        }
        return arr;
    }

    void randomize(int[] input) {

        int output;
        System.out.println(" ");
        System.out.println("Random numbers: ");

        for (int i = 0; i <= 6; i++) {

            System.out.print(input[index] + "  ");
        }

    }

    void ran() {
        int[] ran = new int [6];
        int index;
        int min = 0;
        int max = 14;

        while(ran[5] == 0){



        }

    }

}
