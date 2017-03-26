/**
 *
 */
import org.junit.Assert;
import org.junit.Test;

public class TestInteger
{
    TestInteger fg = new TestInteger();

    @Test(timeout =100)
    public void testAdd() throws Exception {


        int var = fg.addIntegers(5,5);

        Assert.assertEquals(10,var);

    }
}
