package operators;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IncrementDecrementTest {


    @Test
    void testPostIncrement(){
        int a=5;
        assertEquals(5, IncrementDecrement.postIncrement(5),"Original value mismatch");
    }

    @Test
    void testPreIncrement(){
        int a=5;
        assertEquals(6, IncrementDecrement.preIncrement(a));
    }

    @Test
    void testPostDecrement(){
        int b=5;
        assertEquals(5, IncrementDecrement.postDecrement(b));
    }

    @Test
    void testPreDecrement(){
        int b=5;
        assertEquals(4, IncrementDecrement.preDecrement(b));
    }


}
