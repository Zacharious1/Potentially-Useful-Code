//Help Received: none
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        removeDuplicates(list);
        System.out.println();
        for (Integer aList : list) {
            System.out.println(aList);
        }
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        int largestNum = list.get(0);
        for (Integer aList : list)
            if (largestNum < aList)
                largestNum = aList;

        for (int j = 0; j < largestNum; j++) {
            int a = list.indexOf(j);
            if (list.indexOf(j) != list.lastIndexOf(j)) {
                list.remove(a);
                j = 0;
            }
        }
    }
}