import java.util.Scanner;

public class Property {

    /* Napisz program w metodyce TDD (najpierw test potem implementacja)

    Biuro nieruchomości potrzebuje system, który:

    umożliwia przechowywanie nieruchomości (nazwa, powierzchnia, cena) (dodawanie i wyszukiwanie po nazwie)
    umożliwia obliczenie ceny danej nieruchomości po określonej obniżce. (podajemy nazwę nieruchomości oraz
    kwotę obniżki, a otrzymujemy w odpowiedzi kwotę po obniżce)
    */

    private String name;
    private double area;
    private double price;


    public Property(String name, double area, double price) {
        this.name = name;
        this.area = area;
        this.price = price;

    }

    public Property(String name) {
        this.name = name;


    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




    @Override
    public String toString() {
        return "Property{" +
                 ", name='" + name + '\'' +
                ", area=" + area +
                ", price=" + price +
                               '}';
    }
}
