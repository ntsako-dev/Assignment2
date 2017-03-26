
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class TestTruth {

    TestTruth myTruth;
    @Before
    public void Arrange() throws Exception {
        myTruth = new TestTruth();

    }

    @After
    public void breakDownWard() throws Exception {


    }

    @Test
    public void testName() throws Exception {

        boolean age = myTruth.myAge();
        Assert.assertTrue("Is it true",age);
    }
}
