import java.util.Scanner;

public class Main {

    private static final int STOP_PROGRAM = 0;

    public static void main(String[] args) {

        OfficeOfProperty officeOfProperty = new OfficeOfProperty();
        Property property = new Property("Willa", 500, 500);

        Scanner sc = new Scanner(System.in);

        int option;
        do {
            System.out.println("--------------------------------");
            System.out.println("1 - add property");
            System.out.println("2 - view properties");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    officeOfProperty.addProperty(property);
                    break;
                case 2:
                    officeOfProperty.toString();
                    break;
            }
        }
        while (option != STOP_PROGRAM);


    }



}


