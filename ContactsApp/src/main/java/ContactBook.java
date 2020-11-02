import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public void add() {
        String name = insertName();
        String surname = insertSurnName();
        String phoneNumber = insertPhoneNumber();
        String email = insertEmail();

        contacts.add(new Contact(name, surname, phoneNumber, email));
    }

    private String insertName(){
        System.out.println("Enter name: ");
        return sc.next();
    }

    private String insertSurnName(){
        System.out.println("Enter surname: ");
        return sc.next();
    }

    private String insertPhoneNumber(){
        String phoneNumber;
        boolean validPhoneNumber = false;
        do {
            System.out.println("Enter phoneNumber:");
            phoneNumber = sc.next();

            validPhoneNumber = ValidationLab.validatePhoneNumber(phoneNumber);
            if (!validPhoneNumber) {
                System.out.println("Wrong phone number!");
            }
        } while(!validPhoneNumber);
        return phoneNumber;
    }

    private String insertEmail(){
        String email;
        boolean validEmail = false;
        do {
            System.out.println("Enter email:");
            email = sc.next();

            validEmail = ValidationLab.validateEmail(email);
            if (!validEmail) {
                System.out.println("Wrong email!");
            }
        } while(!validEmail);
        return email;
    }
}
