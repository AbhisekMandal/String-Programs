import java.util.Scanner;

public class NumberOFVowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        int vCount = 0;
        int cCount = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u' ||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'|str.charAt(i)=='U' ){
                vCount++;
            }else {
                cCount++;
            }

        }
        System.out.println("number of vowel in the given string is: "+vCount);
        System.out.println("number of consonant in the given string is: "+cCount);

    }
}
