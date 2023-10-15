import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest
{
    Feline feline = new Feline();

    @Test
    public void getKittensSingleTest()
    {
        int actual = feline.getKittens();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittens5ValueTest()
    {
        int kittensExpected = 5;
        int kittensActual = feline.getKittens(kittensExpected);

        Assert.assertEquals(kittensExpected, kittensActual);
    }

    @Test
    public void getFamilyTest()
    {
        var actual = feline.getFamily();
        var expected = "Кошачьи";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEatMeatTest() throws Exception
    {
        var actual = feline.eatMeat();
        var expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception
    {

        var actual = feline.eatMeat();
        System.out.println(actual);
        var expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(expected, actual);
    }
}