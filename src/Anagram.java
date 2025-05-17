import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1 = sc.nextLine().trim().toLowerCase();
        String str2 = sc.nextLine().trim().toLowerCase();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.toString(ch1).equals(Arrays.toString(ch2))){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not a anagram");
        }

    }
}
