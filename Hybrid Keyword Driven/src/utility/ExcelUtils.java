
package utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	public static XSSFSheet s1;
    public static XSSFWorkbook wb;
    public static XSSFCell Cell;
    
    public static void setExcelFile(String Path,String SheetName) throws Exception 
    {
        FileInputStream ExcelFile = new FileInputStream(Path);
        
        wb = new XSSFWorkbook(ExcelFile);
        
        s1 = wb.getSheet(SheetName);
    }
 
    
    public static String getCellData(int RowNum, int ColNum) throws Exception
    {
  	  	Cell = s1.getRow(RowNum).getCell(ColNum);
  	  	
        String CellData = Cell.getStringCellValue();
        
		return CellData;
		
  	}
    
    public static int getRowCount()
    {
    	int row=s1.getLastRowNum();
    	
		return row;
    }
    
}