
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class TestObjectEquality {

    private TestObjectEquality Wat;

    @Before
    public void Arrange() throws Exception {
        Wat = new TestObjectEquality();
    }

    @After
    public void breakDownWard() throws Exception {

    }

    @Test
    public void testObjects(){
        String var = Wat.toString();
        //String hisName = Wat.name2();

      //  Assert.assertEquals(var,hisName);

    }

}
