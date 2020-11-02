import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class OfficeOfPropertyTest {

    OfficeOfProperty officeOfProperty = new OfficeOfProperty(5);


    @Test
    public void addProperty(){
        Property p1 = new Property("Willa2");
        officeOfProperty.addProperty(p1);

        // when
        int howMany = officeOfProperty.howManyProperties();

        //then
        assertEquals(1,howMany);
    }

    @Test
    public void changePrice(){
        // when
        Property p1 = new Property("Willa2", 55, 600);
        officeOfProperty.addProperty(p1);

        double price = 700;
        officeOfProperty.changePriceOfProperty(600, price);

        assertEquals(officeOfProperty.getProperties()[0].getPrice(), price);
    }

    @Test
    public void returnNullIfPriceNotExists(){
        // when
        Property p1 = new Property("Willa2", 55, 4234);
        officeOfProperty.addProperty(p1);

        assertNull(officeOfProperty.findPropertyPrice(600));
    }




}
