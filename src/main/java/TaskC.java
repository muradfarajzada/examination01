import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n qiymetinin deyerini yazin : ");
        int n = input.nextInt();

        for (int i = 0;i<n; i++){
            for (int j= 0; j<n-i;j++){
                System.out.println("*");
            }
            System.out.println();
        }

        for(int i =0; i<n; i++){
            for (int j = 0;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
