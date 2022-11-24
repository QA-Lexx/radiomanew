import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void boundaryValuesStationVolume() {
        Radio radio = new Radio(0, 9, 0, 100);

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void sumValuesStation() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(10, radio.getAmountStation());
    }

    @Test
    public void switchStation() {
        Radio radio = new Radio(1, 0, 1);

        Assertions.assertEquals(1, radio.getNextStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(1, radio.getNextVolume());
    }

    @Test
    public void switchVolume() {
        Radio radio = new Radio(2, 1);

        Assertions.assertEquals(2, radio.getCurrentVolume());
        Assertions.assertEquals(1, radio.getPreviousVolume());
    }
}
