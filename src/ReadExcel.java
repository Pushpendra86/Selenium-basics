import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src\\stuy.xlsx");

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sh = wb.getSheetAt(0);  // Accessing the first shee

//            String value = sh.getRow(2).getCell(1).getStringCellValue();
//            System.out.println(value);

            for (int i = 0; i <=sh.getLastRowNum() ; i++) {
                for (int j = 0; j <sh.getRow(i).getLastCellNum() ; j++) {
                    System.out.print(sh.getRow(i).getCell(j).getStringCellValue() + " ");
                }
                System.out.println();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
