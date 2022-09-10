import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTestTest {
    @Test
    public void numberStation() {
        RadioService service = new RadioService(20);

        service.setCurrentNumberStation(15);

        int expected = 15;
        int actual = service.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }
}
