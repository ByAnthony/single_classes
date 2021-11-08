import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 500);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(500, printer.getToner());
    }

    @Test
    public void canPrint(){
        printer.print(5, 2);
        printer.print(10, 3);
        assertEquals(60, printer.getPaper());
        assertEquals(460, printer.getToner());
    }

}
