import lombok.Getter;

import java.util.Arrays;
import java.util.Scanner;

@Getter
public class OfficeOfProperty {
    private int iterator = 0;
    private Property[] properties;

    public OfficeOfProperty(int propertySize) {
        this.properties = new Property[propertySize];
    }

    public void addProperty(Property property) {
        properties[iterator++] = property;
    }

    public Property insertProperty() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.next();

        System.out.println("Enter area: ");
        double area = sc.nextDouble();

        System.out.println("Enter price:");
        double price = sc.nextDouble();

        return new Property(name, area, price);
    }

    public int howManyProperties() {
        return iterator;
    }

    public Property findProperty() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.next();

        for (int i = 0; i < properties.length && properties[i] != null; i++) {
            if (properties[i].getName().equals(name)) {
                return properties[i];
            }
        }
        return null;
    }

    public void changePriceOfProperty(double presentPrice, double newPrice) {
        Property property = findPropertyPrice(presentPrice);
        property.setPrice(newPrice);
    }

    public Property findPropertyPrice(double price) {
        for (int i = 0; i < properties.length && properties[i] != null; i++) {
            if (properties[i].getPrice() == price) {
                return properties[i];
            }
        }
        return null;
    }

    public double calculateOfReduce(String name, double reduce) {
        double calculation = 0;
        for (int i = 0; i < properties.length && properties[i] != null; i++) {
            calculation = (properties[i].getPrice() * reduce);
        }
        return calculation;
    }

    @Override
    public String toString() {
        return "OfficeOfProperty{" +
                "iterator=" + iterator +
                ", properties=" + Arrays.toString(properties) +
                '}';
    }
}
