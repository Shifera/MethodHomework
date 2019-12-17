
import java.util.Scanner;

public class MethodTeach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String userInput;
        userInput = input.nextLine();
        for (int i = 0; i <= userInput.length() - 1; i++) {
            char c = userInput.charAt(i);
            if (isVowel(c)) {
                System.out.println("The letter is : " + c);
            }
        }
    }

    public static boolean isVowel(char x) {
        if (x == 'a' || x == 'A' || x == 'e' || x == 'E' || x == 'i' || x == 'I' || x == 'o' || x == 'O' || x == 'u' || x == 'U') {

    return true;

}  else
    return false;
    }

}




