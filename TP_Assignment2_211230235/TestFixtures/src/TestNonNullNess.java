
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class TestNonNullNess {

    TestNonNullNess y;
    @Before
    public void arrange() throws Exception {

        y = new TestNonNullNess();

    }

    @After
    public void breakDownWard() throws Exception {


    }

    @Test
    public void testSurname() throws Exception {

        Assert.assertNotNull(y.intergers());

    }


}
