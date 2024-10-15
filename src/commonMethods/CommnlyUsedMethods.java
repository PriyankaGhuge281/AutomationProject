package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CommnlyUsedMethods {

	//Screenshot
	//Excelreading
	//wait
	//scrolling
	
	public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   String timestamp = new SimpleDateFormat("YYYYMMDDhhmmss").format(new Date());
	  File des=new File("C:\\Users\\Shyam Gamane\\eclipse-workspace\\Automation_Selenium2024\\ScreenShot\\"+fileName+timestamp+".png");
	FileHandler.copy(source, des);
	}
	public static String readDataFromExcel(String excelPath,String sheetName, int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
   FileInputStream myFile=new FileInputStream(excelPath) ;
	 String value= WorkbookFactory.create(myFile).getSheet(sheetName).getRow(rowNum) .getCell(cellNum).getStringCellValue();  
	return value;
}
//Create common code for reading proprty file
public static String readDataFromPropertyFile(String key) throws IOException {
	Properties prop=new Properties();
	FileInputStream filename=new FileInputStream(System.getProperty("user.dir")+"\\config2.properities");
	prop.load(filename);
	String data = prop.getProperty(key);
return data;
}

}

	
