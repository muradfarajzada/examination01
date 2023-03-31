import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numEmployees = input.nextInt();

        double[] salaries = new double[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter the salary of employee #" + (i + 1) + ": ");
            salaries[i] = input.nextDouble();
        }

        double maxSalary = salaries[0];
        int maxIndex = 0;
        for (int i = 1; i < numEmployees; i++) {
            if (salaries[i] > maxSalary) {
                maxSalary = salaries[i];
                maxIndex = i;
            }
        }

        System.out.println( "the highest salary is : " + maxSalary);
    }
}
