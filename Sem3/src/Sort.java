import java.util.Arrays;

/*Реализовать алгоритм сортироввки слиянием*/
public class Sort {
    public static void main(String[] args) {
        int[] n = {4, 2, 5, 7, 8, 1, 3, 23, 5, 13, 23, 1, 3, 5, 3, 5, 6};
        System.out.println(Arrays.toString(sortArray(n)));
    }

    public static int[] sortArray(int[] array1) {
        if (array1 == null) {
            return null;
        }
        if (array1.length < 2) {
            return array1;
        }

        int[] array2 = new int[array1.length / 2];
        System.arraycopy(array1, 0, array2, 0, array1.length / 2);

        int[] array3 = new int[array1.length - array2.length];
        System.arraycopy(array1, array2.length, array3, 0, array1.length - array2.length);

        sortArray(array2);
        sortArray(array3);

        mergeArray(array1, array2, array3);

        return array1;
    }

    public static void mergeArray(int[] array1, int[] array2, int[] array3) {

        int position2 = 0;
        int position3 = 0;

        for (int i = 0; i < array1.length; i++) {
            if (position2 == array2.length) {
                array1[i] = array3[position3];
                position3++;
            } else if (position3 == array3.length) {
                array1[i] = array2[position2];
                position2++;
            } else if (array2[position2] < array3[position3]) {
                array1[i] = array2[position2];
                position2++;
            } else {
                array1[i] = array3[position3];
                position3++;
            }
        }
    }
}
