import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultipleTest {
    @Test
    public void test() {
        assertEquals(23, new Multiple().getMultiples(10));
    }

}