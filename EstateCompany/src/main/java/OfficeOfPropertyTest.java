import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OfficeOfPropertyTest {

    OfficeOfProperty officeOfProperty;
    Property property;

    @Test
    public void addProperty(){
        Property p1 = new Property("Willa2");
        officeOfProperty.addProperty(property);

        // when
        int howMany = officeOfProperty.howManyProperties();

        //then
        assertEquals(2,howMany);
    }

    @Test
    public void changePrice(){

        double price = 700;
        officeOfProperty.changePriceOfProperty(600, price);
        assertEquals(property.getPrice(), price);
    }




}
