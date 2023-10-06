import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.List;


public class LionTest
{
    @Spy
    private Feline feline = new Feline();

    @Test
    public void getFoodTest() throws Exception
    {
        Lion lion = new Lion(feline, "Самец");
        var actual = lion.getFood();
        var expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKitchenSingleTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        int actual = lion.getKittens();
        int expected = 1;

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