import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {


    WaterBottle bottle = new WaterBottle();

    @Test
    public void startingVolume(){
        assertEquals(100 , bottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        bottle.empty();
        assertEquals(0 , bottle.getVolume());
    }

    @Test
    public void fillBottle(){
        bottle.empty();
        assertEquals(0 , bottle.getVolume());
        bottle.fill();
        assertEquals(100 , bottle.getVolume());
    }

    @Test
    public void drinkBottle(){
        bottle.drink();
        assertEquals(90 , bottle.getVolume());
        bottle.drink();
        assertEquals(80 , bottle.getVolume());
    }

    }



