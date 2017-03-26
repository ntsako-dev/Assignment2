import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class TestFailing {

    TestFailing fail;
        @Before
        public void Arrange() throws Exception {
            fail = new TestFailing();
        }

        @After
        public void breakDownWard() throws Exception {

        }

        @Test
        public void TestFailing() throws Exception {

            String answer = fail.name();
            Assert.assertNotSame("Is not the same",answer);

        }
}
