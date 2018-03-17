package IntroToJava;

import java.util.Scanner;

public class PasswordValidator
{
    public static boolean validatePassword(char [] input)
    {
        boolean valid = true;
        for (int i = 0; i < input.length; i++)
        {
            if (input.length >= 6
                    && Character.isDigit(input[i])
                    && Character.isUpperCase(input[0])
                    && !(Character.isWhitespace(input[i])))

                valid = true;
            else valid = false;
        }
        return valid;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your new password and press Enter:");
        char[] input = scanner.nextLine().toCharArray();

        if (validatePassword(input))
            System.out.println("Valid password");
        else System.out.println("Invalid password");
    }

}
