import java.util.regex.Pattern;

public class ValidationLab {



    public static void main (String [] args) {

    boolean answer = validateEmail("karolina.dablowskadd");
    boolean answer2 = validatePhoneNumber("730830893");

        System.out.println(answer);
        System.out.println(answer2);

    }



    static boolean validateEmail(String mail) {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if (pattern.matcher(mail).matches()) {
            return true;
        }
        return false;
    }

    static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^\\d{9}$");
        if (pattern.matcher(phoneNumber).matches()) {
            return true;
        }
        return false;

            }
}
