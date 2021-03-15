import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestMainClass {

    private static MainClass stest;

    @BeforeClass
    public static void setup() {
        stest =new MainClass();
    }

    @Test
    //test by varma
    public void test_circle_area() {
        assertEquals(50,stest.circle_area(4));
    }

    @Test
    public void test_rectangle_area() {
        assertEquals(25,stest.rectangle_area(4,5));
    }

    @Test
    public void test_triangle_area() {
        assertEquals(10,stest.triangle_area(4,5));
    }
}