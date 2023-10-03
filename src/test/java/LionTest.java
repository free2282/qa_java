import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class LionTest
{
    private final Feline feline = new Feline();
    private final Lion lion = new Lion(feline, "Самец");
    public LionTest() throws Exception
    {
    }

    @Test
    public void getFoodTest() throws Exception
    {
        var actual = lion.getFood();
        var expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKitchenSingleTest()
    {
        int actual = lion.getKittens();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sexErrorTest()
    {
        try
        {
            new Lion(feline,"Не выбрано");
        }
        catch (Exception e)
        {
            String actual = e.getMessage();
            String expected = "Используйте допустимые значения пола животного - самей или самка";
            Assert.assertTrue(actual.contains(expected));
        }
    }
}