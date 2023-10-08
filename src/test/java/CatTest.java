import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest
{
    private final Feline feline = new Feline();
    private final Cat cat = new Cat(feline);

    @Test
    public void getSoundTest()
    {
        String actual = cat.getSound();
        String expected = "Мяу";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception
    {
        var actual = cat.getFood();
        var expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(expected, actual);
    }
}