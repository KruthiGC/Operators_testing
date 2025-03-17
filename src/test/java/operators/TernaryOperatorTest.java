package operators;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TernaryOperatorTest {
    @Test
    void test(){
        assertTrue(TernaryOperator.Equals(10,10));
        assertFalse(TernaryOperator.Equals(10,5));
    }
}
