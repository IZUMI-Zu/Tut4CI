package SampleCI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCalc {
    @DisplayName("Single test successful")
    @Test
    void testAddSuccessTest() {
        Assertions.assertEquals(5, new Calc().add(2, 3));
    }

    @Test
    void testSubSuccessTest(){
        Assertions.assertEquals(1, new Calc().subtract(3,2));
    }

}
