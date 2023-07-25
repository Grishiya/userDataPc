

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        String confirmPassword = scanner.nextLine();

        try {


            AuthenticationValidator.checkAuthentication(login, password, confirmPassword);
        }catch (WrongPasswordException | WrongLoginException exception){
            System.out.println(exception.getMessage());
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}