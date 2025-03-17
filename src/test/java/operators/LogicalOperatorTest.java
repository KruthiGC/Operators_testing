package operators;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogicalOperatorTest {
    @Test
    void testAnd(){
        assertTrue(LogicalOperator.andOperator(true,true));
        assertFalse(LogicalOperator.andOperator(true,false));
        assertFalse(LogicalOperator.andOperator(false,true));
        assertFalse(LogicalOperator.andOperator(false,false));

    }

    @Test
    void testOr(){
        assertTrue(LogicalOperator.orOperator(true,true));
        assertTrue(LogicalOperator.orOperator(true,false));
        assertTrue(LogicalOperator.orOperator(false,true));
        assertFalse(LogicalOperator.orOperator(false,false));
    }
    @Test
    void testNot(){
        assertTrue(LogicalOperator.notOperator(false));
        assertFalse(LogicalOperator.notOperator(true));
    }

    @Test
    void testComplexAnd(){

        assertTrue(LogicalOperator.complexAndOperation(10,10));
        assertFalse(LogicalOperator.complexAndOperation(19,10));
        assertFalse(LogicalOperator.complexAndOperation(10,9));
        assertFalse(LogicalOperator.complexAndOperation(9,10));

    }

    @Test
    void testComplexOr(){

        assertTrue(LogicalOperator.complexOrOperation(10,10));
        assertTrue(LogicalOperator.complexOrOperation(9,10));
        assertFalse(LogicalOperator.complexOrOperation(90,9));
        assertFalse(LogicalOperator.complexOrOperation(101,100));

    }
}
