package operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SwapTwoNumbersTest {
    @Test
    void TestSwapWithTemp(){
        int[] afterSwap= SwapTwoNumbers.SwapWithTemp(20,40);

        assertEquals(20,afterSwap[1]);
        assertEquals(40,afterSwap[0]);
    }

    @Test
    void TestSwapWithoutSwap(){
        int [] afterSwap= SwapTwoNumbers.SwapWithoutTemp(20,40);
        assertEquals(40,afterSwap[0]);
        assertEquals(20,afterSwap[1]);
    }
}
