//Help Received: none
import java.util.*;
public class CombineLists {
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> joined = new ArrayList<>(list1.size() + list2.size());
        joined.addAll(list1);
        joined.addAll(list2);
        return joined;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>(5);
        ArrayList<Integer> list2 = new ArrayList<>(5);
        System.out.print("Enter List 1: ");
        for (int i = 0; i < 5; i++)
            list1.add(sc.nextInt());
        System.out.print("Enter List 2: ");
        for (int i = 0; i < 5; i++)
            list2.add(sc.nextInt());
        System.out.println();
        ArrayList<Integer> joined = union(list1, list2);
        for (int i = 0; i < joined.size(); i++) {
            System.out.print(joined.get(i) + " ");
        }
    }
}
