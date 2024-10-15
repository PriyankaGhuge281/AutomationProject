package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommanMethods {
//Screenshot
	public static void teakeScreenshot(WebDriver driver,String fileName) {
	
	 String timestamp = new SimpleDateFormat("YYYYYMMDDhhMMss").format(new Date());
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Shyam Gamane\\eclipse-workspace\\Automation_Selenium2024\\ScreenShot\\"+fileName+timestamp+".png");
	}
	//ReadExcel
	public static String readExceldata(String excelPath,String sheetName) throws EncryptedDocumentException, IOException {
	FileInputStream myFile =new FileInputStream(excelPath);
	String value = WorkbookFactory.create(myFile).getSheet(sheetName).getRow(0).getCell(0).getStringCellValue();
		return value;
		
		}
//Scrolling
public static void scrolling(WebDriver driver) {
	 JavascriptExecutor scroll = ((JavascriptExecutor)driver);
    scroll.executeScript("window.scrollBy(0,400)");
}




}
