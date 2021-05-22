package achiveMastery;


public class Miscellaneous {
    public static void main(String[] args) {
        int[] sum = {1, 2, 2};
        int squareSum = 0;
        for (int i : sum) {
            //System.out.println("Current item is: " + i); //return all items from array one by one
            //int squareSum = (int) (Math.pow(i, 2)); //return each number ^2
            squareSum = squareSum + (int) (Math.pow(i, 2)); //return first^2, first^2+second^2, first^2+second^2+third^2
            //squareSum += squareSum; //2 8 8
            System.out.println(squareSum);
        }
    }
}



