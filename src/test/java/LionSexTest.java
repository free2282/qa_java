import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionSexTest
{

    private final String sex;
    private final boolean expected;

    @Parameterized.Parameters
    public static Object[][] param()
    {
        return new Object[][]
                {
                {"Самец", true},
                {"Самка", false}
                };
    }

    public LionSexTest(String sex, boolean expected)
    {
        this.sex = sex;
        this.expected = expected;
    }

    @Test
    public void sexMultipleTest() throws Exception
    {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);
        var actual = lion.doesHaveMane();

        Assert.assertEquals(actual, expected);
    }
}