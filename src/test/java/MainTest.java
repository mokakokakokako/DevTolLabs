import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MainTest
{
    Main main = new Main();
    @Test
    void additional()
    {
        assertEquals(2, main.add(1 ,1));
        assertEquals(4, main.multiply(2 ,2));
        assertEquals(2, main.substract(2 ,0));
        assertEquals(1, main.divide(1 ,1));
    }
}

