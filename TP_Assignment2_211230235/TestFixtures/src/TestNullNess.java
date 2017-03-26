
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class TestNullNess {

    TestNullNess Wat;

        @Before
        public void setUp() throws Exception {
            Wat = new TestNullNess();
        }

        @After
        public void tearDown() throws Exception {

        }

        @Test
        public void testName() throws Exception {

            String Wendy = Wat.Names();

            Assert.assertNull("Watson",Wendy);

        }
}
