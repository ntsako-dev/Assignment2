

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */

public class FloatingPointTest{

    FloatingPointTest  Float;

    @Before
    public void setUp() throws Exception {
        Float  = new FloatingPoint();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddFloats() throws Exception {
        float var = Float.addFloats(6.0f,7.3f);

        Assert.assertEquals(13.300000190734863,var,0.0);

    }
}

