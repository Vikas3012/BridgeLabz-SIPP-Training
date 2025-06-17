import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;

        double[][] salaryAndYears = new double[n][2];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ":");
            double salary = sc.nextDouble();

            System.out.println("Enter years of service for employee " + (i + 1) + ":");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }

            salaryAndYears[i][0] = salary;
            salaryAndYears[i][1] = years;
        }

        for (int i = 0; i < n; i++) {
            double salary = salaryAndYears[i][0];
            double years = salaryAndYears[i][1];

            double currentBonus = (years > 5) ? salary * 0.05 : salary * 0.02;

            bonus[i] = currentBonus;
            newSalary[i] = salary + currentBonus;

            totalBonus += currentBonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee\tOld Salary\tBonus\t\tNew Salary");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", (i + 1), salaryAndYears[i][0], bonus[i], newSalary[i]);
        }

        System.out.println("\nTotal bonus payout: " + String.format("%.2f", totalBonus));
        System.out.println("Total old salary: " + String.format("%.2f", totalOldSalary));
        System.out.println("Total new salary: " + String.format("%.2f", totalNewSalary));

        sc.close();
    }
}
