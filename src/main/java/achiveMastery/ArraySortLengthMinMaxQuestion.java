package achiveMastery;


import java.util.Arrays;

public class ArraySortLengthMinMaxQuestion {
    public static void main(String args[]) {

        int[] arrayOne = {1, 2, 3, 4, 5}; // return "5 1"
        int[] arrayTwo = {1, 2, -3, 4, 7, 8}; // return "8 -3"
        int[] arrayThree = {1, 9, 3, 4, -5}; // return "9 -5"

        int lengthArrayOne = arrayOne.length;
        System.out.println("Result 1:" + " " + lengthArrayOne);
        int lengthArrayTwo = arrayTwo.length;
        System.out.println("Result 2:" + " " + lengthArrayTwo);
        int lengthArrayThree = arrayThree.length;
        System.out.println("Result 3:" + " " + lengthArrayThree);


        Arrays.sort(arrayOne);
        int minValueArrayOne = arrayOne[0];
        System.out.println("minValue1:" + " " + minValueArrayOne);
        int maxValueArrayOne = arrayOne[arrayOne.length - 1];
        System.out.println("maxValue1:" + " " + maxValueArrayOne);

        Arrays.sort(arrayTwo);
        int minValueArrayTwo = arrayTwo[0];
        System.out.println("minValue2:" + " " + minValueArrayTwo);
        int maxValueArrayTwo = arrayTwo[arrayTwo.length - 1];
        System.out.println("maxValue2:" + " " + maxValueArrayTwo);

        Arrays.sort(arrayThree);
        int minValueArrayThree = arrayThree[0];
        System.out.println("minValue3:" + " " + minValueArrayThree);
        int maxValueArrayThree = arrayThree[arrayThree.length - 1];
        System.out.println("maxValue3:" + " " + maxValueArrayThree);

//how to display results only once? My answer change i=0 to i=5
        for (int i = 0; i < arrayTwo.length; i++) {
            if (arrayTwo[i] < minValueArrayTwo) { //-3
                minValueArrayTwo = arrayTwo[i];
            } else if (arrayTwo[i] > maxValueArrayTwo) {  //8
                maxValueArrayTwo = arrayTwo[i];
            }
        }
        System.out.println("minValue2ViaFor:" + " " + minValueArrayTwo);
        System.out.println("maxValue2ViaFor:" + " " + maxValueArrayTwo);
        System.out.println("maxValue2ViaFor:" + " " + Arrays.stream(arrayTwo).min().getAsInt());
        System.out.println("minValue2ViaFor: " + Arrays.stream(arrayTwo).min());
    }

}

