package operators;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AssignmentOperatorTest {
    @Test
    void testAdd(){
        assertEquals(14,AssignementOperators.addAssignment(4,10));
        assertEquals(-10,AssignementOperators.addAssignment(10,-20));
        assertEquals(0,AssignementOperators.addAssignment(20,-20));
    }

    @Test
    void testSub(){
        assertEquals(-6,AssignementOperators.subAssignment(4,10));
        assertEquals(30,AssignementOperators.subAssignment(50,20));
        assertEquals(40,AssignementOperators.subAssignment(20,-20));
        assertEquals(0,AssignementOperators.subAssignment(20,20));

    }

    @Test
    void testmultiplication(){
        assertEquals(40,AssignementOperators.multiplyAssignment(4,10));
        assertEquals(1000,AssignementOperators.multiplyAssignment(50,20));
        assertEquals(-400,AssignementOperators.multiplyAssignment(20,-20));
        assertEquals(0,AssignementOperators.multiplyAssignment(20,0));

    }

    @Test
    void testDivide(){
        assertEquals(10,AssignementOperators.divideAssignment(100,10));
        assertEquals(5,AssignementOperators.divideAssignment(25,5));
        assertThrows(ArithmeticException.class,()->AssignementOperators.divideAssignment(10,0));
    }

    @Test
    void testModulo(){
        assertEquals(0,AssignementOperators.moduloAssignment(100,10));
        assertEquals(4,AssignementOperators.moduloAssignment(29,5));
        assertThrows(ArithmeticException.class,()->AssignementOperators.moduloAssignment(10,0));
    }






}
