import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest
{
    @Mock
    Feline feline;
    @Test
    public void getFoodTest() throws Exception
    {
        Lion lion = new Lion(feline, "Самец");
        var expected = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);

        var actual = lion.getFood();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKitchenSingleTest() throws Exception
    {
        Lion lion = new Lion(feline, "Самец");
        int expected = 1;

        Mockito.when(feline.getKittens()).thenReturn(expected);

        int actual = lion.getKittens();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void maleErrorTest()
    {
        Exception exception = Assert.assertThrows(Exception.class, () ->
        {
            new Lion(feline,"Оно");
        });

        String expectedMessage = "Используйте допустимые значения пола животного - самей или самка";
        String actualMessage = exception.getMessage();

        Assert.assertEquals(expectedMessage, actualMessage);
    }
}