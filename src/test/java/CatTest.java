import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest
{
    @Spy
    private final Feline feline = new Feline();
    @Test
    public void getSoundTest()
    {
        Cat cat = new Cat(feline);

        String actual = cat.getSound();
        String expected = "Мяу";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception
    {
        Cat cat = new Cat(feline);

        var actual = cat.getFood();
        var expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(expected, actual);
    }
}