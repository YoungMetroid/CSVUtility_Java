import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.util.List;

public class CSVReaderUtility
{
    public int readDataLineByLine(String file)
    {
        try
        {
            FileReader fileReader = new FileReader(file);
            CSVReader csvReader = new CSVReader(fileReader);
            String[] nextRecord;

            while((nextRecord = csvReader.readNext()) != null)
            {
                for(String cell : nextRecord)
                {
                    //System.out.println(cell + "\t");
                }
                System.out.println();
            }
            return 1;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return 0;
    }
    public List<String[]> readAll(String file)
    {
        try
        {
            FileReader fileReader = new FileReader(file);
            CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();

            List<String[]> allData = csvReader.readAll();
            return allData;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
}
