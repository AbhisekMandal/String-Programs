import java.util.Scanner;

public class SumOfNumberInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int sum = 0;
        for (char c : str.toCharArray()){
            if (Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println("Sum of the  number is: "+sum);
    }
}
