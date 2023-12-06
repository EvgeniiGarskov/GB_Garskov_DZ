import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestHW6 {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[]{5, 7, 9}, new int[]{1, 2, 4, 3, 4, 5, 7, 9}},
                {new int[]{3, 5, 7, 9}, new int[]{4, 5, 7, 9}},
                {new int[]{5, 7, 9}, new int[]{1, 2, 4, 3, 4, 5, 7, 9, 1}},
                {new int[]{5, 7, 9}, new int[]{4, 4, 4, 4, 5, 7, 9}},
        });
    }
    private int[] expected;
    private int[] actual;

    public TestHW6(int[] expected, int[] actual) {
        this.expected = expected;
        this.actual = actual;
    }

    HW6 hw6;

    @Before
    public void init() {
        hw6 = new HW6();
    }

    @Test
    public void massTestHW6() {
        Assert.assertArrayEquals(expected, hw6.checkArr(actual));
    }
//
//    @Test(expected = RuntimeException.class)
//    public void testHW6_2() {
//        Assert.assertArrayEquals(new int[] {3, 5, 7, 9}, hw6.checkArr(new int[]{3, 5, 7, 9}));
//    }
//
//    @Test
//    public void testHW6_3() {
//        Assert.assertArrayEquals(new int[] {5, 7, 9}, hw6.checkArr(new int[]{1, 2, 4, 3, 4, 5, 7, 9, 1}));
//    }
//
//    @Test
//    public void testHW6_4() {
//        Assert.assertArrayEquals(new int[] {5, 7, 9}, hw6.checkArr(new int[]{4, 4, 4, 4, 5, 7, 9}));
//    }
}
