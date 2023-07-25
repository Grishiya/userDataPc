
import java.util.regex.Pattern;

public class AuthenticationValidator {




    private static final Pattern REGEX = Pattern.compile("^[A-Za-z0-9_]{5,20}$");
    public static void checkAuthentication(String login,String password,String confirmPassword)
            throws Exception {
        checkLogin(login);
        checkPassword(password);
        checkConfirmPassword(password,confirmPassword);

    }

    private static void checkLogin(String login) {
        if (!login.matches(REGEX.pattern())){
            throw new WrongLoginException ("В логин можно вводить, только латинские символы ,цифры " +
                    "и нижнее подчеркивание,а так же должен содержать от 5 до 20 символов включительно");
        }
    }

    private static void checkPassword(String password) throws WrongPasswordException{
        if (!password.matches(REGEX.pattern())) {
            throw new WrongPasswordException("В пароль можно вводить, только латинские символы ,цифры " +
                    "и нижнее подчеркивание,а так же должен содержать от 5 до 20 символов включительно");
        }
    }
    private static void checkConfirmPassword(String password,String confirmPassword)throws Exception{
        if (!password.equals(confirmPassword)){
            throw new Exception("Пароль и повторный пароль не совпада" +
                    "ют");

        }

    }
}
