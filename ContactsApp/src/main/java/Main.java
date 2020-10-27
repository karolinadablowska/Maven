import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    private static final int STOP_PROGRAM = 0;

    public static void main(String[] args) {

        ArrayList<Contact> arrlist = new ArrayList<>();
        arrlist.add(new Contact("ff", "fff", "fff", "gg"));

        Scanner sc = new Scanner(System.in);

        for (Contact contact : arrlist) {
            System.out.println(contact.toString());
        }

        int option;
        do {
            System.out.println("--------------------------------");
            System.out.println("1 - add contact");
            System.out.println("2 - display contacts");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    try {
                        for (Contact contact : arrlist) {
                            contact.addContact();
                        }

                    } catch (MyException myexception) {
                        myexception.printStackTrace();

                        break;
                    }
            }
        }
            while (option != STOP_PROGRAM) ;



    }
}
