package DataProviderUse;

import org.testng.annotations.DataProvider;

public class TestData {
//firstName lastName MobileNumber
// Viraj1 Gamane 8888888888
// Viraj Gamane 9090908888
//Shyam Gamane 8989898990
	
@DataProvider(name="maleData")	
public String[][] fbMaleData() {
String data[][]= {{"Viraj1","Gamane","8888888888"},{"Viraj","Ghuge","9090908888"},{"Shyam","Gamane1","8989898990"} };	
return data;
}
@DataProvider(name="femaleData")
public String[][] fbFemaleData() {
	
String data[][]= {{"Sonali","Kale","9090898989"},{"Madhuri","Wagh","8484565656"},{"Manjiri","Kulkarni","7878787878"}};
return data;
}



}
