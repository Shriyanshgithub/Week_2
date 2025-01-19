import java.util.Scanner;

class PalindromeChecker {
    // Attribute
    String text;

    // Construcor to initialze object
    PalindromeChecker(String text) {
        this.text = text;
    }

    // method to check if palindrome
    boolean checkPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // method to display result
    void displayResult(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not palindrome");
        }
    }
}

class Palindrome {
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // get input
        System.out.println("Enter text - ");
        String text = input.nextLine();

        // create object of palindrome checker class
        PalindromeChecker palindrome = new PalindromeChecker(text);

        // check palindrome
        boolean isPalindrome = palindrome.checkPalindrome(text);

        // display result
        palindrome.displayResult(isPalindrome);

        // close scanner
        input.close();
    }
}
