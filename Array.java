public class Array {
    public static void main(String[] args) {
        int[][] a = new int[3][3];

        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+ " ");            
            }
            System.out.println();
        }
    }
}
