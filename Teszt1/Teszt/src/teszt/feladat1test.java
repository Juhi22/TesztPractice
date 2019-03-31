import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class feladat1test {

    feladat1 x = new feladat1();

    @Test
    public void sumWork () {
        assertEquals(50, x.sum(10, 40), "should be 50");
    }

    @BeforeEach
    public void lessThanTenWork() {
        assertTrue(x.lessThanTen(7), "should be true");
    }

    @Test
    public void greaterThanTenWork() {
        assertFalse(x.lessThanTen(12), "should be false");
    }

    @BeforeAll
    public void areArraysEqual() {
        int[] expected = x.getArray1();
        int[] actual = x.getArray2();
        assertArrayEquals(expected, actual, "two arrays should be equals");
    }

}
