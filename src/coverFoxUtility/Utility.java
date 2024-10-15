package coverFoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Utility {
//TakesScreenshot
//Read Data from excel file
//Read data from propertys file
	
	public static void takesScreenshot(WebDriver driver,String fileName) {
	Reporter.log("taking screenshot",true);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
		String timestamp = new SimpleDateFormat("YYYYMMddhhmmss").format(new Date());
		
		File dest=new File(System.getProperty("user.dir")+"\\ScreenShot\\"+fileName+timestamp+".png");
	}
public static String readDataFromExcelFile(String excelPath,String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
FileInputStream myFile=new FileInputStream(excelPath);
String value = WorkbookFactory.create(myFile).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();	
return value;	
}
public static String readDataFromPropertysFile(String key) throws FileNotFoundException {
Properties prop=new Properties();
FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\config2.properities");
String data = prop.getProperty(key);
return data;
}
}
