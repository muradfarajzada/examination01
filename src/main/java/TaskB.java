import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("element daxil edin: ");
            arr[i] = input.nextInt();
        }

        int counter = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                counter++;
            }
        }
        System.out.println("Qonnsunundan boyuk olan elementlerin sayi : " + counter);
    }
}
