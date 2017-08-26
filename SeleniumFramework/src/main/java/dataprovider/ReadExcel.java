package dataprovider;
import org.testng.annotations.DataProvider;
import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


public class ReadExcel extends AbstractClassDataProvider{

	@DataProvider(name="fetchdataexcelcreateLead")
	public static Object[][] readExcel(String filename) throws InvalidFormatException, IOException
	{
		File src= new File("./data/"+filename+".xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(src);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount= sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();
		Object[][] dataset= new Object[rowcount+1][columncount];
		for(int i=0;i<=rowcount;i++)
		{
			XSSFRow row= sheet.getRow(i);
			for(int j=0;j<columncount;j++)
			{
				XSSFCell cell= row.getCell(j);
				int celltype=cell.getCellType();
				try{					
					if (celltype==0){
					dataset[i][j]=cell.getNumericCellValue();
					}
					else if(celltype==1){
						dataset[i][j]=cell.getStringCellValue();
					}
				}
				catch(Exception e)
				{
				}
				
			}
		}
		return dataset;
	}

}
