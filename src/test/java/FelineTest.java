import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest
{

    @Mock
    Feline feline;

    @Test
    public void getKittensSingleTest()
    {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittensplentyIntTest()
    {
        int kittens = Mockito.anyInt();
        Mockito.when(feline.getKittens(kittens)).thenReturn(kittens);
        int actual = feline.getKittens(kittens);

        Assert.assertEquals(kittens, actual);
    }

    @Test
    public void getFamilyTest()
    {
        Feline feline = new Feline();
        var actual = feline.getFamily();
        var expected = "Кошачьи";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEatMeatTest() throws Exception
    {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        var actual = feline.eatMeat();
        var expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception
    {
        Feline feline = new Feline();
        var actual = feline.eatMeat();
        var expected = List.of("Животные", "Птицы", "Рыба");

        Assert.assertEquals(expected, actual);
    }
}