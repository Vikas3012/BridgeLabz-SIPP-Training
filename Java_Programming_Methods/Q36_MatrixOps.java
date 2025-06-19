import java.util.Random;

class Q36_MatrixOps {
    public static int[][] createRandomMatrix(int r, int c) {
        Random rand = new Random();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) mat[i][j] = rand.nextInt(10);
        return mat;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int r1 = a.length, c1 = a[0].length, c2 = b[0].length;
        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }
}