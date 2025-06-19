import java.util.Scanner;

public class Q17_BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double heightM = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightM * heightM);
        }
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) and height(cm): ");
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height
        }

        calculateBMI(data);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s%n",
                    i + 1, data[i][0], data[i][1], data[i][2], getStatus(data[i][2]));
        }
    }
}
