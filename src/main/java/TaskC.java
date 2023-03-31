import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n qiymetinin deyerini yazin : ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
