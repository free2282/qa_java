import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest
{
    @Mock
    Feline feline;
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
        var expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expected);

        var actual = cat.getFood();

        Assert.assertEquals(expected, actual);
    }
}