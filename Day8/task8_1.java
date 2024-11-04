import java.util.Arrays;

public class task8_1 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        fillArrayAsButterfly(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static void fillArrayAsButterfly(int[][] array) {
        for (int i = 0; i <= array.length / 2; i++) {
            for (int j = 0; j <= array[i].length / 2; j++) {
                if (j < i) {
                    array[i][j] = 0; //текущий
                    array[array.length - i - 1][j] = 0;
                    array[i][array[i].length - j - 1] = 0;
                    array[array.length - i - 1][array[i].length - j - 1] = 0;
                } else {
                    array[i][j] = 1;
                    array[array.length - i - 1][j] = 1;
                    array[i][array[i].length - j - 1] = 1;
                    array[array.length - i - 1][array[i].length - j - 1] = 1;
                }
            }
        }
    }
}
