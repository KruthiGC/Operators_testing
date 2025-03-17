package operators;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DifferenceBwInstanceAndPrimitiveOperatorTest {
    @Test
    void testCompaPremitive(){
        assertFalse(DifferenceBwInstanceAndPrimitiveOperator.CompaPrimitive(3,5));
        assertTrue(DifferenceBwInstanceAndPrimitiveOperator.CompaPrimitive(5,5));
    }
    @Test
    void testReferenced(){
        test obj1=new test(10);
        test obj2=new test(10);
        test obj3=obj1;
        assertTrue(DifferenceBwInstanceAndPrimitiveOperator.CompaReferenced(obj1,obj3));
        assertFalse(DifferenceBwInstanceAndPrimitiveOperator.CompaReferenced(obj1,obj2));
    }

    @Test
    void testObjVal(){
        test obj1=new test(10);
        test obj2=new test(10);
        test obj3=new test(11);
        assertTrue(DifferenceBwInstanceAndPrimitiveOperator.CompaObjValues(obj1,obj2));
        assertFalse(DifferenceBwInstanceAndPrimitiveOperator.CompaObjValues(obj1,obj3));
    }
}
