import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 *
 */
public class TestFalse {

    TestFalse notTruth;
    @Before
    public void setUp() throws Exception {
        notTruth  = new TestFalse();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testName() throws Exception {

        boolean irregularity = notTruth.name();

        Assert.assertFalse("Is it false", irregularity);
    }

}
