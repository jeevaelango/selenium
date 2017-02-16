package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	public XSSFSheet ExcelWSheet;	 
	public XSSFWorkbook ExcelWBook;
	public XSSFCell Cell;
	
	public void setExcelFile(String Path,String SheetName) throws Exception
	{
		try 
		{
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} 
		catch (Exception e)
		{
			throw (e);
		}
	}

    public String getCellData(int RowNum, int ColNum) throws Exception
	{
		try
		{
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;
		}
		catch (Exception e)
		{
			return"";
		}
	}    
}
