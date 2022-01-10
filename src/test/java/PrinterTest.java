import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
    printer = new Printer(100, 100);}

    @Test
    public void startingVolume(){
        assertEquals(100 , printer.getToner());
    }

    @Test
    public void startingPaper(){
        assertEquals(100 , printer.getPaper());
    }

    @Test
    public void print10(){
        printer.print(10,1);
        assertEquals(90, printer.getPaper());
        assertEquals(90, printer.getToner());
    }

    @Test
    public void print20(){
        printer.print(10, 2);
        assertEquals(80, printer.getPaper());
        assertEquals(80, printer.getToner());
    }

}
