package TestProgramme;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("src/test/resources/data/data.xlsx");
      Workbook wb= WorkbookFactory.create(fis);
        Sheet sht = wb.getSheet("data");
        Row rw = sht.getRow(1);
        Cell cl = rw.getCell(1);
        String val = cl.getStringCellValue();
        System.out.println(val);
    }
}
