import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    @Test
    public void shouldGetVolume() {
        RadioService service = new RadioService();
        service.getCurrentVolume();
        int expected = 0;
        int actual = service.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetStation() {
        RadioService service = new RadioService();
        service.getCurrentNumberStation();
        int expected = 0;
        int actual = service.currentNumberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationMin() {
        RadioService service = new RadioService();
        service.setCurrentNumberStation(0);
        int expected = 0;
        int actual = service.currentNumberStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNumberStationMax() {
        RadioService service = new RadioService();
        service.setCurrentNumberStation(9);
        int expected = 9;
        int actual = service.currentNumberStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNumberStation() {
        RadioService service = new RadioService();
        service.setCurrentNumberStation(5);
        int expected = 5;
        int actual = service.currentNumberStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        RadioService service = new RadioService();
        service.increaseVolume(1);
        int expected = 2;
        int actual = service.currentVolume + 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeVolume() {
        RadioService service = new RadioService();
        int currentVolume = 9;
        int actual = service.increaseVolume(currentVolume + 1);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        RadioService service = new RadioService();
        service.setCurrentNumberStation(5);
        service.nextNumberStation();
        int expected = 6;
        int actual = service.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationBordersMax() {
        RadioService service = new RadioService();
        service.setCurrentNumberStation(9);
        service.nextNumberStation();
        int expected = 0;
        int actual = service.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationBorders() {
        RadioService service = new RadioService();
        service.setCurrentNumberStation(8);
        service.nextNumberStation();
        int expected = 9;
        int actual = service.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        RadioService service = new RadioService();
        service.setCurrentNumberStation(5);
        service.prevNumberStation();
        int expected = 4;
        int actual = service.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStationBorders() {
        RadioService service = new RadioService();
        service.setCurrentNumberStation(0);
        service.prevNumberStation();
        int expected = 9;
        int actual = service.getCurrentNumberStation();
        Assertions.assertEquals(expected, actual);
    }
}


