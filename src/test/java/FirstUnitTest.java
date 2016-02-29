import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by quan on 22.02.16.
 */
public class FirstUnitTest {


    @Test
    public void testAdd(){
        Mathe mathe = new Mathe();
        Assert.assertEquals(mathe.add(1,1), 2);
    }

    @Test
    public void testAdd2(){
        Mathe mathe = new Mathe();
        Assert.assertNotSame(mathe.add(1,1), 2);

    }

}
