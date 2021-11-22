import org.junit.Test;

//import static org.hamcrest.MatcherAssert.assertThat;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestCSVReaderUtility
{
    @Test
    public void test()
    {
        System.out.println("Sucessfull");
    }

    @Test
    public void readFileLineByLine()
    {
        CSVReaderUtility csvReaderUtility = new CSVReaderUtility();
        int value = csvReaderUtility.readDataLineByLine("C:\\Users\\felipe.elizalde\\Downloads\\covid.csv");
        assertEquals(1,value);
    }
    @Test
    public void readFile()
    {
        CSVReaderUtility csvReaderUtility = new CSVReaderUtility();
        List<String[]> info = csvReaderUtility.readAll("C:\\Users\\felipe.elizalde\\Downloads\\covid.csv");
        assertNotNull(info);
    }
}
