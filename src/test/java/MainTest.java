import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MainTest
{
    Main main = new Main();
    @Test
    void additional()
    {
        assertEquals(2, main.add(1 ,1));
    }
}

