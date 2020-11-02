import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Objects;


@AllArgsConstructor
@ToString
public class Contact {
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) &&
                Objects.equals(surname, contact.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}

/*Funkcjonalności:

możliwość dodania kontaktu (imię, nazwisko, email, telefon), wszystkie dane są wymagane.
przed zapisaniem kontaktu powinniśmy sprawdzić czy email oraz telefon są poprawne.
Jeśli nie, to wyświetlamy komunikat "niepoprawny email" lub "niepoprawny nr telefonu".
Sprawdzanie poprawności powinno się odbyć przy użyckiu biblioteki ValidationLib dodanej do projektu przez mavena.
 */