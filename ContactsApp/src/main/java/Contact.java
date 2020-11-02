import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class Contact {
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
}

/*Funkcjonalności:

możliwość dodania kontaktu (imię, nazwisko, email, telefon), wszystkie dane są wymagane.
przed zapisaniem kontaktu powinniśmy sprawdzić czy email oraz telefon są poprawne.
Jeśli nie, to wyświetlamy komunikat "niepoprawny email" lub "niepoprawny nr telefonu".
Sprawdzanie poprawności powinno się odbyć przy użyckiu biblioteki ValidationLib dodanej do projektu przez mavena.
 */