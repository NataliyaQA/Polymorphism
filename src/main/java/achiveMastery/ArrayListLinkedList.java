package achiveMastery;

import java.util.*;

public class ArrayListLinkedList {
    public static void main(String[] args) {
//        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
//                21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        List<Integer> myArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> myLinkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

//        myArrayList.remove(15); //remove value 16. Result 1-14, 16-31 with new indexes
//        myLinkedList.remove(14);//remove value 15. High speed than in ArrayList. Result ?
        myArrayList.add(-5);
        myArrayList.stream();

        myArrayList.sort((a, b) -> Integer.compare(a, b)); //Anonymous methods
        myArrayList.forEach(System.out::println);
        System.out.println("*******");
        myLinkedList.add(0, 500);
        myLinkedList.forEach(System.out::println);

    }
}
