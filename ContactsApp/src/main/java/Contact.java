import java.util.Scanner;

public class Contact {

    private String name;
    private String surname;
    private String phoneNumber;
    private String email;

    public Contact(String name, String surname, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Contact() {
    }

    public void addContact() throws MyException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.next();

        System.out.println("Enter surname: ");
        String surname = sc.next();

        System.out.println("Enter phoneNumber:");
        String phoneNumber = sc.next();

        if(ValidationLab.validatePhoneNumber(phoneNumber) == false) {
            throw new MyException("Wrong phone number!");
        }

        System.out.println("Enter email:");
        String email = sc.next();

        if(ValidationLab.validateEmail(phoneNumber) == true) {
            throw new MyException("Wrong email!");
        }

        Contact contact = new Contact (name, surname, phoneNumber, email);

    }

    public String toString() {
        return name + ", " + surname + ", " + phoneNumber + ", " + email;
    }
}

/*Funkcjonalności:

możliwość dodania kontaktu (imię, nazwisko, email, telefon), wszystkie dane są wymagane.
przed zapisaniem kontaktu powinniśmy sprawdzić czy email oraz telefon są poprawne.
Jeśli nie, to wyświetlamy komunikat "niepoprawny email" lub "niepoprawny nr telefonu".
Sprawdzanie poprawności powinno się odbyć przy użyckiu biblioteki ValidationLib dodanej do projektu przez mavena.
 */