import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @AfterAll
    public static void areArraysEqual() {
        feladat1 y = new feladat1();
        int[] expected = y.getArray1();
        int[] actual = y.getArray2();
        assertArrayEquals(expected, actual, "two arrays should be equal");
    }

    @BeforeAll
    public static void createTestList() {
        feladat1 y = new feladat1();
        List<String> list = new ArrayList();
        list.add("hello");
        list.add("world");
        assertEquals(y.getList(), list, "two lists shold be equal");

    }

}
