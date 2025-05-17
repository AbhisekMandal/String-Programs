import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine().toLowerCase();
        System.out.println("Enter the character to found: ");
        char target = sc.next().charAt(0);
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)){
                count++;
            }
        }
        System.out.println("Character '" + target + "' occurs " + count + " times.");

    }
}
