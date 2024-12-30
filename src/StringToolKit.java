import java.util.Scanner;

public class StringToolKit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1) Reverse A String");
            System.out.println("2) Checking for Palindrome");
            System.out.println("3) Counting vowels and Consonants");
            System.out.println("4) Find SubString");
            System.out.println("5) Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the String");
                    String str = sc.nextLine();
                    System.out.println("Reversed String" + reverseString(str));
                    break;
                case 2:
                    System.out.println("Enter the String");
                    str = sc.nextLine();
                    System.out.println("Palindrome" + palindrome(str));
                    break;
                case 3:
                    System.out.println("Enter the String");
                    str = sc.nextLine();
                    VowelsAndConsonants(str);
                    break;
                case 4:
                    System.out.println("Enter the String");
                    String Mainstr = sc.nextLine();
                    System.out.println("Enter the Substring");
                    String substr = sc.nextLine();
                    System.out.println("SubString Found ");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean palindrome(String str) {
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }

    public static void VowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
            System.out.println("Vowels:" + vowels);
            System.out.println("Consonants:"+consonants);
        }
    }
    public static boolean findSubstring(String mainStr, String subStr) {
        return mainStr.contains(subStr);
    }
}
