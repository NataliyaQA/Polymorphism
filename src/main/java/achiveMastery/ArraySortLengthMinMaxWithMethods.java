package achiveMastery;


import java.util.Arrays;

public class ArraySortLengthMinMaxWithMethods {
    public static void main(String[] args) {

        int[] arrayOne = {1, 2, 3, 4, 5}; // return "5 1"
        int[] arrayTwo = {1, 2, -3, 4, 7}; // return "7 -3"
        int[] arrayThree = {1, 9, 3, 4, -5}; // return "9 -5"

        System.out.println("Maximum Value1_1: = " + getMaxValueViaSort(arrayOne));
        System.out.println("Maximum Value1_2: = " + getMaxValueViaSort(arrayTwo));
        System.out.println("Maximum Value1_3: = " + getMaxValueViaSort(arrayThree));

        System.out.println("Min Value1_1: = " + getMinValueViaSort(arrayOne));
        System.out.println("Min Value1_2: = " + getMinValueViaSort(arrayTwo));
        System.out.println("Min Value1_3: = " + getMinValueViaSort(arrayThree));


        System.out.println("Maximum Value2_1: = " + getMaxValue(arrayOne));
        System.out.println("Maximum Value2_2: = " + getMaxValue(arrayTwo));
        System.out.println("Maximum Value2_3: = " + getMaxValue(arrayThree));

        System.out.println("Min Value2_1: = " + getMinValue(arrayOne));
        System.out.println("Min Value2_2: = " + getMinValue(arrayTwo));
        System.out.println("Min Value2_3: = " + getMinValue(arrayThree));
    }

    public static int getMinValueViaSort(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static int getMaxValueViaSort(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];

    }

    public static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
//{1, 2, -3, 4, 7}
    public static int getMinValue(int[] array) {
        int minValue = array[0]; //1
        for (int i = 0; i < array.length; i++) { //i=0; i=1; i=2
            if (array[i] < minValue) { // 1 round: array [0] = 1, minValue = 1 = > false
                                       // 2 round: array [1] = 2, minValue = 1 = > false
                                       // 3 round: array [2] = -3, minValue = 1 = > true

               // minValue = array[i]; // why changing of sequence of arguments changes a result?
                array[i] = minValue;   //
            }
        }
        return minValue;
    }
}

