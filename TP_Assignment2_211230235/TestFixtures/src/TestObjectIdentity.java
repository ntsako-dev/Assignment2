import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

/**
 *
 */
public class TestObjectIdentity {

    TestObjectIdentity myObject;
    @Before
    public void Arrange() throws Exception {

        myObject = new TestObjectIdentity();
    }

    @After
    public void breakDownWard() throws Exception {


    }

    @Test
    public void testName() throws Exception {

        Assert.assertNotSame(myObject.objectA(),myObject.objectB());
    }
}
