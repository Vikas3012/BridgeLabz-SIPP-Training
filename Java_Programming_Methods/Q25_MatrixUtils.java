public class Q25_MatrixUtils {

    public static double[][] transpose(double[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        double[][] transposed = new double[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1]) -
               m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0]) +
               m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;
        return new double[][]{
            {m[1][1]/det, -m[0][1]/det},
            {-m[1][0]/det, m[0][0]/det}
        };
    }

    public static void printMatrix(double[][] m) {
        for (double[] row : m) {
            for (double val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
}
