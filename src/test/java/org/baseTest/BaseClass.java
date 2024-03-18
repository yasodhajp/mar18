package org.baseTest;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.JInternalFrame;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.tool.SchemaCopy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	public JavascriptExecutor js;
	

	public void getDriver(String BrowserName) {
	
	if (BrowserName=="chrome")
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\JunitTest\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if (BrowserName=="edge")
	{
		System.setProperty("webdriver.edge.driver", "F:\\SELENIUM\\JunitTest\\driver\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	else if (BrowserName=="firefox")
	{
		System.setProperty("webdriver.gecko.driver","F:\\SELENIUM\\JunitTest\\driver\\geckodriver.exe" );
		driver = new FirefoxDriver();
	}
	else
	{
		System.out.println("invalid browser");
	}
}


public void getUrl(String url) {
	
	driver.get(url);
}


public void winMax() {
	
	driver.manage().window().maximize();
}


public void textSendByJava(WebElement element, String enterText) {
	element.sendKeys(enterText);
}


public void textByJs(WebElement element1,String textValue) {
	js=(JavascriptExecutor) driver;
	js.executeScript("aruguments[0].setAttribute('value','" +textValue + " ')",element1);
}



public void screenShot(String screenshotName) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File srcFile = ts.getScreenshotAs(OutputType.FILE);
	File destFile = new File("C:\\Users\\sg\\Desktop\\screenshot\\"+screenshotName +".jpeg");
	FileUtils.copyFile(srcFile,destFile);
}

public void scrollByUs(WebElement element2,String scroll) {

	switch (scroll) {
	case "scrollup":
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element2);
		break;
	case "scrolldown":
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element2);
	    break;
	
	default:
		System.out.println("invalid comments");
		break;
	}
	}
public String getTextbyjava(WebElement element3) {
	String text = element3.getText();
	return text;
}

public String getAttributebyJava(WebElement element4) {
	String attribute = element4.getAttribute("value");
	return attribute;

}
public Object getAttributeByJs(WebElement element5) {
	Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element5);
	return executeScript;
}
public void actions(WebElement targetElemnt, String whichAction) {

	Actions act = new Actions(driver);

	switch (whichAction) {
	case "Hover":
		act.moveToElement(targetElemnt).build().perform();
		break;

	case "Double":
		act.doubleClick(targetElemnt).build().perform();
		break;

	case "Right":
		act.contextClick(targetElemnt).build().perform();
		break;

	default:
		System.out.println("In-valid_Comment");
		break;
	}
}
public void windowshandling(int index) {
	String parentid = driver.getWindowHandle();
	Set<String> allwindowsid = driver.getWindowHandles();
	List<String> li = new LinkedList<String>();
	li.addAll(allwindowsid);
	String requiredwindow = li.get(index);
	driver.switchTo().window(requiredwindow);
	
}
public String readExcel(int rownum, int cellnum) throws IOException {

	// To Locate the File
	File file = new File("F:\\filetest\\neww.xlsx");

	// To get File as Input Datas to filed
	FileInputStream stream = new FileInputStream(file); // throws FileNotFoundException

	// To Define Workbook type
	Workbook book = new XSSFWorkbook(stream);// throws IOException

	// To get sheet from Workbook
	Sheet sheet = book.getSheet("credentials");

	Row row = sheet.getRow(rownum);

	Cell cell = row.getCell(cellnum);

	CellType cellType = cell.getCellType();

	String value = null;

	switch (cellType) {
	case STRING:
		value = cell.getStringCellValue();
		break;
	case NUMERIC:
		if (DateUtil.isCellDateFormatted(cell)) {

			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
			value = simple.format(dateCellValue);

		} else {

			double numericCellValue = cell.getNumericCellValue();
			BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
			value = valueOf.toString();

		}
		break;

	default:
		System.out.println("In-Valid - Cell-Type");
		break;
	}
	

return value;
}

public void writeexcel(int rownum, int cellnum,String mail) throws IOException {
	
	
	File file = new File("F:\\filetest\\neww.xlsx");
	
	Workbook book = new XSSFWorkbook();
	
    Sheet createSheet = book.createSheet("credentials");
    
    Row createRow = createSheet.createRow(rownum);
    
    Cell createCell = createRow.createCell(cellnum);
    
    createCell.setCellValue(mail);
    
    FileOutputStream out = new FileOutputStream(file);
    
    book.write(out);
}



public void SelectbyValue(WebElement element,String value)
{

 Select s = new Select(element);
   s.selectByValue(value);
}



public void SelectbyText(WebElement element,String text)
{
	Select s = new Select(element);
	s.selectByVisibleText(text);
	

}
}