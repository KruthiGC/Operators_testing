package operators;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class RelationalOperationsTest {
    RelationalOperators op=new RelationalOperators();
    @Test
    void opTest(){
        assertFalse(op.EqualTo(10,15));
        assertTrue(op.EqualTo(10,10));
        assertFalse(op.GreaterThan(10,10));
        assertTrue(op.GreaterThan(15,10));
        assertFalse(op.GreaterThanOrEqual(10,11));
        assertTrue(op.GreaterThanOrEqual(10,10));
        assertFalse(op.SmallerThan(10,10));
        assertTrue(op.SmallerThan(8,10));
        assertFalse(op.SmallerThanOrEqual(15,10));
        assertTrue(op.SmallerThanOrEqual(10,10));
        assertTrue(op.SmallerThanOrEqual(10,15));




    }

}
