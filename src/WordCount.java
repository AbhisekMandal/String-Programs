import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine();

        String[] words = str.trim().split("\\s+");

        System.out.println("Word Count: " + words.length);

        scanner.close();
    }
}
