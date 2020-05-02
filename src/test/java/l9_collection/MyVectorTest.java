package l9_collection;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyVectorTest {
    public MyVectorTest() {
        this.vector = new MyVector();
        System.out.println("Constr");
    }

    MyVector vector;

    @BeforeClass
    public static void setupAll() {
        System.out.println("All");
    }

    @Before
    public void setup() {
        System.out.println("In setup");
        vector = new MyVector();
    }

    @After
    public void tearDown() {
        System.out.println("In tear down");
    }

    @Ignore
    @Test
    public void size() {
        assertTrue("Incorrect size", vector.size() == 0);
        System.out.println(1);
    }

    @Test
    @Ignore
    public void sizeNotEmpty() {
        vector.add(new Object());
        assertTrue("Incorrect size", vector.size() == 3);
        System.out.println(2);
    }

//    @Test(expected = IOException.class)
    public void sizeNotEmpty1() {
        assertTrue("Incorrect size", vector.size() == 1);
    }
}