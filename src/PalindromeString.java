import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine().trim();
        String str1="";
        for (int i = str.length()-1; i >= 0 ; i--) {
            str1 += str.charAt(i);
        }
       /* System.out.println(str1);*/
        if (str.equalsIgnoreCase(str1)){
            System.out.println(str+" is a palindrome string.");

        }
        else {
            System.out.println("Not a palindrome String");
        }

    }
}
