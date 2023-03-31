import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("massivin olcusunu daxil edin: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("massivin elementlerini daxik edin: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("en boyuk element " + max + "ve indexi" + maxIndex);
    }
}
