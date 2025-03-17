package operators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiffbwModAndDivOperatorTest {
    DiffbwModAndDivOperator op=new DiffbwModAndDivOperator();
    @Test
    void getQuotient(){
        Assertions.assertEquals(5,op.getQuotient(100,20));
        Assertions.assertEquals(10,op.getQuotient(100,10));
        Assertions.assertEquals(8,op.getQuotient(64,8));
    }

    @Test
    void getRemainder(){
        Assertions.assertEquals(1,op.getRemainder(11,10));
        Assertions.assertEquals(4,op.getRemainder(19,5));
        Assertions.assertEquals(2,op.getRemainder(35,3));
    }

    @Test
    void testDivideByZero(){
        Exception e=assertThrows(ArithmeticException.class,()->{
            op.getQuotient(10,0);
        });
        System.out.println("Exception message: " + e.getMessage());
        assertEquals("/ by zero",e.getMessage());
    }
}
