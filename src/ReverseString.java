import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine().trim().toLowerCase();
        String str1 ="";
        for (int i = str.length()-1; i >=0; i--) {
            str1 += str.charAt(i);
        }
        System.out.println(str1);


    }
}
