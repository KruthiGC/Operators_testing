package operators;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArithmeticOperatorsTest {
    @Test
    void testAddition(){
        assertEquals(20,ArithmeticOperators.add(14,6));
    }

    @Test
    void testSubtraction(){
        assertEquals(8,ArithmeticOperators.diff(14,6));
    }

    @Test
    void testProduct(){
        assertEquals(84,ArithmeticOperators.mul(14,6));
    }

    @Test
    void testQuotient(){
        assertEquals(2.33,ArithmeticOperators.div(14,6),0.1);
    }



}
