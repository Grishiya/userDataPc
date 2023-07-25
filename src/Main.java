

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        String confirmPassword = scanner.nextLine();

        try {


            AuthenticationValidator.checkAuthentication(login, password, confirmPassword);
        }catch (WrongPasswordException exception){
            System.out.println(exception.getMessage());
        }
    }
}