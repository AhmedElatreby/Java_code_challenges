import java.util.Scanner;

public class PasswordComplexity {

    public static boolean isPasswordComplex(String password) {
        // using regex
        return password.length() >= 6&&
                password.matches(".*\\d.*") && // any digit
                password.matches(".*[a-z].*") && // lowercase a-z
                password.matches(".*[A-Z].*"); // uppercase A-Z


//        if (password.length() < 6) {
//            return false;
//        }
//        boolean hasLowerCaseLetter = false;
//        boolean hasUpperCaseLetter = false;
//        boolean hasNumber = false;
//        for (int i = 0; i < password.length() ||
//                (!hasLowerCaseLetter
//                && ! hasUpperCaseLetter
//                && !hasNumber); i++) {
//            char current = password.charAt(i);
//            if (Character.isDigit(current)) {
//                hasNumber = true;
//            } else if (Character.isUpperCase(current)) {
//                hasLowerCaseLetter = true;
//            } else if (Character.isLowerCase(current)) {
//                hasUpperCaseLetter = true;
//            }
//
//        }
//        return hasNumber && hasLowerCaseLetter && hasUpperCaseLetter;
  }

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a password: ");
       String userInput = scanner.nextLine();
       System.out.println("Is the password complex? " +
               isPasswordComplex(userInput));
    }
}
