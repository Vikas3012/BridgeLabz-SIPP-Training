public class Q27_BonusCalculator {

    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + Math.random() * 90000;
            data[i][1] = (int)(Math.random() * 11);
        }
        return data;
    }

    public static double[][] calculateBonuses(double[][] data) {
        double[][] result = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double bonus = data[i][1] > 5 ? 0.05 : 0.02;
            result[i][0] = data[i][0];
            result[i][1] = data[i][0] * bonus;
            result[i][2] = data[i][0] + result[i][1];
        }
        return result;
    }
}
