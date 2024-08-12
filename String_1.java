public class String_1 {
    public static void main(String[] args) {
        char a[][] = new char[3][3];

        char k = 'a';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
