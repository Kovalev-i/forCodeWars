import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BigDecimalToStringTest {
    BigDecimalToString bigDecimalToString;

    @Test
    void getCostToSting() {
        bigDecimalToString = new BigDecimalToString();
        assertEquals(bigDecimalToString.getCostToSting(new BigDecimal("23456.9")),
                "двадцать три тысячи четыреста пятьдесят шесть запятая девять");
    }
}