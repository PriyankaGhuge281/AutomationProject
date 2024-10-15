package DataProviderUse;

import org.testng.annotations.DataProvider;

public class TestData1 {
@DataProvider(name="CriketerName")
public String[][] criketerdata() {
String data[][]= {{"Rohit","Sharma","8888888888"},{"Sachin","Tendulkar","9999999989"},{"Kapil","Dev","7878787878"}};
return data;	
}




}





