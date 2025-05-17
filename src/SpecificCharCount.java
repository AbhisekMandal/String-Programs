import java.util.Scanner;

public class SpecificCharCount {
    public static void main(String[] args) {
        String str = "Programming";
        int specificChar = str.toLowerCase().length() - str.toLowerCase().replace("p","").length();
        System.out.println("g: "+ specificChar);

    }
}
