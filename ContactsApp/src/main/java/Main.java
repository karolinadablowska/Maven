import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int STOP_PROGRAM = 0;
    private static final int ADD = 1;
    private static final int DISPLAY = 2;
    private static final int REMOVE = 3;

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("--------------------------------");
            System.out.println("0 - stop");
            System.out.println("1 - add contact");
            System.out.println("2 - display contacts");
            System.out.println("3 - remove contacts");
            option = sc.nextInt();

            switch (option) {
                case ADD:
                    contactBook.add();
                    break;
                case DISPLAY:
                    System.out.println(contactBook.getContacts());
                    break;
                case REMOVE:
                    contactBook.remove();
                    break;
            }
        } while (option != STOP_PROGRAM);
    }
}
