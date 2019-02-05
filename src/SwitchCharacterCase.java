import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Character;
import java.util.List;

public class SwitchCharacterCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Character> List = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = Character.toLowerCase(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                ch = Character.toUpperCase(ch);
            }
            List.add(ch);
        }
        System.out.println(List);
    }
}
