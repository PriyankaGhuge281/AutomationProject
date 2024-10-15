package propertyFileStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void demo() throws IOException {
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  Properties prop=new Properties();
  FileInputStream myfile=new FileInputStream(System.getProperty("user.dir")+"//config.properties");
  prop.load(myfile);
  String url=prop.getProperty("url");
  System.out.println(url);
  System.out.println(prop.getProperty("name"));
  System.out.println(prop.getProperty("lastName"));
  System.out.println(prop.getProperty("mobile"));
  
  }
}
